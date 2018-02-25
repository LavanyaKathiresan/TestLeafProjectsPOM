
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class DevUsers extends SeMethods{
	public DevUsers()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//div[@class='input-group']/span/following-sibling::input")
	WebElement eleSearchCaller;
	public DevUsers searchCaller(String data) throws InterruptedException
	{
		typeAndPressEnter(eleSearchCaller, data);
		Thread.sleep(2000);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//a[@class='glide_ref_item_link'])[1]")
	WebElement eleSelectCaller;


	public DevIncidentNew selectFirstCaller()
	{
		click(eleSelectCaller);
		switchToWindow(0);
		return new DevIncidentNew();

	}
}