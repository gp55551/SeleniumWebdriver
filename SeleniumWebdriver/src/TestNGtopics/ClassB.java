package TestNGtopics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ClassB extends ClassA {

	
	@Test
	public void method1()
	{
		System.out.println("B_method1");
	}
	/*@Parameters({"name"})*/
	@Test
	public void method2()
	{
		System.out.println("B_method2");
		//System.out.println(name);

	}
	@Test
	public void method0()
	{
		System.out.println("BCCC_method1");
	}
}
