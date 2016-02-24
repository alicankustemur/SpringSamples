package com.alicankustemur.spring.annotation;

import org.springframework.beans.factory.FactoryBean;

public class CustomerRepositoryFactoryBean implements FactoryBean<CustomerRepository>
{

	public CustomerRepository getNewInstance()
	{
		return new CustomerRepositoryImpl();
	}

	// it create a object of defined class.
	public CustomerRepository getObject() throws Exception
	{
		return new CustomerRepositoryImpl();
	}

	// which class will use to create an object?
	public Class<?> getObjectType()
	{
		return CustomerRepository.class;
	}

	// if value is true it generated a singleton object
	// else a new object to every request
	public boolean isSingleton()
	{
		return true;
	}

}
