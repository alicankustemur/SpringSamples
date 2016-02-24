package com.alicankustemur.spring;

public interface CustomerRepository
{
	public Customer getCustomerByName(String name);

	public void save(Customer customer);
}
