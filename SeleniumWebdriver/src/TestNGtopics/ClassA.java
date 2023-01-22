package TestNGtopics;

import org.testng.annotations.Test;

public class ClassA {

	
	@Test(invocationCount=1)
	public void method1()
	{
		System.out.println("method1");
	}
	@Test
	public void method2()
	{
		System.out.println("method2");
	}
	@Test
	public void method5()
	{
		System.out.println("method5");
	}
	@Test
	public void method6()
	{
		System.out.println("method6");
	}
}
