package miscelanous14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.auth.MalformedChallengeException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenlinks  {

	
	
	public static void main(String[] args) throws MalformedChallengeException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		
		
		
		
		
		
		/*
		//li[@class='gf-li']/a
		int size=driver.findElements(By.xpath("//li[@class='gf-li']/a")).size();
		for(int i=0; i<size;i++) {
			
			
			 
			String url=	driver.findElements(By.xpath("//li[@class='gf-li']/a")).get(i).getAttribute("href");
			String text=driver.findElements(By.xpath("//li[@class='gf-li']/a")).get(i).getText();
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode=conn.getResponseCode();
			if(respcode>200) {
				System.out.println(text +" : This link is broken");
			}else {
				System.out.println(text  + " : This link is OK");
			}
			
			
			
			*/
		//enhanced for loop
		List<WebElement> links= driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		SoftAssert a= new SoftAssert();
		for(WebElement link : links)
		{

			
			
			String url=	link.getAttribute("href");
			String text=link.getText();
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println(respcode);
			a.assertTrue(respcode<400,"this link is broken :"+ text);
			
			
			/*
			if(respcode>400) {
				System.out.println(text +" : This link is broken");
				Assert.assertTrue(false);
			}
			
			*/
		}
		a.assertAll();
			
		}
		
		
	
		
		
		
		//broken url
		//java moethods call the url and get the status code
		
		
	
	
	
	}
