package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage 
{
	
	WebDriver myD;

	public GoogleHomePage(WebDriver myD) 
	{
	
		
		this.myD = myD;
	}
	
	By GoogleButton=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[1]");		
	By GoogleTextBox=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
	

	public WebElement SearchButton()
	{
		return myD.findElement(GoogleButton);
	}
	
	public WebElement SearchField()
	{
		return myD.findElement(GoogleTextBox);
	}


}
