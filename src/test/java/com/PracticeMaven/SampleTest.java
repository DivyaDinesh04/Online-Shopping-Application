package com.PracticeMaven;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(groups = "smoke")
	public void sample1Test()
	{
		System.out.println(" sample1 ");
	}

	@Test(groups = "regression")
	public void sample2Test()
	{
		System.out.println(" sample2 ");
	}

}
