package com.alicankustemur.spring;

import java.sql.Connection;

public class DBSingleton
{
	private static final DBSingleton instance = new DBSingleton();

	private DBSingleton()
	{

	}

	public static final DBSingleton getInstance()
	{
		return instance;
	}

	public Connection getConnection()
	{
		return null;
	}

}
