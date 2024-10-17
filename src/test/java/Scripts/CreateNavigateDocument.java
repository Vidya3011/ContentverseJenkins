package Scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.IAutoConst;
import Generic.Lib;
import Pom.LoginPage;
import Pom.NewDocument;

public class CreateNavigateDocument {
	//Vidya
	private WebDriver driver;

	CreateNavigateDocument() {

	}
	String path="D:\\Automationimages";
	CreateNavigateDocument(WebDriver driver) {		
		this.driver = driver;
	}
	
	public void testCreateNaviagateDocument() throws Exception  {
		
		String xlpath = IAutoConst.xlpath;
		int rc = Lib.getRowCount(xlpath, "DocumentType");
		for (int i = 1; i <= rc; i++) {
			String Documenttypename = Lib.getCellValue(xlpath, "DocumentType", i, 0);
			Reporter.log("DocumentType is:" + Documenttypename, true);
			String IndexVal = Lib.getCellValue(xlpath, "DocumentType", i, 1);
			Reporter.log("IndexValue is:" + IndexVal, true);
			NewDocument newdoc = new NewDocument(driver);
			newdoc.SetCreateNewDocument();
			Viewer view1=new Viewer(driver);
			newdoc.SetFileuploadmenu(path,view1);				
			newdoc.SetDestinationfolder();
			newdoc.SetDocType(Documenttypename, IndexVal);
			newdoc.SetClickCreateNavigatebutton();
			Thread.sleep(2000);
			RecentDoc rec=new RecentDoc(driver);
					rec.testRecent();					
					Thread.sleep(2000);
					
					LogoutPage logout=new LogoutPage(driver); logout.testLogout();
					 
			
		}
	}
}
