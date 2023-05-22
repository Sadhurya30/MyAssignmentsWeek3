package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static void main(String[] args) throws InterruptedException {
	
	// Launch browser
	ChromeDriver driver = new ChromeDriver();
	
	// Maximize the window
	driver.manage().window().maximize();
	
	// Load the url
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	// Locate username field
	WebElement username = driver.findElement(By.id("username"));
	
	// Enter password as DemoSalesManager
	username.sendKeys("DemoSalesManager");
	
	// Locate password field
	WebElement password = driver.findElement(By.id("password"));
	
	// Enter password as crmsfa
	password.sendKeys("crmsfa");
	
	// Click on the Login button
	WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
	loginButton.click();
	

	// Click on the crmsfa link
	WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
	crmsfa.click();
	
	// Click on the leads tab
	WebElement leadsTab = driver.findElement(By.linkText("Leads"));
	leadsTab.click();
	
	// Click on the create lead
	WebElement createLead = driver.findElement(By.linkText("Create Lead"));
	createLead.click();
	
	// Enter companyName
	WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
	companyName.sendKeys("Testleaf");
	
	// Enter firstName
	WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
	firstName.sendKeys("Sadhurya");
	
	// Enter lastName
	WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
	lastName.sendKeys("Palani");
	
	// Enter firstName(local)
	WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	firstNameLocal.sendKeys("Sadhu");
	
	// Enter departmentName
	WebElement departmentName = driver.findElement(By.name("departmentName"));
	departmentName.sendKeys("Testing");
	
	// Enter description
	WebElement description = driver.findElement(By.name("description"));
	description.sendKeys("joined testleaf two weeks ago");
	Thread.sleep(2000);

	// Enter email address
	WebElement emailID = driver.findElement(By.id("createLeadForm_primaryEmail"));
	emailID.sendKeys("sadhupari123@gmail.com");
	Thread.sleep(2000);

	// Click on the createLead button
	WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
	createLeadButton.click();
	
	// To close the window
	driver.close();
}
}
