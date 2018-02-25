package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{

	public MyLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeadClick;

	public CreateLeadPage  clickCreateLead() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleCreateLeadClick);
		return new CreateLeadPage();
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadClick;

	public FindLeadPage  clickFindLead() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleFindLeadClick);
		return new FindLeadPage();
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeadClick;

	public MergeLeadPage  clickMergeLead() {
		//WebElement eleUserName = locateElement("usernama");
		click(eleMergeLeadClick);
		return new MergeLeadPage();
	}
}
