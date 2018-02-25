package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_006_MergeLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC_006_MergeLead";
		testDescription="Delete Lead by giving input as a phonenumber";
		testNodes="Leads";
		category="Smoke";
		authors="Lavanya";
		browserName="chrome";
		dataSheetName="TC_006_MergeLead";
	}
	
	@Test(dataProvider="fetchData")
	
	public void deleteLead(String uName,String pwd,String firstLeadId,String toLeadId,String noRecord)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.ClickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickFromLead()
		.enterLeadId(firstLeadId)
		.clickFindLeadButton()
		.clickFirstResultMerge()
		.clickToLead()
		.enterLeadId(toLeadId)
		.clickFindLeadButton()
		.clickFirstResultMerge()
		.clickMergeLeadButton()
		.clickDuplicate()
		.clickCreateLeadMerge()
		.clickFindLead()
		.enterLeadId(firstLeadId)
		.clickFindLeadButton()
		.verifyNoRecord(noRecord);
		}

}
