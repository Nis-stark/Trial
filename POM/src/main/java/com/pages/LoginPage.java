package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;


public class LoginPage extends LoadableComponent<LoginPage> {

	
	WebDriver driver;
	
	@FindBy(name="email")
	private WebElement emailTxtBox;
	
	@FindBy(name="password")
	private WebElement passwordTxtbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='alert alert-danger loading wow fadeIn animated animated']")
private WebElement messageelement;
	public LoginPage (WebDriver driver)
	
	{
		this.driver= driver;
		
	}
	
	public void loginAsAdmin(String email, String password)
	{
		emailTxtBox.clear();
		passwordTxtbox.clear();
		
		emailTxtBox.sendKeys(email);
		passwordTxtbox.sendKeys(password);
		loginBtn.click();
		
		
	} 
			public String getMessage()
				{
					return messageelement.getText();		
				}
				
				public String getPageTitle()
				{
					return driver.getTitle();
				}

				@Override
				protected void load() {
					driver.get("http://www.phptravels.net/admin");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					// TODO Auto-generated method stub
					
				}

				@Override
				protected void isLoaded() throws Error {
					// TODO Auto-generated method stub
					
				String url = driver.getCurrentUrl();
				Assert.assertTrue(url.startsWith("http://www.phptravels.net/admin"),"Some error!");
				} 
			 

	
	
}
