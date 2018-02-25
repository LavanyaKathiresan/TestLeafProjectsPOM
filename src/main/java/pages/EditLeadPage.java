package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleEditCompanyName;

	public EditLeadPage editCompanyName(String data) {
		type(eleEditCompanyName, data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleUpdateButton;

	public ViewLeadPage clickUpdateButton() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleUpdateButton);	
		return new ViewLeadPage();

	}
}