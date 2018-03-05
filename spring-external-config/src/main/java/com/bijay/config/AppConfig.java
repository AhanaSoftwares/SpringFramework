package com.bijay.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.bijay")
@PropertySources({
    @PropertySource("config.properties"),
    @PropertySource("sql.config.properties")
})
public class AppConfig {
	
	@Autowired
	private Environment env; 
	
	@Value("${jdbc.oracle.url}")
	private String url;

	//hello
	@Value("${jdbc.oracle.dbse.username}")
	private String username;
	
	@Value("${jdbc.oracle.dbse.password}")
	private String password;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	@Bean(name="oracleConfig")
	public DatabaseConfig getOracleDatabaseConfig() {
		DatabaseConfig oracleDBConfig = new DatabaseConfig();
		oracleDBConfig.setDatabaseUrl(url);
		oracleDBConfig.setDatabaseUserName(username);
		oracleDBConfig.setDatabasePassword(password);
		return oracleDBConfig;
	}
	@Bean(name="sqlConfig")
	public DatabaseSqlConfig getSqlDatabaseConfig() {
		DatabaseSqlConfig sqlDBConfig = new DatabaseSqlConfig();
		String url = env.getProperty("jdbc.sql.url");
		String username = env.getProperty("jdbc.sql.dbse.username");
		String password = env.getProperty("jdbc.sql.dbse.password");
		sqlDBConfig.setDatabaseUrl(url);
		sqlDBConfig.setDatabaseUserName(username);
		sqlDBConfig.setDatabasePassword(password);
		return sqlDBConfig;
	}
	
	

}
