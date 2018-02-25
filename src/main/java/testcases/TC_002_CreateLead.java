package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_002_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_002_CreateLead";
		testDescription="Creating lead";
		testNodes="Leads";
		category="Smoke";
		authors="Lavanya";
		browserName="chrome";
		dataSheetName="TC002_createLead";
	}
	
	@Test(dataProvider="fetchData")
	//public void createLead(String uName,String pwd,String cName,String fName,String lName,String companyName)
	public void createLead(String uName,String pwd,String cName,String fName,String lName)

	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.ClickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead()
		.verifyCompanyName(cName);
		
	}

}
