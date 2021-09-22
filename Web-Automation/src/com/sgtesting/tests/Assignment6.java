package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 { 
		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			createCustomer();
			createProject();
			 modifyProject();
			deleteProject();
			deletecustomer();
			 logout();
			 closeApplication();
		}
		static void launchBrowser()
		{
			try {
				  System.setProperty("webdriver.chrome.driver","E:\\SampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			      oBrowser=new ChromeDriver();	
		        }catch(Exception e)
			{
		        	e.printStackTrace();
			}
		}
		static void navigate()
		{
			try 
			{
				oBrowser.get("http://localhost:82/login.do");
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void createCustomer()
		{
			try 
			{
			  oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			  Thread.sleep(2000);	
			  oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("mahesh");
			  oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			  Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}  
		static void createProject()
		{
			try 
			{
			  oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			  Thread.sleep(2000);	
			  oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Shersha");
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']")).click();
			  Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
		static void modifyProject()
		{
			try 
			{
		   	  oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			  Thread.sleep(2000);
      		  oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[1]")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).clear();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).sendKeys("Kargil1");
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[1]")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[1]")).click();
			  Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
		static void deleteProject()
		{
			try 
			{
			  oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		  	  Thread.sleep(2000);
		  	  oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		      Thread.sleep(2000);
		  	  oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
		   	  Thread.sleep(2000);
		   	  oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
		   	  Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}   
		static void deletecustomer()
		{
			try 
			{
				oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")).click();
		  	  Thread.sleep(2000);
		  	  oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		    	  Thread.sleep(2000);
		  	  oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
		    	  Thread.sleep(2000);
		    	  oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
		   	  Thread.sleep(2000);
		   	  oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
		   	  Thread.sleep(2000);
		 	  		
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}   
	    static void logout()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	    static void closeApplication()
		{
			try 
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	    
	}
