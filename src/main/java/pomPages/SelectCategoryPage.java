package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCategoryPage 
{
	@FindBy(name = "addresstype")
	private WebElement dropdown;
	
	public SelectCategoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropdown() {
		return dropdown;
	}
}
