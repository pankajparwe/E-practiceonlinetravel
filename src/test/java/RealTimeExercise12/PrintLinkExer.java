package RealTimeExercise12;

import java.text.CollationElementIterator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinkExer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//count the links on whole page	
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//link count on footer page OR limiting webdriver scope
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
        //links count in one column in the footer section
		WebElement footercolumn=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footercolumn.findElements(By.tagName("a")).size());
		
		//click on the each link and check that links are working or not
		//for this 1. we are opening the all the links in the seperate tab
		//2. then go to each tab get the title
		
		for (int i=1; i<footercolumn.findElements(By.tagName("a")).size(); i++) 
		{
			String ClickOnLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			footercolumn.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTab);
			Thread.sleep(5000);
		 }
		
			Set<String>abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			 while(it.hasNext()) 
			 {
				  driver.switchTo().window(it.next());
				  System.out.println(driver.getTitle());
				 
		     }



	}

}
