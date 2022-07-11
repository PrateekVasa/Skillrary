package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	public void skillrarydemoappbutton()
	{
		skillrarydemoapp.click();
	}
	public void search(String text)
	{
		searchbox.sendKeys(text);
	}
	public void click()
	{
		searchbtn.click(); 
	}
}
