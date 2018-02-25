package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class DevAllIncidentsPage extends SeMethods{
	public DevAllIncidentsPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="(//input[@class='form-control'])[1]")
	WebElement eleIncidentNum;
	public DevAllIncidentsPage enterIncidentInFilter(String data) throws InterruptedException
	{		
		typeAndPressEnter(eleIncidentNum, data);
		Thread.sleep(5000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='linked formlink']")
	WebElement eleIncidentNumVerify;
	public DevAllIncidentsPage verifyIncidentNum(String data) throws InterruptedException
	{		
		verifyExactText(eleIncidentNumVerify, data);
		return this;
	}

}