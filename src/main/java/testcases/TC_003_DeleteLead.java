package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_003_DeleteLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC_003_DeleteLead";
		testDescription="Delete Lead by giving input as a phonenumber";
		testNodes="Leads";
		category="Smoke";
		authors="Lavanya";
		browserName="chrome";
		dataSheetName="TC003_DeleteLead";
	}
	
	@Test(dataProvider="fetchData")
	
	public void deleteLead(String uName,String pwd,String phNum,String leadId,String noRecord)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.ClickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhoneTab()
		.enterPhoneNum(phNum)
		.clickFindLeadButton()
		.clickFirstResult()
		.clickDelete()
		.clickFindLead()
		.enterLeadId(leadId)
		.clickFindLeadButton()
		.verifyNoRecord(noRecord);
	}

}
