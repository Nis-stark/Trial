package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {
	
	WebDriver driver;
	
	
	@FindBy (xpath="//a[contains(text(),'Log Out')]")
	private WebElement logOutlink;
	
	
	 public Dashboard(WebDriver driver)
	 {
		 this.driver = driver;	 
		
	 }
	 
		 public void loginOutAsAdmin()
		 	{
		 		logOutlink.click();	
		 	}
		 	
		 	public String getPageTitle()
		 	{
		 		return driver.getTitle();
		 	} 
		  

}
