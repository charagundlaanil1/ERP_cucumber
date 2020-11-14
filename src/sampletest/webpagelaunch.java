package sampletest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webpagelaunch {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amar Ch\\Desktop\\ankesh\\sampleproject\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.in/");
       Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("a-link-normal a-text-normal")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		if(driver.findElement(By.id("hlb-ptc-btn-native")).isDisplayed()){
			System.out.println("item added to cart sucessfully");
		}else{
			System.out.println("item not added to cart");
		}
	}
}
