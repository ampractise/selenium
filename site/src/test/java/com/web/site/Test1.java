package com.web.site;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test1 {
  @Test
  public void f() {
	  System.out.println("This is first test 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("------------------------------------");
	  System.out.println("This is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
	  System.out.println("------------------------------------");
  }

}
