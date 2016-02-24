package com.alicankustemur.spring;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class OracleDataSource implements DataSource
{
	private Properties dbConfiguration;

	public Properties getDbConfiguration()
	{
		return dbConfiguration;
	}

	public void setDbConfiguration(Properties dbConfiguration)
	{
		this.dbConfiguration = dbConfiguration;
	}

	public PrintWriter getLogWriter() throws SQLException
	{
		// VTODO Auto-generated method stub
		return null;
	}

	public int getLoginTimeout() throws SQLException
	{
		// VTODO Auto-generated method stub
		return 0;
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException
	{
		// VTODO Auto-generated method stub
		return null;
	}

	public void setLogWriter(PrintWriter arg0) throws SQLException
	{
		// VTODO Auto-generated method stub

	}

	public void setLoginTimeout(int arg0) throws SQLException
	{
		// VTODO Auto-generated method stub

	}

	public boolean isWrapperFor(Class<?> arg0) throws SQLException
	{
		// VTODO Auto-generated method stub
		return false;
	}

	public <T> T unwrap(Class<T> arg0) throws SQLException
	{
		// VTODO Auto-generated method stub
		return null;
	}

	public Connection getConnection() throws SQLException
	{
		// VTODO Auto-generated method stub
		return null;
	}

	public Connection getConnection(String username, String password) throws SQLException
	{
		// VTODO Auto-generated method stub
		return null;
	}

}
