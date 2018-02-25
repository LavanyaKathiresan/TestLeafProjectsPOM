package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class DevIncidentNew extends SeMethods {
	public DevIncidentNew()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="gsft_main")
	WebElement eleFrame;
	@FindBy(how=How.ID,using="incident.number")
	WebElement eleIncidentNum;
	/*public String copyNumber() throws InterruptedException
	{		
		switchToFrame(eleFrame);
		Thread.sleep(5000);
		String incidentNum = getAttribute(eleIncidentNum, "value");
		return incidentNum;
	}*/
	public static String incidentNum;
	
	public DevIncidentNew copyNumber() throws InterruptedException
	{		
		switchToFrame(eleFrame);
		Thread.sleep(5000);
		 incidentNum = getAttribute(eleIncidentNum, "value");
		 System.out.println(incidentNum);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//span[@class='icon icon-search'])[1]")
	WebElement eleCaller;
	public DevUsers clickCaller() throws InterruptedException
	{
//		click(eleCaller);
		eleCaller.click();
		System.out.println("Cliked");
		Thread.sleep(1000);
		switchToWindow(1);

		return new DevUsers();

	}

	@FindBy(how=How.ID,using="incident.short_description")
	WebElement eleShortDesc;
	public DevIncidentNew enterShortDes(String data)
	{	switchToFrame(eleFrame);

		type(eleShortDesc, data);
		
		return this;

	}

	@FindBy(how=How.ID,using="sysverb_insert")
	WebElement eleSub;
	public DevAllIncidentsPage clickSubmit()
	{
		click(eleSub);		
		//switchToFrame(eleFrame);
		return new DevAllIncidentsPage();

	}

}