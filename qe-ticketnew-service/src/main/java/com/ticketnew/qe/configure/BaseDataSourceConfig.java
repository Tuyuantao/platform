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
@MapperScan(sqlSessionFactoryRef = "baseDataSqlSessionFactory",basePackages = "com.ticketnew.qe.mapper.basedata")
public class BaseDataSourceConfig {

    private final static Logger logger = LoggerFactory.getLogger(BaseDataSourceConfig.class);

    @Bean
    @ConfigurationProperties(prefix = "spring.basedata")
    public DataSource baseDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "baseDataSqlSessionFactory")
    public SqlSessionFactory accountSqlSessionFactory() throws Exception {
        logger.info("init mybatis ticketnew-basedata sql session factory");
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(baseDataSource());
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resourcePatternResolver.getResources("/mapper/basedata/*mapper.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);
        return sqlSessionFactoryBean.getObject();
    }
}
