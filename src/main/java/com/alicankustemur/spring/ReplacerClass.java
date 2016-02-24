package com.alicankustemur.spring;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReplacerClass implements MethodReplacer
{

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable
	{
		// args[0] doA() methodunda yer alan parametredir.
		String input = (String)args[0];
		return "Before : " + input + " \nAfter : Replaced.";
	}

}
