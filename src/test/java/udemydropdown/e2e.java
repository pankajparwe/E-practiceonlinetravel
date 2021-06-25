package udemydropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//calender selection
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			
			driver.findElement(By.xpath("(//a[@value='MAA']) [2]")).click();
			//(//a[@value='MAA'])[2]
	//calender
	     //   driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[6]/a")).click();

			// passenger value
	        
	        driver.findElement(By.id("divpaxinfo")).click();
		    for(int i=1; i<5; i++)
		    {
		    	driver.findElement(By.id("hrefIncAdt")).click();

		    }
		    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult" );
		    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		    
//senior citizen checkbox
		    driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		    
		    
		    



}
	
}
