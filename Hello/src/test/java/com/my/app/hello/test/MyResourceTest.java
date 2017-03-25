package com.my.app.hello.test;

import org.junit.Assert;
import org.junit.Test;

import com.my.app.Hello.MyResource;

public class MyResourceTest 
{
	 
	@Test
	public void testTest1()
	{
		MyResource myResource=new MyResource();
		
		Integer i1=myResource.test1();
		
		Assert.assertNotNull(i1);
		
	}
	
	@Test
	public void testTest2()
	{
		MyResource myResource=new MyResource();
		Integer i2=myResource.test2();
		
		Assert.assertNotNull(i2);
		
	}
	

}
