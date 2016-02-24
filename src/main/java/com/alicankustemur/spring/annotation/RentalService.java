package com.alicankustemur.spring.annotation;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public interface RentalService
{

	public Rental rentACar(String customerName, Car car, Date begin, Date end);

}
