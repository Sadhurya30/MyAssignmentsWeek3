package week3.day4Assessment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class TamilMatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.tamilmatrimony.in/");
		
		driver.manage().window().maximize();
		WebElement profile = driver.findElement(By.id("REGISTERED_BY"));
		Select profile1 = new Select(profile);
		profile1.selectByVisibleText("Myself");
		
		WebElement name = driver.findElement(By.id("NAME"));
		name.sendKeys("Sadhurya");
		
		WebElement gender = driver.findElement(By.id("genderfemale"));
		gender.click();
		
		WebElement day = driver.findElement(By.id("DOBDAY"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("30");
		
		WebElement month = driver.findElement(By.id("DOBMONTH"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.id("DOBYEAR"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("1999");
		
		WebElement religion = driver.findElement(By.id("RELIGION"));
		Select religion1 = new Select(religion);
		religion1.selectByVisibleText("Hindu");
		
		WebElement motherTongue = driver.findElement(By.id("MOTHERTONGUE"));
		Select motherTongue1 = new Select(motherTongue);
		motherTongue1.selectByVisibleText("Tamil");
		
		WebElement country = driver.findElement(By.id("COUNTRY"));
		Select country1 = new Select(country);
		country1.selectByVisibleText("India");
		
		WebElement mobile = driver.findElement(By.id("MOBILENO"));
		//Select mobile1 = new Select(mobile);
		//mobile1.selectByIndex(1);
		
		mobile.sendKeys("9940354630");
		
		WebElement email = driver.findElement(By.name("EMAIL"));
		email.sendKeys("sadhupari@gmail.com");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
