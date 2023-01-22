package TestNGtopics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {
  @Test(priority=4)
  public void test2() {
	  
	  System.out.println("Test2");
  }
  
  @Test(priority=3)
  public void test1() {
	  
	  System.out.println("Test1");
  }
  @Test(priority=1, groups ="wdw")
  public void test3() {
	  
	  System.out.println("Test1");
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("before test");
  }
  
  @AfterTest
  public void afterTest()
  {
	  System.out.println("after test");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("before method");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("after method");
  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("before class");
  }
  @AfterClass
  public void afterClass()
  {
	  System.out.println("after class");
  }
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("before Suite");
  }
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("after suite");
  }
  
  @BeforeGroups
  public void beforeGroup()
  {
	  System.out.println("beforeGroup");
  }
  @AfterGroups
  public void afterGroup()
  {
	  System.out.println("AfterGroup");
  }
}
