package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_005_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_005_DuplicateLead";
		testDescription="Duplicate lead";
		testNodes="Leads";
		category="Smoke";
		authors="Lavanya";
		browserName="chrome";
		dataSheetName="TC_005_DuplicateLead";
	}
	
	@Test(dataProvider="fetchData")
	//public void createLead(String uName,String pwd,String cName,String fName,String lName,String companyName)
	public void duplicateLead(String uName,String pwd,String mailId,String fName)

	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.ClickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickEmailTab()
		.enterMailId(mailId)
		.clickFindLeadButton()
		.clickFirstResult()
		.clickDuplicate()
		.clickCreateLead()
		.verifyFirstName(fName);
		
	}

}
