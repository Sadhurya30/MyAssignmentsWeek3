package week3.day4Assessment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class LeafGroundAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		
		WebElement clickButton = driver.findElement(By.linkText("Click"));
		clickButton.click();
		
		String text = driver.getTitle();
		
		if(text.contains("Dashboard")) {
			System.out.println("Title is verified");
		}
		
		Boolean d= driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println(d);
		
		if(d.FALSE){
			System.out.println("It is disabled");
		}
		
		driver.get("https://leafground.com/select.xhtml");
		
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select tool1 = new Select(tool);
		tool1.selectByIndex(1);
		
		WebElement country = driver.findElement(By.className("ui-selectonemenu-label ui-inputfield ui-corner-all"));
		Select country1 = new Select(country);
		country1.selectByVisibleText("India");
		
		WebElement city = driver.findElement(By.className("ui-selectonemenu-trigger ui-state-default ui-corner-right"));
		Select city1 = new Select(city);
		city1.selectByIndex(1);
		
		WebElement course = driver.findElement(By.className(""));
		Select course1 = new Select(course);
		course1.selectByIndex(3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
