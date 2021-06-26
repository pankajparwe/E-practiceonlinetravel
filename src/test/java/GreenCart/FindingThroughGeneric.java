package GreenCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingThroughGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] itemneeded = {"Brocolli" ,"Beetroot", "Cucumber"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> Products= driver.findElements(By.xpath("//h4[@class='product-name']"));
//		h4.product-name-----css
			//h4[@class='product-name']----xpath 
		int j=0;
		for(int i=0; i<=Products.size(); i++) {
			
			String[] name=Products.get(i).getText().split("-");
			String formattedname =name[0].trim();
			List itemneededlist =Arrays.asList(itemneeded);
			
			if(itemneededlist.contains(formattedname)) {
				//click on the cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j==3) {
					break;
				}
			}
		}
		
		
		


	}

}
