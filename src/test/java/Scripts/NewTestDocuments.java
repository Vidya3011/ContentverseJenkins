package Scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Generic.BaseTest;
import Generic.Lib;
import Pom.LoginPage;
import Pom.OpenDoc;


public class NewTestDocuments extends BaseTest{	
	//Vidya
	@Test(priority=1)
	public void testValidLogin() throws Exception {

	int rc = Lib.getRowCount(xlpath, "ValidLogin");
	
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
		
    }
	}
	@Test(priority=2)
    public void Createopen() throws Exception {
	
		OpenDoc oc=new OpenDoc(driver);
		oc.SetExpandNode1();
	}
	
	 @Test(priority=3) 
	 public void Createdoc1()throws Exception{
	
	  
	  CreateNavigateDocument doc1 = new CreateNavigateDocument(driver);
	  doc1.testCreateNaviagateDocument();
	 
	 }

	
		 
		 
}
	 
	



	
			
		
		
	


