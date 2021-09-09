package POMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest 
{
	
	@Test
	public void GoogleTC() throws InterruptedException
	{
		
		//MasterClass --> 
		
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.google.com/");
		GoogleHomePage GH=new GoogleHomePage(myD);
		
		GH.SearchField().sendKeys("Selenium");
		Thread.sleep(4000);
		GH.SearchButton().click();
		Thread.sleep(4000);
		
		GoogleResultPage GR=new GoogleResultPage(myD);
		System.out.println(GR.ResultStat().getText());
		
		
		Thread.sleep(4000);
		myD.close();
		
	}

}
