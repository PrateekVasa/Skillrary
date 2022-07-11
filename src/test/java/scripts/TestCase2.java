package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.DragAndDropPage;
import pomPages.SelectCategoryPage;
import pomPages.SkillraryLoginPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws IOException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoappbutton();
		
		SelectCategoryPage sc=new SelectCategoryPage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.dropDown(sc.getDropdown(),pdata.getPropertyFile("coursedd"));
		
		DragAndDropPage d=new DragAndDropPage(driver);
		driverutilities.draganddrop(driver, d.getSelenium(), d.getCart());
		Point loc = d.getFbbtn().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilities.scrollbar(driver, x, y);
		d.fbclick();
		
	}
}
