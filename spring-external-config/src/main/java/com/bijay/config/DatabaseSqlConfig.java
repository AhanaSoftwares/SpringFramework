package com.bijay.config;

public class DatabaseSqlConfig {
	private String databaseUrl ;
	 private String databaseUserName ;
	 private String databasePassword ;
	
	
	public String getDatabaseUrl() {
		return databaseUrl;
	}

	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}

	public String getDatabaseUserName() {
		return databaseUserName;
	}

	public void setDatabaseUserName(String databaseUserName) {
		this.databaseUserName = databaseUserName;
	}

	public String getDatabasePassword() {
		return databasePassword;
	}

	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}
	
	 @Override
	    public String toString() {
	        return "::SQL Database Config Details:: \n[Database Url=" + databaseUrl + "]\n"+"[Database Url=" + databaseUserName + "] \n" + "[Database Url=" + databasePassword + "]";
	    }
	

}
