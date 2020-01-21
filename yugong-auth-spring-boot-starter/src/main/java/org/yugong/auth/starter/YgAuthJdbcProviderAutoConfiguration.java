package org.yugong.auth.starter;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.yugong.auth.client.YgAuthService;
import org.yugong.auth.client.YgAuthServiceJdbcImpl;
import org.yugong.auth.client.mapper.YgAuthMapper;

/**
 * 使用基于 jdbc 的权限系统支持。依赖 mybatis-spring-boot-starter
 *
 * @author 小天
 * @date 2020/1/5 1:21
 */
@ConditionalOnProperty(value = "yg.auth.provider-jdbc-enable", havingValue = "true")
@ConditionalOnClass({MybatisAutoConfiguration.class})
@AutoConfigureAfter({MybatisAutoConfiguration.class})
public class YgAuthJdbcProviderAutoConfiguration {

    @Bean
    public ConfigurationCustomizer mybatisConfigurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                configuration.addMapper(YgAuthMapper.class);
            }
        };
    }

    @Bean
    public YgAuthService ygAuthServiceJdbcImpl(SqlSessionFactory sqlSessionFactory) {
        return new YgAuthServiceJdbcImpl(sqlSessionFactory);
    }
}
