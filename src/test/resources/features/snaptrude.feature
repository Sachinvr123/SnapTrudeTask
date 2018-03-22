Feature: Feature File for snaptrude
@Validlogin
Scenario Outline: Valid Email Subscription
Given navigate to URL
When User Enters the EmailID "Snaptrude@snaptrude.com" for Subscription
And Click on Get An Invite button

Then verify valid emailID given for subscription
When User clicks on Login Button
And user logged in using username as "<Username>" and password as "<Password>"
And User click On SignIn
Then Verify Home page
And User Clicks on SignOut

Examples: 
| Username | Password |
| Snaptrude@snaptrude.com | test12345 |

@InValidlogin
Scenario Outline:: InValid Login details
Given navigate to URL
When User Enters the EmailID "Snaptrude@snaptrude.com" for Subscription
And Click on Get An Invite button
Then verify valid emailID given for subscription
When User clicks on Login Button
And user logged in using username as "<Username>" and password as "<Password>"
And User click On SignIn
Then verify invalid username and password message displayed

Examples: 
| Username | Password |
| Sachinvr | Welcome42 |
|  |  |
| Sachinvr |  |
| abcd@gmail.com |  |
|  | test12345 |

@InvalidEmailSubscription
Scenario: InValid Email Subscription
Given navigate to URL
When User Enters the EmailID "abcd" for Subscription
And Click on Get An Invite button
Then verify invalid Email is displayed

@ForgotPassword
Scenario: Forgot Password
Given navigate to URL
When User Enters the EmailID "Snaptrude@snaptrude.com" for Subscription
And Click on Get An Invite button
Then verify valid emailID given for subscription
When User clicks on Login Button
And Click on Forgot Password
And Enters the EmailID "Snaptrude@snaptrude.com"
And Click on Reset My Password Button
Then Verify PasswordReset Message