package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {
 
static WebDriver driver;
 
public static WebDriver initializeDriver(String browserName)
{
if(browserName.equalsIgnoreCase("Chrome"))
{
System.getProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4a.03.28\\Desktop\\chromedriver.exe");
driver = new ChromeDriver();
}
else if(browserName.equalsIgnoreCase("IE"))
{
System.getProperty("webdriver.ie.driver", "C:\\Users\\A07208trng_b4a.03.28\\Desktop\\WorkspaceHM\\IEDriverServer.exe");
driver = new InternetExplorerDriver();
}
else if(browserName.equalsIgnoreCase("Firefox"))
{
System.getProperty("webdriver.gecko.driver", "C:\\Users\\A07208trng_b4a.03.28\\Desktop\\WorkspaceHM\\geckodriver.exe");
driver = new FirefoxDriver();
}
else
{
System.out.println("Browser not configured yet.");
}
 
return driver;
}
 

}