package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoAppPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoappbutton();
		
		SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursebtn());
		sd.seleniumtrainingbtn();
		
		AddToCartPage a=new AddToCartPage(driver);
		driverutilities.doubleclick(driver, a.getPlusbtn());
		a.addtocartbtn();
		driverutilities.alertpopup(driver);
	}
}
