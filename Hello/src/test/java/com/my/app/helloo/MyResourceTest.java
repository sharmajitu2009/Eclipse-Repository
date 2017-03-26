package com.my.app.helloo;

import org.junit.Assert;
import org.junit.Test;

public class MyResourceTest 
{
	@Test
	public void getIt()
	{
		MyResource myResource=new MyResource();
		
		String s1=myResource.getIt();
		
		Assert.assertNotNull(s1);
	}
	
	@Test
	public void getIt2()
	{
		MyResource myResource=new MyResource();
		
		String s2=myResource.getIt1();
		
		Assert.assertNotNull(s2);
	}


}
