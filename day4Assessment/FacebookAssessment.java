package week3.day4Assessment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;


public class FacebookAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement newAccount = driver.findElement(By.linkText("Create new account"));
		newAccount.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Sadhurya");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Palani");
		
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("9940354630");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("sadhu@123");
		
		WebElement day = driver.findElement(By.id("day")); 
		Select day1= new Select(day);
		day1.selectByIndex(10);
		
		WebElement month = driver.findElement(By.id("month")); 
		Select month1= new Select(month);
		month1.selectByIndex(6);
		
		WebElement year = driver.findElement(By.id("year")); 
		Select year1= new Select(year);
		year1.selectByVisibleText("1999");
		
		WebElement gender = driver.findElement(By.className("_8esa")); 
		gender.click();
		
		driver.close();
		
	}

}
