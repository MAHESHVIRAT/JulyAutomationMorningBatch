package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ActiPage2 {

	
		WebDriver driver;
//		@FindBy(how=How.NAME,using="username")
//		WebElement Username;
		@FindBy(name="username")
		WebElement Username;
		@FindBy(name="pwd")
		WebElement Password;
		@FindBy(how=How.LINK_TEXT,using="Login")
		WebElement Login;
		@FindBy(how=How.ID,using="gettingStartedShortcutsPanelId")
		WebElement minimize;
		@FindBy(how=How.ID,using="logoutLink") 
		WebElement logout;
		@FindBy(how=How.XPATH,using="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
		WebElement createuser;
		@FindBy(how=How.XPATH,using="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")
		WebElement addnew;
		
			
		 ActiPage2(WebDriver d)
		 {
//			 this.driver=driver;
			 driver=d;
			 PageFactory.initElements(d, this);
		 }
		 public void clickusername( String uname)
		 {
			 Username.sendKeys(uname);;
		 }
		 public void clickpassword(String pwd)
		 {
			 Password.sendKeys(pwd);
		 }
		 public void clicklogin()
		 {
			 Login.click();
		 }
		 public void minimize()
		 {
			 minimize.click();
		 }
		 public void createuser()
		 {
			 createuser.click();
		 }
		 public void addnew()
		 {
			 addnew.click();
		 }
		 public void logout()
		 {
			 logout.click();
		 }
		

	}


