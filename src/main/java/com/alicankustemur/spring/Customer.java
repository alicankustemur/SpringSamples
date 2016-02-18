package com.alicankustemur.spring;

public class Customer
{
	public String name;

	public Customer(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Customer [name=" + name + "]";
	}

}
