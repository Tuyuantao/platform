package com.ticketnew.qe.configure;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/7/13
 */
@Configuration
@MapperScan(sqlSessionFactoryRef = "accountSqlSessionFactory",basePackages = "com.ticketnew.qe.mapper.account")
public class AccountDataSourceConfig {

    private final static Logger logger = LoggerFactory.getLogger(AccountDataSourceConfig.class);

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.account")
    public DataSource accountDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "accountSqlSessionFactory")
    public SqlSessionFactory accountSqlSessionFactory() throws Exception {
        logger.info("init mybatis ticketnew-account sql session factory");
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(accountDataSource());
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resourcePatternResolver.getResources("/mapper/account/*mapper.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);
        return sqlSessionFactoryBean.getObject();
    }
}
