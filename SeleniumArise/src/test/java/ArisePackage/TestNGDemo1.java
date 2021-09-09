package ArisePackage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo1 
{
	
	
	
	@Test (groups = {"Release1"}, dependsOnMethods = "Signout" , alwaysRun = true)
	public void Login()
	{
		System.out.println("Login Test Case");
	}

	@Test (groups = {"SmokeTest"})
	public void Signout()
	{
		System.out.println("Signout Test Case");
		Assert.assertEquals("one", "two");
	}
	
	
	
	
	
	
	

}
