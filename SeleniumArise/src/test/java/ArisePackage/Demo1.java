package ArisePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;





public class Demo1 {

	
	//@Test (dependsOnMethods = {"Signout"} )
	
	//ADDING THE BELOW ANNOTATION
	@Test
	@Parameters({"vURL"})
	public void TS002(String vURL) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		//myD.get("https://www.linkedin.com/login");
		myD.get(vURL);
		Thread.sleep(5000);
		System.out.println("Title is : "+myD.getTitle());
		myD.close();

	}

}
