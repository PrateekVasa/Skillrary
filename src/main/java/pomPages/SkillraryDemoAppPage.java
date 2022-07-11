package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoAppPage 
{
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	public SkillraryDemoAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void seleniumtrainingbtn()
	{
		seleniumtraining.click();
	}
	public WebElement getCoursebtn() 
	{
		return coursebtn;
	}
}
