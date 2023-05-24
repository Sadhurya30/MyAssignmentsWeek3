package week3.day2assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;


public class AssignmentCreateContact {

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
		
		WebElement contactsTab = driver.findElement(By.linkText("Contacts"));
		contactsTab.click();
		
		WebElement createContact = driver.findElement(By.linkText("Create Contact"));
		createContact.click();
		
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Sadhurya");
		
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("Palanivelan");
		
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocal.sendKeys("Sadhu");
		
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNameLocal.sendKeys("Palani");
		
		WebElement department = driver.findElement(By.id("createContactForm_departmentName"));
		department.sendKeys("Testing");
		
		WebElement description = driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("Automation testing using selenium");
		
		WebElement emailAddress = driver.findElement(By.id("createContactForm_primaryEmail"));
		emailAddress.sendKeys("Testleaf123@gmail.com");
		
		
		WebElement sourceDD1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sourcedd1 = new Select(sourceDD1);
		//sourcedd1.selectByVisibleText("NewYork");
		sourcedd1.selectByIndex(7);
		//sourcedd1.selectByVisibleText("New York");
		
		
		WebElement clickCreateContact = driver.findElement(By.className("smallSubmit"));
	    clickCreateContact.click();
	    
	    WebElement edit = driver.findElement(By.className("subMenuButton"));
	    edit.click();
	    
	    WebElement description1 = driver.findElement(By.id("updateContactForm_description"));
	    description1.clear();
	    
	    WebElement importantNote = driver.findElement(By.id("updateContactForm_importantNote"));
	    importantNote.sendKeys("Manual and automation testing classes ends in july");
	    
	    WebElement update = driver.findElement(By.className("smallSubmit"));
	    update.click();
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    driver.close();
	    
	    
	 }

}
