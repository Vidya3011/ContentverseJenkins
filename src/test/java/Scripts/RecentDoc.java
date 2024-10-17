package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pom.LoginPage;
import Pom.RecentFolderDocument;
import Pom.ViewerToolbar;




public class RecentDoc extends BaseTest {
	//vidya
	private WebDriver driver;

	RecentDoc(WebDriver driver) {
		this.driver = driver;
	}
	@Test(priority = 2)
	public void testRecent() throws Exception{	
				

		RecentFolderDocument rec=new RecentFolderDocument(driver);
	    rec.SetRecentFolder();
	    Thread.sleep(3000);
	    rec.SetRecentDocument();
	    Thread.sleep(3000);
	    ViewerToolbar view = new ViewerToolbar(driver);

		view.SetCloseViewer();
		LogoutPage logout=new LogoutPage(driver);
		logout.testLogout();
	
	}


}
