package jav.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\LataProject\\Automation\\exefiles\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\LataProject\\Automation\\exefiles\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@title='Accept All']")).click();

		
		//System.out.println(driver.getTitle());
		//Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("abcde");
		driver.findElement(By.id("pass")).sendKeys("abcde");
		driver.findElement(By.name("login")).click();
		
		
		
	}
	
}
