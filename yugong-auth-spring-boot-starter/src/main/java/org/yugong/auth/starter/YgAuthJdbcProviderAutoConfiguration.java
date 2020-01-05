package org.yugong.auth.starter;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.yugong.auth.client.YgAuthService;
import org.yugong.auth.client.YgAuthServiceJdbcImpl;
import org.yugong.auth.client.mapper.YgAuthMapper;

import javax.sql.DataSource;

/**
 * @author 小天
 * @date 2020/1/5 1:21
 */
@ConditionalOnProperty(value = "yg.auth.provider-jdbc-enable", havingValue = "true")
public class YgAuthJdbcProviderAutoConfiguration {

    @Bean
    public YgAuthService ygAuthServiceJdbcImpl(SqlSessionFactory sqlSessionFactory) {
        return new YgAuthServiceJdbcImpl(sqlSessionFactory);
    }

    @ConditionalOnProperty(value = "yg.auth.provider-jdbc-mybatis-embed-enable", havingValue = "true")
    @Bean("ygAuthSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) {
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("ygAuthDefaultEnv", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(YgAuthMapper.class);
        return new SqlSessionFactoryBuilder().build(configuration);
    }
}
