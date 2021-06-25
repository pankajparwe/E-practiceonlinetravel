package udemydropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdwnpractice {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//validating enabled and disabled
		//method 2 --it is changing one of the attribute value hence we are checking the value 
		// using if loop
		
		driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
    	if(	driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
          {
    		System.out.println("is enabled"); 
    		Assert.assertTrue(true);
    		
	      }
		
		
		
		
    	/*
		
	    //method 1
		driver.findElement(By.id("one trip ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//=====================================================================
		
		//calender selection
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//this selecting current date 
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
		

	//================================================================    
	Handling dropdown cities
	    //  //a[@value='MAA']  - Xpath for chennai

	//a[@value='BLR']

	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	  //======================================================================  

	    //handling dropdown and assertion 

	    driver.findElement(By.id("divpaxinfo")).click();
	    for(int i=1; i<5; i++)
	    {
	    	driver.findElement(By.id("hrefIncAdt")).click();

	    }
	    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult" );
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	//==============================================================================

	  driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	  driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
	  Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());  
	   //========================================================================== 


	    //method for handling autosuggestive dropdown
	    //1. click on the box
	    //2. make list of the webelements and store it in variable , here optiins
	    //3. use for loop to check the item


	    driver.findElement(By.id("autosuggest")).sendKeys("ind");
	    List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));


	    for(WebElement option : options) {

	    	if(option.getText().equalsIgnoreCase("India")) {

	    	}
	    	option.click();
    		break;// for closing the loop when required element clicked

	    }

		 */
		//============================================================================


	}


}
