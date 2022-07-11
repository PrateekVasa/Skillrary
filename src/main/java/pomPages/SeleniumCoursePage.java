package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumCoursePage 
{
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement play;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement cookies;
	
	public SeleniumCoursePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void acceptcookies()
	{
		cookies.click();
	}
	public void playbtn()
	{
		play.click();
	}
	public void pausebtn()
	{
		pause.click();
	}
	public void wishlist()
	{
		addtowishlist.click();
	}
}
