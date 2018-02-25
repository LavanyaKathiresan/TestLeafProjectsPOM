package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DevIncidentNew;
import pages.DevLoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateIncident extends ProjectMethods {

	@BeforeTest
	public void setData() {

		//Used in before class
		testCaseName="TC002_CreateIncident";
		testDescription="Reporting an incident";
		//Used in before method
		testNodes="Incidents";
		category="Smoke";
		authors="Lavanya";
		browserName="chrome";
		//Ued in @test -A data provider called get sheet
		dataSheetName="TC002_CreateIncident";
	}
	@Test(dataProvider="fetchData")
	public void createIncident(String uName,String password,String caller,String description) throws InterruptedException
	{
		new DevLoginPage()
		.enterUserName(uName)
		.enterPassWord(password)
		.clickLogin()
		.enterIncidentInFilter("Incident")
		.clickCreateNew()
		.copyNumber()
		.clickCaller()
		.searchCaller(caller)
		.selectFirstCaller()
		.enterShortDes(description)
		.clickSubmit()
		.enterIncidentInFilter(DevIncidentNew.incidentNum)
		.verifyIncidentNum(DevIncidentNew.incidentNum);
	}


}
