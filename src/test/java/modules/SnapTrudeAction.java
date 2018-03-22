package modules;




import java.io.IOException;
import org.openqa.selenium.WebDriver;
import pageobjects.SnapTrudeEmailSubscription;


public class SnapTrudeAction{
	
		//For Email Subscription
			public static void EmailSubscription(WebDriver driver,String Email)
			{
				SnapTrudeEmailSubscription.emailSubscriptionTextBox.sendKeys(Email);
				
			}
		
		// Click on Get Invite Button
			public static void GetAnInviteBtn(WebDriver driver) throws InterruptedException
			{
			
			SnapTrudeEmailSubscription.GetAnInviteButton.click();
			Thread.sleep(7000);
//			String Text=driver.findElement(By.xpath("//b[contains(text(),'much for Subscribing')]")).getText();
//			System.out.println(Text);
			
//			String InvalidEmailSub=driver.findElement(By.xpath("//b[contains(text(),'Please enter a valid email')]")).getText();
//			System.out.println(InvalidEmailSub);
//		    WebDriverWait wait=new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'much for Subscribing')]")));
			}
		
		// Click on Login
			public static void LoginButton(WebDriver driver) throws InterruptedException
			{
			SnapTrudeEmailSubscription.loginbtn.click();
			Thread.sleep(3000);
			}
		
		//Enter UserName and Password
			public static void LoginCredentials(WebDriver driver,String username,String password)
			{
			SnapTrudeEmailSubscription.UserNameEmail.sendKeys(username);
			SnapTrudeEmailSubscription.login_password.sendKeys(password);
			}
		
		//Click on SignIn Button
			public static void SignIn(WebDriver driver) throws IOException, InterruptedException
			{
			SnapTrudeEmailSubscription.SignInButton.click();
			Thread.sleep(7000);

//			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			org.apache.commons.io.FileUtils.copyFile(src, new File("C:/SnapTrude/Valid.png"));
			

//			String InvalidUnPwd=driver.findElement(By.xpath("//b[contains(text(), 'Invalid')]")).getText();
//			System.out.println(InvalidUnPwd);	
			}
		
			public static void VerifyHomePage(WebDriver driver)
			{
				String Title=driver.getTitle();
				System.out.println("The Title is  "+Title);
			}
			
			//Click on SignOut 
			public static void SignOut(WebDriver driver)
			{
			SnapTrudeEmailSubscription.SignOutButton.click();
			}
		
			//Invalid Credentials
			public static void invalidcredentials(WebDriver driver)
			{
			String InvalidUnPwd=SnapTrudeEmailSubscription.InvalidCredentials.getText();
			//String InvalidUnPwd=driver.findElement(By.xpath("//b[contains(text(), 'Invalid')]")).getText();
			System.out.println("Invalid Username or Password "+InvalidUnPwd);
			//org.testng.Reporter.log(InvalidUnPwd, true);
			}
		
			//Valid Email
			public static void ValidEmailSubscription(WebDriver driver)
			{
			String ValidEmailSubscription=SnapTrudeEmailSubscription.ValidEmailSubscription.getText();
			System.out.println(ValidEmailSubscription);
			//org.testng.Reporter.log(ValidEmailSubscription, true);
			}
		
			//Invalid Email
			public static void InValidEmailSubscription(WebDriver driver)
			{
			String InValidEmailSubscription=SnapTrudeEmailSubscription.InvalidEmailSubscription.getText();
			System.out.println(InValidEmailSubscription);
			//org.testng.Reporter.log(InValidEmailSubscription, true);
			}
		
			//Forgot Password
			public static void ForgotPassword(WebDriver driver)
			{
			SnapTrudeEmailSubscription.ForgotPWD.click();
			}
		
			//Enter Email for Forgot Password Text box
			public static void EnterEmailForForgotPassword(WebDriver driver,String Email) throws InterruptedException
			{
			SnapTrudeEmailSubscription.EnterEmailforForgotPwd.sendKeys(Email);
			Thread.sleep(3000);
			}
		
			//For Reset Password
			public static void ResetPasswordBtn(WebDriver driver)
			{
			SnapTrudeEmailSubscription.ResetPwdBtn.click();
			}
		
			//For Verifying Password Reset message
			public static void VerifyPwdResetMsg(WebDriver driver)
			{
			String VerifyPasswordwdResetMsg=SnapTrudeEmailSubscription.VerifyPwdResetMsg.getText();
			System.out.println(VerifyPasswordwdResetMsg);
			//org.testng.Reporter.log(VerifyPasswordwdResetMsg, true);
			}
		
}
