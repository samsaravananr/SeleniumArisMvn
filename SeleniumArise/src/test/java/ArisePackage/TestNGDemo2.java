package ArisePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo2 
{
	
	@Test
	public void TS001() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.linkedin.com/login");
		Thread.sleep(5000);
		System.out.println("Title is : "+myD.getTitle());
		myD.close();
	}

}
