package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public FindLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement eleClickPh;

	public FindLeadPage clickPhoneTab() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleClickPh);
		return this;
	}
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhNum;

	public FindLeadPage enterPhoneNum(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(elePhNum, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadButton;

	public FindLeadPage clickFindLeadButton() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleFindLeadButton);
		return this;
	}


	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")					
	private WebElement eleFirstResult;

	public ViewLeadPage clickFirstResult() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleFirstResult);	
		return new ViewLeadPage();

	}


	@FindBy(how=How.NAME,using="id")
	private WebElement eleLeadId;

	public FindLeadPage enterLeadId(String data) {
		type(eleLeadId, data);	
		return this;

	}

	@FindBy(how=How.CLASS_NAME,using="x-paging-info")
	private WebElement eleNoRecord;

	public FindLeadPage verifyNoRecord(String data) {
		verifyExactText(eleNoRecord, data);	
		return this;

	}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;

	public FindLeadPage enterFirstName(String data) {
		type(eleFirstName, data);	
		return this;
	}
	

	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleClickEmail;

	public FindLeadPage clickEmailTab() {
		click(eleClickEmail);
		return this;
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEnterMail;

	public FindLeadPage enterMailId(String data) {
		type(eleEnterMail, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[1]")					
	private WebElement eleFirstResultMerge;

	public MergeLeadPage clickFirstResultMerge() {
		click(eleFirstResultMerge);	
		switchToWindow(0);
		return new MergeLeadPage();

	}
	
	
	
	
	}



