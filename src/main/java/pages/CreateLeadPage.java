package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;

	public CreateLeadPage enterCompanyName(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(eleCompanyName, data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefName;

	public CreateLeadPage enterFirstName(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(elefName, data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelName;

	public CreateLeadPage enterLastName(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(elelName, data);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButton;

	public ViewLeadPage clickCreateLead() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleCreateLeadButton);	
		return new ViewLeadPage();

	}
}