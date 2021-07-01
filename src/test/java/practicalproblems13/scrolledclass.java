package practicalproblems13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrolledclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        ////div[@class='tableFixHead']/table/tbody/tr/td[4]
	 
        
        List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
	 int sum=0;
        
        for(int i=0; i< values.size();i++) 
	 {
		 //converting string into integer format
		 sum =sum+Integer.parseInt(values.get(i).getText());
		 
	
	 }
        System.out.println(sum);
      int total= Integer.parseInt( driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim());	
	  Assert.assertEquals(total, sum);
	
	
	
	}
	

}
