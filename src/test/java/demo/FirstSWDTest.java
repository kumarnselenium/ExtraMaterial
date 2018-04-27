package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSWDTest {

	@Test
	public void example() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/narkandukuri/Downloads/chromedriver");
		ChromeDriver oCD = new ChromeDriver();
		oCD.get("https://www.google.com");
		
		Thread.sleep(10000);
		
		System.out.println("Title of the browser: " + oCD.getTitle());
		
		oCD.quit();
	}
	
}
