package step_definitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.SnapTrudeAction;
import pageobjects.SnapTrudeEmailSubscription;


public class SnapTrudeLoginSteps {
	
	 public WebDriver driver;
	    
	    public SnapTrudeLoginSteps()
	    {
	    	driver = Hooks.driver;
	    }
	
	@Given("^navigate to URL$")
	public void navigatetoUrl()
	{
		driver.get("http://www.snaptrude.com/");
			
	}
	
	@When ("^User Enters the EmailID \"(.*)\" for Subscription$")	
	public void EmailIDSubscription(String EmailID)
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.EmailSubscription(driver,EmailID);
	}
	
	@And ("^Click on Get An Invite button$")	
	public void ClickOnGetInviteButton() throws InterruptedException
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.GetAnInviteBtn(driver);
	}
	
	@When ("^User clicks on Login Button$")	
	public void ClickOnLoginButton() throws InterruptedException
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.LoginButton(driver);
	}
	
	@When ("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")	
	public void loginByEnteringCredentials(String logusername,String logpassword)
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.LoginCredentials(driver,logusername,logpassword);
	}
	
	@When ("^User click On SignIn$")	
	public void ClickOnSignInButton() throws IOException, InterruptedException
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.SignIn(driver);
	}
	
	@When ("^User Clicks on SignOut$")	
	public void UserClicksonSignOut()
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.SignOut(driver);
	}
	
	@When ("^verify invalid username and password message displayed$")	
	public void verify_invalid_crdentials()
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.invalidcredentials(driver);
	}
	
	@Then ("^verify valid emailID given for subscription$")	
	public void verify_Valid_Email_Subscription()
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.ValidEmailSubscription(driver);
	}
	
	@Then ("^verify invalid Email is displayed$")	
	public void verify_InValid_Email_Subscription()
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.InValidEmailSubscription(driver);
	}
	
	@When ("^Click on Forgot Password$")	
	public void UserClicksOnForgotPassword()
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.ForgotPassword(driver);
	}
	
	@When ("^Enters the EmailID \"(.*)\"$")	
	public void EmailIDForForgotPwd(String Email) throws InterruptedException
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.EnterEmailForForgotPassword(driver, Email);
	}
	
	@When ("^Click on Reset My Password Button$")	
	public void UserClicksOnPasswordResetBtn()
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.ResetPasswordBtn(driver);
	}
	
	@Then ("^Verify PasswordReset Message$")	
	public void VerifyPwdResetMsgs()
	{
	
		PageFactory.initElements(driver, SnapTrudeEmailSubscription.class);
		SnapTrudeAction.VerifyPwdResetMsg(driver);
	}
	
	@When ("^Verify Home page$")	
	public void VerifyHomePage()
	{
	
		//PageFactory.initElements(driver);
		SnapTrudeAction.VerifyHomePage(driver);
	}
	
}

