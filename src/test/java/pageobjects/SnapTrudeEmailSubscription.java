package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SnapTrudeEmailSubscription extends BaseClass{

	public SnapTrudeEmailSubscription(WebDriver driver)
	{
		super(driver);
	}    

	//For EmailSubscriptionTextBox
	@FindBy(id="email")
	public static WebElement emailSubscriptionTextBox;
	
	//For clicking GetAnInviteButton
	@FindBy(xpath="//button[text()='Get an Invite!']")
	public static WebElement GetAnInviteButton;

	//Click on login button
	@FindBy(xpath="//strong[text()='Login']")
	public static WebElement loginbtn;
	
	//UserName
	@FindBy(id="login_username")
	public static WebElement UserNameEmail;
	
	//Password
	@FindBy(id="login_password")
	public static WebElement login_password;
	
	//SignIn Button
	@FindBy(id="loginForm")
	public static WebElement SignInButton;
	
	//SignOut Button
	@FindBy(xpath="(//i[text()='motorcycle'])[1]")
	public static WebElement SignOutButton;

	//Invalid Credentials
	@FindBy(xpath="//b//div//center//h2//b[text()=' Invalid username or password ']")
	public static WebElement InvalidCredentials;
	
	//Valid Email Subscription
	@FindBy(xpath="//b[text()=' Thank you very much for Subscribing. We will email you the invite soon.']")
	public static WebElement ValidEmailSubscription;
	
	//Invalid Email Subscription
	@FindBy(xpath="//b[text()=' Please enter a valid email address. ']")
	public static WebElement InvalidEmailSubscription;
	
	//Forgot Password
	@FindBy(id="fpassword")
	public static WebElement ForgotPWD;
	
	//Enter Email for Forgot Password
	@FindBy(id="id_email")
	public static WebElement EnterEmailforForgotPwd;
	
	//Reset Password Button
	@FindBy(className="grp-default")
	public static WebElement ResetPwdBtn;
	
	//Reset Msg Verification 
	@FindBy(xpath="//p[@class='grp-description']")
	public static WebElement VerifyPwdResetMsg;
	
}

