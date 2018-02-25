package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



import wdMethods.SeMethods;

public class DevLoginPage extends SeMethods{
	public DevLoginPage()
	{
	
	PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="user_name")
	WebElement eleUname;
	@FindBy(how=How.ID,using="gsft_main")
	WebElement eleFrameId;

	public DevLoginPage enterUserName(String data)
	{
		switchToFrame(eleFrameId);
		type(eleUname, data);
		return this;
	}

	@FindBy(how=How.ID,using="user_password")
	WebElement elePassWord;

	public DevLoginPage enterPassWord(String data)
	{
		type(elePassWord, data);
		return this;
	}

	@FindBy(how=How.ID,using="sysverb_login")
	WebElement eleLogin;

	public DevHomePage clickLogin()
	{
		click(eleLogin);
		return new DevHomePage();
	}

}
