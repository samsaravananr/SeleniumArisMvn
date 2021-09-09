package ArisePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 
{

	
		@Test
		public void TC001() throws InterruptedException
		{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.mortgagecalculator.org/");
		Thread.sleep(5000);
		Boolean vRound=myD.findElement(By.xpath("//input[@value='percent']")).isSelected();
		System.out.println(vRound);
		myD.findElement(By.xpath("//input[@value='percent']")).click();
		Thread.sleep(5000);
		vRound=myD.findElement(By.xpath("//input[@value='percent']")).isSelected();
		
		System.out.println(vRound);
		myD.close();
		}

	

}

