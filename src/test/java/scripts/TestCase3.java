package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SearchResultPage;
import pomPages.SeleniumCoursePage;
import pomPages.SkillraryLoginPage;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.search(pdata.getPropertyFile("coursename"));
		s.click();
		
		SearchResultPage sr=new SearchResultPage(driver);
		sr.seleniumcourse();
		
		SeleniumCoursePage sc=new SeleniumCoursePage(driver);
		sc.acceptcookies();
		driverutilities.switchtoframe(driver);
		sc.playbtn();
		Thread.sleep(5000);
		sc.pausebtn();
		driverutilities.switchback(driver);
		sc.wishlist();
	}
}
