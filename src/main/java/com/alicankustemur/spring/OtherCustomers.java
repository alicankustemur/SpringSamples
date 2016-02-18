package com.alicankustemur.spring;

public class OtherCustomers
{
	public String	name;
	public Phone	phone;

	public OtherCustomers(String name, Phone phone)
	{
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString()
	{
		return "OtherCustomers [name=" + name + ", phone=" + phone + "]";
	}

}
