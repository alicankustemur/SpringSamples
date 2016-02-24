package com.alicankustemur.spring.annotation;

public class CustomerRepositoryImpl implements CustomerRepository
{

	public CustomerRepositoryImpl()
	{

	}

	public Customer getCustomerByName(String name)
	{
		return new Customer(name);
	}

	public void save(Customer customer)
	{

	}

	public void init()
	{
		System.out.println("init");
	}

}
