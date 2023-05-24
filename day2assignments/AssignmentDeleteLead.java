package week3.day2assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("http://leaftaps.com/opentaps/control/login");
		
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("DemoSalesManager");
	    
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("crmsfa");
	    
	    WebElement login = driver.findElement(By.className("decorativeSubmit"));
	    login.click();
	    
	    WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		
		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();
		
		WebElement phoneTab = driver.findElement(By.linkText("Phone"));
		phoneTab.click();
		
		WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
		phoneNumber.sendKeys("");
		
		 WebElement clickFindLeads = driver.findElement(By.className("x-btn-text"));
		 clickFindLeads.click();
		 
		 
		

	}

}
