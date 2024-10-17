package Generic;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Pom.LoginPage;



public abstract class BaseTest implements IAutoConst {
	public WebDriver driver;
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(EDGE_KEY, EDGE_VALUE);
	}

	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		} else if ((browser.equalsIgnoreCase("chrome"))) {
			
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		String url = Config.getproperty(CONFIG_PATH, "URL");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("http://10.4.10.72:8080/CVWeb/login");
		driver.manage().window().maximize();

	}
	
	public void Login() throws Exception{
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
	}
	}

	
	@AfterMethod //AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
	if(ITestResult.FAILURE==result.getStatus()){
	try{
	// To create reference of TakesScreenshot
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	// Call method to capture screenshot
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	// Copy files to specific location
	// result.getName() will return name of test case so that screenshot name will be same as test case name
	//File destFile=new File("D:\\"+result.getName()+".png");
	File destFile=new File("D://Screenshot/"+result.getName()+".png");
	FileUtils.copyFile(src,destFile );
	System.out.println("Successfully captured a screenshot");
	}catch (Exception e){
	System.out.println("Exception while taking screenshot "+e.getMessage());
	}
	}
	//driver.quit();
	}

	
//Vidya

	 /*@AfterMethod 
	 public void CloseApplication(){ 
	 driver.close(); 
	 }
*/

}
