package com.PracticeMaven;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(groups = "smoke")
	public void demo1Test()
	{
		System.out.println(" demo1 ");
	}

	@Test(groups ={"smoke","regression"})
	public void demo2Test()
	{
		System.out.println(" demo2 ");
	}
	
	@Test
	public void demo3Test()
	{
		System.out.println("deom3 need to be executed");
		System.out.println("check for conflict");
	}
}
