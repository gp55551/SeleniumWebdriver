package SelenumRelated;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class junitPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void display()
	{
		System.out.println("first junit");
	}

	@Before
	public void beforeTest()

	{
		System.out.println("before test");
	}
	@BeforeClass
	public static void beforeClass()

	{
		System.out.println("before class");
	}
	
	@After
	public void afterTest()

	{
		System.out.println("after test");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("after class");
	}
	
	
}
