package week3.day2assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		WebElement newAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	    newAccount.click();
	    Thread.sleep(1000);
		
	    WebElement firstName = driver.findElement(By.xpath("//input[@aria-label='First name']"));
	    firstName.sendKeys("Sowmiya");
	    Thread.sleep(1000);
	    
	    WebElement surName = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
	    surName.sendKeys("Yuvaraj");
	    Thread.sleep(1000);
		
	    WebElement mobile = driver.findElement(By.name("reg_email__"));
	    mobile.sendKeys("9940354630");
	    
	    WebElement password = driver.findElement(By.id("password_step_input"));
	    password.sendKeys("sadhu@123");
	    Thread.sleep(1000);
		
	    WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	    Select dayInput = new Select(day);
	    dayInput.selectByValue("20");
	    Thread.sleep(1000);
	    
	    WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	    Select monthInput = new Select(month);
	    monthInput.selectByIndex(6);
	    Thread.sleep(1000);
	    
	    WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	    Select yearInput = new Select(year);
	    yearInput.selectByVisibleText("1992");
	    Thread.sleep(1000);
	    
	    WebElement radioButton = driver.findElement(By.xpath("//input[@value='1']"));
	    radioButton.click();
	    
	    WebElement signUp = driver.findElement(By.xpath("//button[text() = 'Sign Up']"));
	    signUp.click();
	    
	    Thread.sleep(3000);
	    driver.close();
		
	    
		
	}

}
