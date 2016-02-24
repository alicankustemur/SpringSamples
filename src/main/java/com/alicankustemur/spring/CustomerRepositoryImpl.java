package com.alicankustemur.spring;

public class CustomerRepositoryImpl implements CustomerRepository
{

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
