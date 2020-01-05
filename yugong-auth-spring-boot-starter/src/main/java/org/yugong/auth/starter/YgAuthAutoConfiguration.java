package org.yugong.auth.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.yugong.auth.client.YgAuthService;
import org.yugong.auth.client.YgAuthServiceDubboImpl;
import org.yugong.auth.client.YgSecurityExpressionHandler;

/**
 * @author 小天
 * @date 2020/1/5 0:22
 */
@ConditionalOnProperty(value = "yg.auth.enable", havingValue = "true")
@Import({YgAuthJdbcProviderAutoConfiguration.class})
@Configuration
public class YgAuthAutoConfiguration {

    @Bean
    public YgSecurityExpressionHandler ygSecurityExpressionHandler() {
        return new YgSecurityExpressionHandler();
    }

    @ConditionalOnProperty(value = "yg.auth.provider-dubbo-enable", havingValue = "true")
    @Bean
    public YgAuthService ygAuthServiceDubboImpl() {
        return new YgAuthServiceDubboImpl();
    }

}
