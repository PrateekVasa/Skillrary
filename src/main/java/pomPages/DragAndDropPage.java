package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage 
{
	@FindBy(id="Selenium Training")
	private WebElement selenium;
	
	@FindBy(id="cartArea")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbbtn;
	
	public DragAndDropPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelenium() 
	{
		return selenium;
	}
	public WebElement getCart() 
	{
		return cart;
	}
	public WebElement getFbbtn() 
	{
		return fbbtn;
	}
	public void fbclick()
	{
		fbbtn.click();
	}
}
