# yugong-auth
权限管理系统


# 依赖
+ spring
+ springboot
+ apache dubbo
+ apache curator
+ slf4j
+ log4j2

# 开发
## 模块划分

| 模块 | 说明 |
| ------ | ------ |
| yugong-auth-api | api 接口定义模块 |
| yugong-auth-client | 客户端集成模块 |
| yugong-auth-console | 控制台模块 & 提供 rpc 调用 |
| yugong-auth-dependency-management | 依赖管理 |
| yugong-auth-spring-boot-starter | 提供 springboot 集成 |

## 生成 mybatis 代码
运行 `org.yugong.auth.MainMyBatisGenerator#main() ` 方法，即可在 `yugong-auth-console` 中生成 mybatis 代码。

## 编译打包
```shell script
mvn clean package install
```

# 使用
## 引入依赖
```xml
<dependency>
    <artifactId>yugong-auth-spring-boot-starter</artifactId>
    <groupId>org.yugong</groupId>
    <version>${yugong-auth.version}</version>
</dependency>
```

## 创建表
目前仅支持 `mysql` 数据库。

| 表 | 说明 |
| ------ | ------ |
| sec_application | 应用程序信息表 |
| sec_authority | 权限信息表 |
| sec_group | 组定义表 |
| sec_group_authority | 组拥有的权限表 |
| sec_role | 角色定义表 |
| sec_role_authority | 角色拥有的权限表 |
| sec_user | 用户信息表 |
| sec_user_authority | 用户拥有的权限 |
| sec_user_group | 用户所属组 |
| sec_user_role | 用户拥有的角色 |

## 部署 yugong-auth-console 服务
部署 yugong-auth-console 服务

## 配置
```properties
# 启用权限服务
yg.auth.enable=true

#### 使用本地 jdbc 提供器 ####
# 使用本地 jdbc 提供器时，需要创建 mysql 数据库，并创建相关的表

# 启用本地 jdbc 提供器。需要提供 DataSource
yg.auth.provider-jdbc-enable=true
# 启用内置 mybatis。如果本地已有 mybatis，可忽略该项
yg.auth.provider-jdbc-mybatis-embed-enable=true

#### 使用基于 dubbo 的 rpc 提供器 ####
# 使用 rpc 提供器时，需要部署 yugong-auth-console 服务
yg.auth.provider-dubbo-enable=true

```

## Spring Security 配置
```java
    @Resource
    private YgSecurityExpressionHandler securityExpressionHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .expressionHandler(securityExpressionHandler)
                // 允许特定角色访问
                .antMatchers("/admin/user/**", "/ajax/admin/user/**").hasRole("admin")
                // 允许任何人访问
                .antMatchers("/error").permitAll()
                // 允许所有已登录的用户访问
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login.htm")
                .loginProcessingUrl("/login.htm")
                .usernameParameter("account")
                .passwordParameter("password")
                .failureHandler(new YgAuthenticationFailureHandler("/login.htm?error"))
                .successHandler(new YgAuthenticationSuccessHandler("/loginSuccess.htm", "/admin/index.htm"))
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout.htm")
                .logoutSuccessHandler(new YgLogoutSuccessHandler("/index.htm"))
                .permitAll()
                .and().csrf().disable();
    }
```

# License
Copyright (c) 小天. All rights reserved.

Licensed under the [Apache 2.0 license](https://www.apache.org/licenses/LICENSE-2.0.html) license.
