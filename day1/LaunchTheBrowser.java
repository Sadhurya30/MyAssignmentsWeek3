package week3.day1;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//To launch Browser
     // ChromeDriver driver = new ChromeDriver();
      EdgeDriver driver = new EdgeDriver();
      //load url
      driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java ");
      driver.get("");
     // driver.get("https://www.irctc.co.in/nget/train-search");
      //maximize the window
      driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.close();
	}

}
