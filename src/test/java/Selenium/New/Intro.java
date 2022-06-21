package Selenium.New;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\New\\Drivers\\chromedriver.exe");
        driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//header/div[2]/div[3]/input[1]")).sendKeys("T-shirts",Keys.ENTER);
		driver.findElement(By.xpath(""));
	}
}
