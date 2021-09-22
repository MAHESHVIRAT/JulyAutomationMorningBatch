package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertwithTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\SampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver ();
	     driver.get("http://demo.automationtesting.in/Alerts.html");
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	     
//	     fisrtime click
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
	     
	     driver.switchTo().alert().sendKeys("testing");
	     
	     driver.switchTo().alert().accept();
	     
	     String ExpString="Hello Automation Testing user How are you today";
	     
	     String ActString=driver.findElement(By.xpath("//*[@id=\'demo1\']")).getText();
	     
	     if(ExpString.equals(ActString)==true)
	     {
	    	 System.out.println("test is passsed");
	     }
	     
//	     second click
//	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
//	     driver.switchTo().alert()

	}

}
