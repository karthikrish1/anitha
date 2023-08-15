package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 * before test  : run only once before all the test cases started ts execution
	 * after test   : run only once after all the test cases finished its execution
	 * 
	 * 
	 * before class: run only once after before test
	 * after class:  run only once before after test 
	 *  
	 * before method: run before each test case
	 * after method: run after each test case 
	 * 
	 *  before test: website visiting
	 *    before class: maximising 
	 *    before method : refresh   tc1: gettitle   aftermethpd: deleting cookies
	 *    before method : refresh  tc2  : click     aftermethod: deleting cookies
	 *    after class: get url
	 *  after test : closing 
	 * * 
	 * */
	ChromeDriver ob;
	@BeforeClass
	public void btc()
	{
		System.out.println("before class ");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class ");
		System.out.println(ob.getCurrentUrl());
	}
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case 1");
		System.out.println(ob.getTitle());
	}
	
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	    //classname objectnmae= new classname();
			 ob= new ChromeDriver();
	     ob.get("http://www.mycontactform.com");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test ");
		ob.quit();
	}
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("Test case 2");
		ob.findElementByLinkText("Help").click();
	}
	
	@BeforeMethod
	public void btm()
	{
		System.out.println("before method ");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void atm()
	{
		System.out.println("after method ");
		ob.manage().deleteAllCookies();
	}

}
