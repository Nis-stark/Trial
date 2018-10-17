package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Dashboard;
import com.pages.LoginPage;
import com.utility.DriverUtility;

public class PHPtravelTest {

	
	WebDriver driver;
	LoginPage lp;
	Dashboard dp;
	
	@BeforeTest
	public void openTheApplication() {
		
		driver = DriverUtility.initializeDriver("chrome");
		
		
		lp = PageFactory.initElements(driver,LoginPage.class);
		dp= PageFactory.initElements(driver, Dashboard.class);
		
		
	}
	
	@AfterTest
	public void closeTheApplication()
	{
		driver.close();
		lp = null;
		dp= null;
		
	}
	
	@Test(priority=0)
	public void validAdminTest() throws InterruptedException {
		lp.get();
		lp.loginAsAdmin("admin@phptravels.com", "demoadmin");
		Thread.sleep(10000);
		Assert.assertEquals(dp.getPageTitle(),"Dashboard");
		
		dp.loginOutAsAdmin();
		Thread.sleep(10000);
		Assert.assertEquals(lp.getPageTitle(),"Administator Login");
		
	}
	@Test(priority=2)
public void validemailaddress() throws InterruptedException {
		
		lp.loginAsAdmin("admin", "demoadmin");
		Thread.sleep(10000);
		Assert.assertEquals(lp.getPageTitle(),"LoginPage");
		
		dp.loginOutAsAdmin();
		Thread.sleep(10000);
		Assert.assertEquals(lp.getPageTitle(),"enter a valid email");
		
}}
