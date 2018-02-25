package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVeifyCompany;

	public ViewLeadPage verifyCompanyName(String data) {
		//WebElement eleUserName = locateElement("usernama");
		verifyPartialText(eleVeifyCompany, data);	
		return this;

	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDeleteButton;

	public MyLeadPage clickDelete()
	{
		click(eleDeleteButton);
		return new MyLeadPage();

	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateButton;

	public DuplicateLead clickDuplicate()
	{
		click(eleDuplicateButton);
		return new DuplicateLead();

	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirst;

	public ViewLeadPage verifyFirstName(String data) {
		//WebElement eleUserName = locateElement("usernama");
		verifyPartialText(eleVerifyFirst, data);	
		return this;
}
	@FindBy(how=How.LINK_TEXT,using="Edit")					
	private WebElement eleEditButton;

	public EditLeadPage clickEdit() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleEditButton);	
		return new EditLeadPage();

	}
}