package udemydropdown;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waittopic {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemneeded = {"Brocolli" ,"Beetroot", "Cucumber"};
		additems(driver, itemneeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");		
	    driver.findElement(By.cssSelector("button.promoBtn")).click();
	    
	    WebDriverWait w =new WebDriverWait(driver, 5);
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	   System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText()); 

	}
	
	public static void additems(WebDriver driver, String[] itemneeded ) {
		List<WebElement> Products= driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		int j=0;
		for(int i=0; i<=Products.size(); i++)
		{

			String[] name=Products.get(i).getText().split("-");
			String formattedname =name[0].trim();
			List itemneededlist =Arrays.asList(itemneeded);

			if(itemneededlist.contains(formattedname))
			{
				//click on the cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j==itemneeded.length)
				{
					break;
				}
			}
		}





		
		
		
	}

}
