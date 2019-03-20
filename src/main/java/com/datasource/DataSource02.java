package com.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com.datasource
 * @Author: yang
 * @CreateTime: 2019-03-19 15:12
 * @Description: ${Description}
 */

@Configuration
@MapperScan(basePackages = "com.test2.mapper",sqlSessionFactoryRef="test2SqlSessionFactory")
public class DataSource02 {


    /**
     * @return 返回test2数据库的数据源
     */
    @Bean(name = "test2DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.test2")
    public DataSource dateSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * @return 返回test2数据库的会话工厂
     */
    @Bean(name = "test2SqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("test2DataSource") DataSource ds) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(ds);

        return bean.getObject();
    }

    /**
     * @return 返回test2数据库的事务
     */
    @Bean(name = "test2TransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("test2DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * @return 返回test1数据库的会话模版
     */
    @Bean(name = "test2SqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(
            @Qualifier("test2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

