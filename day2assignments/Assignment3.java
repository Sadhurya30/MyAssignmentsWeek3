package week3.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment3 {

  public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub

    EdgeDriver driver = new EdgeDriver();

    driver.get("https://acme-test.uipath.com/login");
    driver.manage().window().maximize();


    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys("kumar.testleaf@gmail.com");


    WebElement passWord = driver.findElement(By.name("password"));
    passWord.sendKeys("leaf@12");
    
    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    loginButton.click();

    System.out.println(driver.getTitle());

    WebElement logOut = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));
    logOut.click();

    Thread.sleep(10000);
    driver.close();

  }
}