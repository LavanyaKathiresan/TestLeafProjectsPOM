package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{

	public DuplicateLead() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButton;
	public ViewLeadPage clickCreateLead() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleCreateLeadButton);	
		return new ViewLeadPage();

	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButtonMerge;
	public MyLeadPage clickCreateLeadMerge() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleCreateLeadButtonMerge);	
		return new MyLeadPage();

	}
}