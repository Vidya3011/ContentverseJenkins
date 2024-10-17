package Pom;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ViewerToolbar {
	//Vidya

	@FindBy(xpath = ("//*[@id='messageButtonOK']"))
	private WebElement OKbutton;

	 @FindBy(xpath=("//span[contains(text(),'Paste')]"))
	 private WebElement Paste;
	
	@FindBy(xpath = ("//span[@title='Document Close']"))
	private WebElement CloseViewer;


	
	@FindBy(xpath = ("//span[contains(@class,'pageMenu')]"))
	private WebElement Pagemenu;

	@FindBy(xpath = ("//button[@id='copyDoc']"))
	private WebElement Copy;
	
	@FindBy(xpath = ("//button[@id='splitDocumentAnchor']"))
	private WebElement Split;
	
	@FindBy(xpath = ("//button[@id='splitDocument']"))
	private WebElement splitOkButton;
	
	@FindBy(xpath = ("//input[@id='startRange']"))
	private WebElement pdfStartRange;
	
	@FindBy(xpath = ("//input[@id='endRange']"))
	private WebElement pdfEndRange;
	
	@FindBy(xpath = ("//span[contains(text(),'Full Screen View')]"))
	private WebElement Fullscreen;
	
	@FindBy(xpath = ("//span[contains(text(),'Show Thumbnails')]"))
	private WebElement ShowThumbnail;
	
	@FindBy(xpath = ("//span[contains(text(),'Horizontal Page')]"))
	private WebElement HorizontalPage;
	
	@FindBy(xpath = ("//button[@id='verticalPagesDisplay_shortcut']"))
	private WebElement VerticalPage;

	@FindBy(xpath = ("//span[contains(text(),'Single Page')]"))
	private WebElement SinglePage;
	
	@FindBy(xpath = ("//span[contains(text(),'Double Page')]"))
	private WebElement DoublePage;
	
	@FindBy(xpath = ("//span[contains(@class,'viewMenu w3-large')]"))
	private WebElement Viewmenu;

	
	@FindBy(id="thumbnailOptionSelected")
    private WebElement Thumbnail;
	
	@FindBy(xpath=("//button[@id='downloadAllFilesYes']"))
	private WebElement DownloadYes;
	
	
	@FindBy(xpath=("//div[@id='pageDownload_shortcut']//span[contains(@class,'downloadPageIcon icon-content')]"))
	// @FindBy(xpath=("//*[@id=\"pageDownload_shortcut\"]/span]"))
	 private WebElement DownloadIcon;


	@FindBy(xpath = ("//*[@id='createDocuemtnLocation']"))
	private WebElement DestinationFolder;

	@FindBy(xpath = ("//div[@id='addDocdropdwn']"))
	private WebElement menuitem;
	
	@FindBy(id="cvDocumentClose")
    private WebElement CloseVeiwer;
	
	@FindBy(xpath=("//div[@id='messageBox27']"))
    private WebElement SaveDialog;
	
	@FindBy(xpath=("//button[@id=CommentsMessageModelOk']"))
    private WebElement msgBox;
	
	@FindBy(id="messageButtonOK27")
    private WebElement SaveDialogYes;
	
	@FindBy(id="messageButtonNo27")
    private WebElement SaveDialogNo;
	
	@FindBy(id="messageButtonCancel27")
    private WebElement SaveDialogCancel;
	
	@FindBy(id="addWordFile")
    private WebElement NewWordDocument;

	@FindBy(id="addExcelFile")
    private WebElement NewExcelDocument;
	
	@FindBy(id="addPPTFile")
    private WebElement NewPPTDocument;
	
	@FindBy(id="newTemplateFileName")
    private WebElement EnterfileName;
	
	@FindBy(id="templateOK")
    private WebElement EnterFileNameOK;
	
	@FindBy(id="createDocuemntNavigator")
    private WebElement NavTree;
	
	@FindBy(id="templateCanel")
    private WebElement EnterFileNameCancel;
	
	@FindBy(id="messageButtonOK26")
    private WebElement DownloadButton;
	
	@FindBy(id="messageButtonOK26")
    private WebElement CancelButton;
	
//	@FindBy(id="messageButtonOK")
//    private WebElement OkBtn;
	
	//vidya
	//@FindBy(xpath=(".//div[@id='controlBlock']/button[@id='messageButtonOK']"))
	//@FindBy(xpath=("//div[@id='messageBox']/div[@id='controlBlock']/button[@id='messageButtonOK']"))
	//private WebElement SendMailOkBtn;
	//@FindBy(xpath=("//button[@id='messageButtonOK']"))	
	@FindBy(xpath=("//*[@id='messageButtonOK']"))	
    private WebElement OkBtn;
	
	/*@FindBy(xpath = ("//span[contains(@class,'shareIcon')]"))
	private WebElement shareicon;*/
	
	@FindBy(xpath = ("//div[@id='fileControl_sendTo']"))
	private WebElement shareicon;
	
	@FindBy(xpath = ("//div[@id='viewDocumentMail']"))
	private WebElement Mail;
	@FindBy(xpath = ("//div[@id='viewDocumentPrint']"))
	private WebElement PrintDialog;
	@FindBy(xpath = ("//div[@id='viewDocumentExport']"))
	private WebElement ExportDialog;
	@FindBy(xpath = ("//div[@id='sendToSecureMailView']"))
	private WebElement SecurelinkDialog;
	
	@FindBy(xpath= ("//button[@id='saveSendToDocument']"))
    private WebElement MailOkBtn;
	
	/*@FindBy(xpath=("//span[contains(text(),'Mail...')]"))
    private WebElement Mail;*/
	
/*	@FindBy(xpath=("//span[contains(text(),'Print...')]"))
    private WebElement PrintDialog;*/
	
	@FindBy(xpath=("//button[@id='printDocumentOnView']"))
    private WebElement PrintOkBtn;
	/*
	@FindBy(xpath=("//span[contains(text(),'Export...')]"))
    private WebElement ExportDialog;*/
	
	@FindBy(id="saveSendToDocument")
    private WebElement ExportOkBtn;
	
//	@FindBy(xpath=("//span[contains(text(),'Secure link...')]"))
//    private WebElement SecurelinkDialog;
	
	@FindBy(xpath=("//input[@id='toEmial']"))
    private WebElement MailEmailID;
	
//	@FindBy(xpath=("//label[contains(text(),'To Email-id')]"))
//    private WebElement MailEmailID;
	
	@FindBy(xpath=("//input[@id='subjectid']"))
    private WebElement MailSubject;
	
	@FindBy(id="rotateClockwise")
    private WebElement RotateClock;
	
	@FindBy(id="rotateCounterClockwise")
    private WebElement RotateAntiClock;
	
	@FindBy(id="downloadPagesDropDown")
    private WebElement DownloadDropdwn;
	
	@FindBy(id="pageDownload_shortcut")
    private WebElement DownloadOption;
	
	@FindBy(id="pageOffline_shortcut")
    private WebElement OfflineOpt;
	
	@FindBy(xpath=(".//*[@class='editproperties']"))
    private WebElement PropertiesUpdateButton;
	
	@FindBy(xpath=(".//*[@class='saveproperties']"))
    private WebElement PropertiesSaveButton;
	
	@FindBy(xpath=("//span[contains(text(),'Rotate Clock Wise')]"))
    private WebElement RotateClockwise;
	
	@FindBy(xpath=("//span[contains(text(),'Rotate Clock Wise')]"))
    private WebElement RotateAntiClockwise;
	
	
	@FindBy(id="saveAddedPages")
    private WebElement SaveBtn;
	
	@FindBy(id="messageButtonOK42")
    private WebElement SaveOkBtn;
	
	@FindBy(id="navigatorTreeCancle19")
    private WebElement DeleteNoBtn;
	
	@FindBy(id="comment")
    private WebElement Comments1;
	
	@FindBy(xpath=("//button[@id='addComment']"))
    private WebElement AddComments;
	
	@FindBy(xpath=("//textarea[@id='newCommentsInput']"))
    private WebElement CommentsText;

	
	@FindBy(xpath=(".//*[contains(@class,'commentNew')]"))
    private WebElement CommentsNew;
	
	@FindBy(xpath=(".//*[contains(@class,'name form-control')]"))
    private WebElement CommentsNewText;
	
	

	@FindBy(xpath=(".//*[contains(@type,'check')])"))
    private WebElement CommentsPrivate;
	
	@FindBy(xpath=(".//*[@class='jconfirm-buttons']/button"))
    private WebElement CommentSaveDelete;
	
	@FindBy(id="CommentsMessageModelOk")
    private WebElement CommentsSaveDeleteOK;
	
	@FindBy(xpath=("//*[@class=' commentClass']"))
    private WebElement CommentsOpen;
	
	@FindBy(id="saveAddedPages")
    private WebElement SaveIcon;
	
	@FindBy(id="cvDocumentClose")
    private WebElement CloseBtn;
	

	@FindBy(xpath=("//button[@id='messageButtonOK42']"))
    private WebElement SaveOK;
	
	@FindBy(xpath=("//button[@id='messageButtonOK27']"))
    private WebElement SaveDialogYesButton;
	
	@FindBy(xpath=("//button[@id='messageButtonNo27']"))
    private WebElement SaveDialogNOButton;
	
	@FindBy(xpath=("//button[@id='messageButtonCancel27']']"))
    private WebElement SaveDialogCancelButton;

	@FindBy(id="fileControl_delete")
    private WebElement DeleteBtn;
	
//	@FindBy(xpath = ("/div[contains(text(),'Destination Folder')]"))
//	private WebElement DestinationFolder;
	
	@FindBy(xpath = ("//button[@id='messageButtonCreate_as_NewOnPaste']"))
	private WebElement CreateasNewbutton;
	
	@FindBy(xpath = ("//button[@id='deleteMessageOk19']"))
	private WebElement DeleteYesBtn;
	
	@FindBy(xpath = ("//button[@id='messageButtonOK42']"))
	private WebElement SaveOKBtn;
	
	@FindBy(xpath = ("//button[@id='messageButtonOKDEl']"))
	private WebElement FileDeleteOk;
	
	@FindBy(xpath = ("//button[@id='addComment']"))
	private WebElement AddComment;
	
	@FindBy(xpath = ("//textarea[@id='newCommentsInput']"))
	private WebElement NewComment;
	
	@FindBy(xpath = ("//button[@id='saveComment']"))
	private WebElement SaveComment;
	
	@FindBy(xpath = ("//button[@id='cancelComments']"))
	private WebElement CloseComments;
	
	@FindBy(xpath = ("//div[@id='cvComments']"))
	private WebElement OpenComments1;
	
	@FindBy(xpath = ("//button[@id='saveEditedComment']"))
	private WebElement SaveEditedComments;
	
	@FindBy(xpath = ("//div[@id='editCommentsModal']"))
	private WebElement EditComments;

	
	@FindBy(xpath = ("//textarea[@id='editCommentsInput']"))
	private WebElement EdittextComments;
	
	@FindBy(xpath = ("//*[@id=\"commentList\"]/tr[1]/td[1]"))
	private WebElement OpenComments;
	
	@FindBy(xpath = ("//a[contains(text(),'View Document As PDF')]"))
	private WebElement ConvertToPDFLink;
	
	@FindBy(xpath = ("//input[@id='checkNewPrivate']"))
	private WebElement PrivateComments;
	
	@FindBy(xpath = ("//button[@id='deleteComment']"))
	private WebElement DeleteComments;
	
	@FindBy(xpath = ("//button[@id='cancelComments']"))
	private WebElement CloseCommentsDialog;
	
	
	@FindBy(xpath = ("//div[@id='convertToPdfDropDown']"))
	private WebElement ConvertToPDF;
	
	public WebDriver driver;
	Actions action;

	public ViewerToolbar(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);

		this.driver = driver;
	}

	public void setConvToPDF() {
		action.moveToElement(ConvertToPDF).build().perform();
		Reporter.log("View as PDF menu icon is selected ", true);
		action.click(ConvertToPDFLink).build().perform();
		Reporter.log("View as PDF link  is selected ", true);
		
		
		
	}
	
	public void SetComments() throws Exception {
		Comments1.click();
		//Comments.click();
		Thread.sleep(2000);
		//CommentsNew.click();
		AddComments.click();
		Thread.sleep(2000);
		CommentsText.sendKeys("Comments are added");
		Reporter.log("Comments are added",true);
		SaveComment.click();
		Thread.sleep(2000);
		action.doubleClick(OpenComments).perform();
		EdittextComments.clear();
		EdittextComments.sendKeys("Edit comments");
		Reporter.log("Comments are edited",true);
		SaveEditedComments.click();
		Thread.sleep(2000);
		AddComments.click();
		CommentsText.sendKeys("Comments are added again and Private comments check");
		PrivateComments.click();
		SaveComment.click();
		Thread.sleep(5000);
		action.doubleClick(OpenComments).perform();
		DeleteComments.click();
		Thread.sleep(8000);
		action.moveToElement(CloseCommentsDialog).click().build().perform();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement element =
		 * wait.until(ExpectedConditions.elementToBeClickable(CloseCommentsDialog));
		 * ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		 */
		/*CommentsPrivate.click();
		if(CommentsPrivate.isSelected()){
			  Reporter.log("Private checkbox is selected",true);
		   
		  }else{
			  Reporter.log("Private checkbox is not selected",true);
			  
		  }*/
		
		/*
		 * CommentSaveDelete.click(); Thread.sleep(2000); CommentsSaveDeleteOK.click();
		 * Thread.sleep(2000); CommentsNew.click(); Thread.sleep(2000);
		 * CommentsNewText.sendKeys("Comments are added second time");
		 * CommentSaveDelete.click(); Thread.sleep(2000); CommentsSaveDeleteOK.click();
		 * Thread.sleep(2000); CommentsOpen.click();
		 * CommentsNewText.sendKeys("Comments are added and deleted at the same time");
		 * Thread.sleep(2000); CommentSaveDelete.click(); Thread.sleep(2000);
		 * CommentsSaveDeleteOK.click(); Reporter.log("Comments are deleted",true);
		 */
		
	}
	
	 
	public void SetCopyPaste() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);


		action.moveToElement(Pagemenu).build().perform();
		Reporter.log("Page menu icon is selected ", true);
		if(Copy.isEnabled()) {
		action.click(Copy).build().perform();
		Reporter.log("Copy icon is enabled and selected ", true);
		}else {
			Reporter.log("Copy icon is disabled", true);
		}
		OKbutton.click();
		Reporter.log("Page is copied successfully", true);
		action.moveToElement(Pagemenu).build().perform();
		Reporter.log("Page menu icon is selected again ", true);
		action.click(Paste).build().perform();
		Reporter.log("Paste icon is selected ", true);
		
		
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(OkBtn)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		Reporter.log("Page is Pasted successfully", true);
	}
	
	public void SetSplitPageTiff(String fileName , int pos) throws Exception {
		
		WebElement checkbox = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='bodyMain']/div[@id='viewerDiv']/div[@id='docViewerMetaData']/div[@id='"+fileName+"']/div['"+pos+"']/input['"+pos+"']"));
		WebElement thumbnail = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='bodyMain']/div[@id='viewerDiv']/div[@id='docViewerMetaData']/div[@id='"+fileName+"']/div['"+pos+"']/img['"+pos+"']"));
				
		//WebElement thumbnail = driver.findElement(By.id(fileNames[1]));
		checkbox.click();
		thumbnail.click();
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);*/
		action.moveToElement(Pagemenu).build().perform();
//		Reporter.log("Page menu icon is selected ", true);
		action.click(Split).build().perform();
		Reporter.log("Splitting the pages", true);
		
		Thread.sleep(2000);
		
		WebElement msgBox = driver.findElement(By.xpath("//button[@id=CommentsMessageModelOk']"));
		if(msgBox.isDisplayed() && msgBox.isEnabled()) {
			msgBox.click();
		}
	}
	
	public void SetSplitPagePdf(String fileName,String StartPage,String EndPage, int pos) throws Exception {
		
		WebElement checkbox = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='bodyMain']/div[@id='viewerDiv']/div[@id='docViewerMetaData']/div[@id='"+fileName+"']/div['"+pos+"']/input['"+pos+"']"));
		WebElement thumbnail = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='bodyMain']/div[@id='viewerDiv']/div[@id='docViewerMetaData']/div[@id='"+fileName+"']/div['"+pos+"']/img['"+pos+"']"));
				
		//WebElement thumbnail = driver.findElement(By.id(fileNames[1]));
		checkbox.click();
		thumbnail.click();
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);*/
		Thread.sleep(1000);
		action.moveToElement(Pagemenu).build().perform();
		Reporter.log("Page menu icon is selected ", true);
		Thread.sleep(1000);
		action.click(Split).build().perform();
		Reporter.log("Splitting the pages", true);
		
		//WebElement splitOkButton = driver.findElement(By.xpath("//button[@id='splitDocument']"));
		if( splitOkButton.isDisplayed() && splitOkButton.isEnabled()) {
			Thread.sleep(2000);
			
			pdfStartRange.sendKeys(StartPage.trim());
			pdfEndRange.sendKeys(EndPage.trim());
			Thread.sleep(2000);
			
			// driver.findElement(By.xpath("//input[@id='startRange']"));
			//WebElement  =driver.findElement(By.xpath("//input[@id='endRange']"));
			splitOkButton.click();
			
		}
		
		/*WebElement msgBox = driver.findElement(By.xpath("//button[@id=CommentsMessageModelOk']"));
		if(msgBox.isDisplayed()) {
			msgBox.click();*/
	//}
	}
	
	public void SetDeletePage() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
	/*	WebElement el1 = driver.findElement(By.className("thumbnailOptionSelected"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", el1);*/
//		Reporter.log("Thumbnail is selected ", true);
//		Thread.sleep(2000);
		DeleteBtn.click();
		Thread.sleep(2000);
		DeleteYesBtn.click();
		Thread.sleep(2000);
		FileDeleteOk.click();
		Reporter.log("Document is deleted successfully " ,true);
		
	}
	
	public void SetFullScreen() {
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);*/
//		WebElement el1 = driver.findElement(By.className("thumbnailOptionSelected"));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click()", el1);
        Reporter.log("Thumbnail is selected ", true);
        action.moveToElement(Viewmenu).build().perform();
		Reporter.log("View menu icon is selected ", true);
		action.click(Fullscreen).build().perform();
		Reporter.log("FullScreen icon is selected ", true);
		action.moveToElement(Viewmenu).build().perform();
		action.click(Fullscreen).build().perform();
		Reporter.log("FullScreen icon is selected again ", true);
		action.moveToElement(Viewmenu).build().perform();
		action.click(ShowThumbnail).build().perform();
		Reporter.log("Show thumbnails icon is selected  ", true);
		action.moveToElement(Viewmenu).build().perform();
		action.click(ShowThumbnail).build().perform();
		Reporter.log("Show thumbnails icon is selected again ", true);
		action.click().build().perform();
		action.moveToElement(Viewmenu).build().perform();
		action.click(SinglePage).build().perform();
		Reporter.log("Single page is selected  ", true);
		action.click().build().perform();
		action.moveToElement(Viewmenu).build().perform();
		action.click(DoublePage).build().perform();
		Reporter.log("Double page is selected", true);
		action.click().build().perform();
		action.moveToElement(Viewmenu).build().perform();
		action.click(VerticalPage).build().perform();
		Reporter.log("Vertical page is selected", true);
		action.click().build().perform();
		action.moveToElement(Viewmenu).build().perform();
		action.click(HorizontalPage).build().perform();
		Reporter.log("Horizontal page is selected", true);
		action.click().build().perform();
	}
	public void SetSavePage() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		SaveIcon.click();
		Reporter.log("Document is Saved successfully " ,true);
		Thread.sleep(2000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SaveOKBtn)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		//SaveOKBtn.click();
		
	}
	
	public void SetMail(String Email_ID,String Subject) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		action.moveToElement(shareicon).build().perform();
		Reporter.log("Share icon menu icon is selected ", true);
		action.click(Mail).build().perform();
		Reporter.log("Mail icon is selected ", true);
		
	    //driver.switchTo().activeElement().sendKeys(Email_ID);
		MailEmailID.sendKeys(Email_ID);
		Reporter.log("Email ID is entered ", true);
		//driver.switchTo().activeElement().sendKeys(Subject);
		MailSubject.sendKeys(Subject);
		Reporter.log("Subject is entered ", true);
		MailOkBtn.click();
		Reporter.log("Mail dialog OK button is clicked ", true);
		Thread.sleep(3000);
		//OKbutton.click();
		//vidya
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(OkBtn)); 

//	element1.submit();
		((JavascriptExecutor)driver).executeScript("arguments[0.click();", element1);
		//OkBtn.click();
		//driver.switchTo().alert().accept();
	//action.moveToElement(OkBtn).build().perform();

	}
	
	public void SetPrint() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		action.moveToElement(shareicon).build().perform();
		Reporter.log("Share icon menu icon is selected ", true);
		action.click(PrintDialog).build().perform();
		Reporter.log("Print icon is selected ", true);
		//driver.switchTo().activeElement().click();
		PrintOkBtn.click();
		Reporter.log("Print OK button is clicked ", true);
		Thread.sleep(5000);
		OKbutton.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		   
           js.executeScript("window.print();");
			Thread.sleep(5000);
		
		
	}
	
	public void SetExport() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		action.moveToElement(shareicon).build().perform();
		Reporter.log("Share icon menu icon is selected ", true);
		action.click(ExportDialog).build().perform();
		Reporter.log("Export icon is selected ", true);
		ExportOkBtn.click();
		Reporter.log("Export OK button is clicked ", true);
	}
	public void DownloadAllPages() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(DownloadIcon)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		 Reporter.log("Download all Pages",true);
	
		 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(DownloadYes)); 
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		
	}
	public void DownloadFirstPage() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("thumbnailOptionSelected"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(DownloadIcon)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		 Reporter.log("Download first Page",true);
	
		
		
	}
	public void SetCloseViewer() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CloseVeiwer)); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//CloseVeiwer.click();		
		 Reporter.log("Closing the viewer",true);
		 try {
		  if(CloseVeiwer.isDisplayed()){
		  SaveDialogYesButton.click();
		  SaveOKBtn.click();
  }
	   //SaveDialogNOButton.click();
  }catch(Exception e) {
	  System.out.println("Close dialog is not displayed");
  }
		
	}
}
