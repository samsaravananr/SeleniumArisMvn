package ArisePackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Suite 
{
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("CHOOSE the Browser Closed....");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Delete All the Cache....");
	}

}
