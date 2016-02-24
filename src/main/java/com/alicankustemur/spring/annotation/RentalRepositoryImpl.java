package com.alicankustemur.spring.annotation;

import javax.annotation.PreDestroy;

public class RentalRepositoryImpl implements RentalRepository
{

	public void save(Rental rental)
	{
		rental.setRented(true);
	}

	@PreDestroy
	public void releaseResources()
	{
		System.out.println("releaseResources() called");
	}

}
