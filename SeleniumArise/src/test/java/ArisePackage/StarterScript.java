package ArisePackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class StarterScript 
{
	
	@BeforeTest
	public void BrowserStart()
	{
	System.out.println("Browser Started....");	
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Browser Closed....");	
	}
	
	

}
