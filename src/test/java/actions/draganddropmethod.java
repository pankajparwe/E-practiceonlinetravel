package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropmethod {	public static void main(String[] args) {
	// TODO Auto-generated method stub
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	WebElement source=	driver.findElement(By.xpath("//div[@id='draggable']")); 
	WebElement target= driver.findElement(By.id("droppable"));
	Actions action =new Actions(driver);
	action.dragAndDrop(source, target).build().perform();
    




}
}