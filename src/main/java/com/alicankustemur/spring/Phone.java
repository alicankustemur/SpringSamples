package com.alicankustemur.spring;

public class Phone
{
	public String	brand;
	public String	model;
	public int		modelYear;

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public int getModelYear()
	{
		return modelYear;
	}

	public void setModelYear(int modelYear)
	{
		this.modelYear = modelYear;
	}

	@Override
	public String toString()
	{
		return "Phone [brand=" + brand + ", model=" + model + ", modelYear=" + modelYear + "]";
	}

	public void foo()
	{
		System.out.println(true);
	}

}
