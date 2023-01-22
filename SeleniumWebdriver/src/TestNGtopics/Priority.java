package TestNGtopics;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=0)
	public void method1() throws Exception
	{
		System.out.println("Priority_method1");
		//throw new Exception("Gaurav");
	}
	
	@Test(priority=1)
	public void method2()
	{
		System.out.println("Priority_method2");
	}
	
	@Test(priority=-1)
	public void method3()
	{
		System.out.println("Priority_method3");
	}

	@Test
	public void method4()
	{
		System.out.println("Priority_method4");
	}
	
	
	
	
}
