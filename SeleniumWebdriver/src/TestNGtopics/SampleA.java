package TestNGtopics;

import org.testng.annotations.Test;

public class SampleA {

	@Test
	public void method1()
	{
		System.out.println("outer  class");
	}
	
	public class SampleOuter {

		@Test
		public void method2()
		{
			System.out.println("inner  class");
		}
		
		
	}

	
}
