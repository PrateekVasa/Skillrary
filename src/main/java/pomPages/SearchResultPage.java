package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage 
{
	@FindBy(xpath="(//img[@class='thumb lazy'])[2]")
	private WebElement selenium;
	
	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void seleniumcourse()
	{
		selenium.click();
	}
}
