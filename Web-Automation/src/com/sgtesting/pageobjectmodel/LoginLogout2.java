package com.sgtesting.pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout2 {
    @Test
	public void login()
	{
	 System.setProperty("webdriver.chrome.driver", "E:\\SampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");	
     WebDriver driver=new ChromeDriver();
     ActiPage2 Apage=new ActiPage2(driver);
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.get("http://localhost:82/login.do");
     
     Apage.clickusername("admin");
     Apage.clickpassword("manager");
     Apage.clicklogin();
     Apage.minimize();
     Apage.createuser();
     Apage.logout();
     
   
	}

}
