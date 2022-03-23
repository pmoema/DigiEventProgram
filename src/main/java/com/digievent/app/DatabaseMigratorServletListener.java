package com.digievent.app;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import liquibase.integration.spring.SpringLiquibase;
import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;

@Configuration
public class DatabaseMigratorServletListener {

	@Autowired
	private Environment environment;

//	catalogue datasource
	@Bean(name = "digiEventProgram")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource catalogueDataSource() throws NamingException {
		
		try {
			Context envCtx = new InitialContext();

			DataSource dataSource = (DataSource) envCtx.lookup(environment.getProperty("spring.datasource.jndi-name"));
			
			return dataSource;
		}catch (Exception e) {
			//
		}

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
		ds.setUrl(environment.getProperty("spring.datasource.url"));
		ds.setUsername(environment.getProperty("spring.datasource.username"));
		ds.setPassword(environment.getProperty("spring.datasource.password"));

		return ds;

	}

	@Bean
	public SpringLiquibase liquibase() throws NamingException {
		SpringLiquibase liquibase = new SpringLiquibase();
		liquibase.setChangeLog("classpath:dbchangelog/changelog.xml");
		liquibase.setDataSource(catalogueDataSource());
		return liquibase;
	}


	@Bean
	public LockProvider lockProvider(DataSource dataSource) {

		return new JdbcTemplateLockProvider(dataSource);
	}


}
