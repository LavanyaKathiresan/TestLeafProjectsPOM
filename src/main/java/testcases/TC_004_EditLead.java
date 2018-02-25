package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_004_EditLead";
		testDescription="Editing lead";
		testNodes="Leads";
		category="Smoke";
		authors="Lavanya";
		browserName="chrome";
		dataSheetName="TC_004_EditLead";
	}
	
	@Test(dataProvider="fetchData")
	//public void createLead(String uName,String pwd,String cName,String fName,String lName,String companyName)
	public void editLead(String uName,String pwd,String fName,String cName)

	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.ClickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(fName)
		.clickFirstResult()
		.clickEdit()
		.editCompanyName(cName)
		.clickUpdateButton()
		.verifyCompanyName(cName);
		
	}

}
