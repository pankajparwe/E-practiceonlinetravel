package RealTimeExercise12;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr//th[2]")).getText().contains("November")) 
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr//th[3]")).click();
		}

	
		driver.findElement(By.id("travel_date")).click();
		List<WebElement>dates=driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++) 
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) 
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

////div[@class='datepicker-days']/table/thead/tr//th[2] ======this is xpath
			//[class='datepicker-days'] [class='datepicker-switch']------this is css
		}


	}

}
