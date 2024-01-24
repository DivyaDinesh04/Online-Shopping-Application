package com.PracticeMaven;

import org.testng.annotations.Test;

public class PracticeTest {

	@Test(groups = "smoke")
	public void practice1Test()
	{
		System.out.println(" practice1 ");
	}

	@Test(groups ={"smoke","regression"})
	public void practice2Test()
	{
		System.out.println(" practice2 ");
	}
}
