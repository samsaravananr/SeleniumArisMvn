package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage 
{
	
	WebDriver myD;

	public GoogleResultPage(WebDriver myD) 
	{
		super();
		this.myD = myD;
	}
	
	
	By Result=By.xpath("//*[@id=\"result-stats\"]");
	
	
	public WebElement ResultStat()
	{
		return myD.findElement(Result);
	}
	
	

}
