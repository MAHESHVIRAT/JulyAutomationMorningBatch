package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertwithOKCancelButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\SampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver ();
	     driver.get("http://demo.automationtesting.in/Alerts.html");
	     //alert with OK Cancel button link
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	     //alert with OK Cancel button 
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
	     
	 
	     String ExpText="Press a Button !";
	     
	     
	     driver.switchTo().alert().accept();
	     
	     String ActText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
	      Thread.sleep(4000);
	     if(ExpText.equals(ActText)==true)
	     {
	    	 System.out.println("test is passed");
	     }
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
	     Thread.sleep(4000);
	     String ExpTextCancel="You Pressed Cancel";
	     
	     driver.switchTo().alert().dismiss();
	     
	     if(ExpTextCancel.equals(ActText)==true)
	     {
	    	 System.out.println("test is passed");
	     }
	 
	
	}

}
