package org.yugong.auth.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.yugong.auth.client.YgAuthenticationFailureHandler;
import org.yugong.auth.client.YgAuthenticationSuccessHandler;
import org.yugong.auth.client.YgLogoutSuccessHandler;
import org.yugong.auth.client.YgSecurityExpressionHandler;

import javax.annotation.Resource;

/**
 * @author 小天
 * @date 2019/12/19 22:22
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

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

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/favicon.ico", "/static/**");
    }
}
