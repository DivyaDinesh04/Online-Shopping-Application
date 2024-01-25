package com.PracticeMaven;

import org.testng.annotations.Test;

public class ProductManageTest {
	
	@Test(groups= {"smoke","gegression"})
	public void demo3Test()
	{
		System.out.println("---d3----");
	}

	@Test(groups="smoke")
	public void demo4Test()
	{
		System.out.println("---d4--");
		System.out.println("---added new product manager--");
	}


}
