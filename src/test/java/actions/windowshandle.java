package actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
Set<String> windows = driver.getWindowHandles();
Iterator<String>iter =windows.iterator();
String ParentID=iter.next();
String ChildID= iter.next();
driver.switchTo().window(ChildID);
System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());

String EmailID=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
driver.switchTo().window(ParentID);
driver.findElement(By.id("username")).sendKeys(EmailID);
	}	

}
