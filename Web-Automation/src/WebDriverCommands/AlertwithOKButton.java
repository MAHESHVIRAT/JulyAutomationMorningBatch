package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertwithOKButton {

	public static void main(String[] args)  {
		 System.setProperty("webdriver.gecko.driver","E:\\SampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver ();
	     driver.get("http://demo.automationtesting.in/Alerts.html");

	     //Alert box with OK button example
	     
       //  alert with OK link
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();

	     //	     alert with OK button
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
	       
	     //switch to alert box
	      System.out.println (driver.switchTo().alert().getText());
	     driver.switchTo().alert().accept();//ok button clicked and close the alert
	
	
	}

}
