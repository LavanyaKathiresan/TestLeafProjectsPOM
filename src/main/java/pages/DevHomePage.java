package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class DevHomePage extends SeMethods{
	public DevHomePage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="filter")
	WebElement eleFilter;
	public DevHomePage enterIncidentInFilter(String data)
	{		
		type(eleFilter, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//div[text()='Create New'])[1]")
	WebElement eleCreateNew;
	public DevIncidentNew clickCreateNew() throws InterruptedException
	{
//		click(eleCreateNew);
		eleCreateNew.click();
		Thread.sleep(3000);
		System.out.println("Clicked createNew");
		return new DevIncidentNew();

	}

}