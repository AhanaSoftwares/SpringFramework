package com.bijay.config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		 DatabaseConfig oracleDb = (DatabaseConfig)context.getBean("oracleConfig");
		 DatabaseSqlConfig sqlDb = (DatabaseSqlConfig)context.getBean("sqlConfig");
		 System.out.println(oracleDb.toString());
		 System.out.println(sqlDb.toString());
	}

}
