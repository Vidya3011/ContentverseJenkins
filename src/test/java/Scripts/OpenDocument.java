package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pom.LoginPage;
import Pom.OpenDoc;
import Pom.ViewerToolbar;

public class OpenDocument extends BaseTest {
	//Vidya
	//private WebDriver driver;

	/*OpenDocument(WebDriver driver) {
		this.driver = driver;
	}*/
	@Test(priority = 3)
	public void testOpenDocument() throws Exception{
		int rc = Lib.getRowCount(xlpath, "ValidLogin");
		Reporter.log("rc count:" + rc,true);
		for (int i = 1; i < rc-1; i++) {

			String un = Lib.getCellValue(xlpath, "ValidLogin", i, 0);		
			Reporter.log("Username:" + un, true);
			String pw = Lib.getCellValue(xlpath, "ValidLogin", i, 1);
			Reporter.log("Password:" + pw, true);			
			String roomname = Lib.getCellValue(xlpath, "ValidLogin", i, 2);
			Reporter.log("Room:" + roomname, true);
			LoginPage login = new LoginPage(driver);
			login.SetUserName(un);
			login.SetPassword(pw);
			login.SetSelectRooms(roomname);
			Thread.sleep(3000);
			login.CheckRememberMe(un, pw);
			Thread.sleep(2000);
			login.ClickLoginButton(un, pw, roomname);
			
		OpenDoc OC=new OpenDoc(driver);
		OC.SetExpandNode();
		OC.DocumentOpen();
		Thread.sleep(8000);
		Viewer view1=new Viewer(driver);
		view1.testViewerToolbar();
		
//		LogoutPage logout=new LogoutPage(driver);
//		logout.testLogout();

	}
	}
}



