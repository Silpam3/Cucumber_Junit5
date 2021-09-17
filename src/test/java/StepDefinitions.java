import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions
{

    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;
    String registerPageExpectedTitle= "nopCommerce demo store. Register";
    String registerPageActualTitle;
    String loginPageExpectedTitle = "nopCommerce demo store. Login";
    String loginPageActualTitle;
    String Expectederrormsg="Only registered users can vote.";
    String actualerrormsg;
    String ExpectedFirstnameererrorMsg="First name is required.";
    String actualFirstnameErrorMsg;
    String ExpectedLastnameerrorMsg="Last name is required.";
    String actualLastnameErrorMsg;
    String ExpectedEmailerrorMsg="Email is required.";
    String actualEmailerrorMsg;
    String ExpectedPassowrderrorMsg="Password is required." ;
    String actualPassworderrorMsg;
    String ExpectedConfirmpassworderrorMsg="Password is required.";
    String actualConfirmpassowrderrorMsg;
     String actualitemaddedmsg;
     String Expectedconfirmmsg="The product has been added to your ";

     String actualerrormsg1;
     String expectederrormsg2="Enter valid sender name";
     String actualerrormsg2;
     String expgiftcardspagetitle="nopCommerce demo store. Gift Cards";
     String actualgiftcardspagetitle;
     String Expected$50giftcardpagetitle="nopCommerce demo store. $50 Physical Gift Card";
     String actual$50giftcardpagetitle;





    @Given("i navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        BasePage.navigateToUrl(url);
    }

    @Then("i should be navigated to home page")
    public void i_should_be_navigated_to_home_page()
    {
        homePageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);
    }

    @When("i click on log in link from the nav bar")
    public void i_click_on_log_in_link_from_the_nav_bar()
    {
        BasePage.homePage.clickLoginLink();
    }

    @Then("i should be navigated to login page")
    public void i_should_be_navigated_to_login_page()
    {
        loginPageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(loginPageExpectedTitle,loginPageActualTitle);
    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String email)
    {
        BasePage.loginPage.enterEmail(email);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String password)
    {
        BasePage.loginPage.enterPassword(password);
    }

    @When("i click on log in button")
    public void i_click_on_log_in_button()
    {
        BasePage.loginPage.clickLogin();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
        BasePage.homePage.verifyLogout();
    }

    @When("i click on register link from the nav bar")
    public void i_click_on_register_link_from_the_nav_bar()
    {
        BasePage.homePage.clickRegisterLink();
    }

    @Then("i should be navigated to register page")
    public void i_should_be_navigated_to_register_page()
    {

    }
    @When("i click on community poll and select excellent option")
    public void i_click_on_community_poll_and_select_excellent_option()
    {
        BasePage.homePage.clickonExcellentbutton();
    }

    @Then("the radio button of excellent should be selected")
    public void the_radio_button_of_excellent_should_be_selected()
    {

    }

    @When("i click on Vote button")
    public void i_click_on_vote_button()
    {
       BasePage.homePage.clickonVotebutton();
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed()
    {

        actualerrormsg = BasePage.homePage.capturepollerrormsg();
       Assertions.assertEquals(Expectederrormsg,actualerrormsg);
    }

    @Then("i should be printing error message into console")
    public void i_should_be_printing_error_message_into_console()
    {
       actualerrormsg=BasePage.homePage.pollerrormsg.getText();
    }
    @Then("i go to registration page")
    public void i_go_to_registration_page()
    {
      BasePage.homePage.clickRegisterLink();
    }
    @When("i click on register button")
    public void i_click_on_register_button()
    {
        BasePage.registerPage.clickRegisterButton();
    }

    /* @Then("i get error messages")
    public void i_get_error_messages() {

        actualFirstnameExpectedMsg=BasePage.registerPage.capturefirstnameErrormsg();
        System.out.println(actualFirstnameExpectedMsg);
        Assertions.assertEquals(actualFirstnameExpectedMsg,ExpectedFirstnameererrorMsg);

    }

     */

    @Then("print all error messages to console")
    public void print_all_error_messages_to_console()
    {
        throw new io.cucumber.java.PendingException();
    }




    @Then("i get error message for Firstname")
    public void iGetErrorMessageForFirstname()
    {
    actualFirstnameErrorMsg=BasePage.registerPage.capturefirstnameErrormsg();
    Assertions.assertEquals(ExpectedFirstnameererrorMsg,actualFirstnameErrorMsg);
    }


    @And("i get error message for Lastname")
    public void iGetErrorMessageForLastname()
    {
       actualLastnameErrorMsg=BasePage.registerPage.capturelastnameErrormsg();
       Assertions.assertEquals(ExpectedLastnameerrorMsg,actualLastnameErrorMsg);
    }

    @And("i get error message for Email")
    public void iGetErrorMessageForEmail()
    {
      actualEmailerrorMsg=BasePage.registerPage.captureemailerrorMsg();
      Assertions.assertEquals(ExpectedEmailerrorMsg,actualEmailerrorMsg);
    }
    @And("i get error message for Password")
    public void iGetErrorMessageForPassword()
    {
      actualPassworderrorMsg=BasePage.registerPage.capturepassworderrorMsg();
      Assertions.assertEquals(ExpectedPassowrderrorMsg,actualPassworderrorMsg);
    }
    @And("i get error message for ConfirmPassword")
    public void iGetErrorMessageForConfirmPassword()
    {
      actualConfirmpassowrderrorMsg=BasePage.registerPage.captureconfirmpassworderrorMsg();
      Assertions.assertEquals(ExpectedConfirmpassworderrorMsg,actualConfirmpassowrderrorMsg);
    }

    @When("i click on GiftCards link from nav bar")
    public void iClickOnGiftCardsLinkFromNavBar()
    {
      BasePage.homePage.clickongiftcardslink();
    }

   /* @Then("i go to  GiftCards page")
    public void iGoToGiftCardsPage()
    {

        actualgiftcardspagetitle=BasePage.giftCardsPage.giftcardspagetitle();
        System.out.println(actualgiftcardspagetitle);
       Assertions.assertEquals(expgiftcardspagetitle,actualgiftcardspagetitle);

    }

    */

   /*@When("i click on AddToCart button")
   public void iClickOnAddToCartButton()
   {
       BasePage.giftCardsPage.clickonAddtoCart();

   }

    */
   @When("i click on product link")
   public void iClickOnProductLink()
   {
       BasePage.giftCardsPage.clickonproductLink();
   }

    @When("i click on ${int} GiftCard AddToCart")
    public void iClickOn$GiftCardAddToCart(int arg0)  {
       BasePage.giftCardsPage.clickonaddtocart2();
    }
/*
    @Then("i go to ${int} GiftCard page")
    public void iGoTo$GiftCardPage(int arg0)
    {
       actual$50giftcardpagetitle=BasePage.giftCardsPage.verify$50giftcardtitle();
       Assertions.assertEquals(Expected$50giftcardpagetitle,actual$50giftcardpagetitle);

    }

 */

    @Then("i get error message as {string}")
    public void iGetErrorMessageAs(String expectederrormsg1)
    {
        actualerrormsg1=BasePage.giftCardsPage.errormsg1();
        Assertions.assertEquals(expectederrormsg1,actualerrormsg1);
        actualerrormsg2=BasePage.giftCardsPage.errormsg2();
        Assertions.assertEquals(expectederrormsg2,actualerrormsg2);


    }

    @When("i close the error message")
    public void iCloseTheErrorMessage()
    {
        BasePage.giftCardsPage.closingerrorwindow();
    }

    @When("i enter Recipient'sName YourName Message")
    public void iEnterRecipientSNameYourNameMessage(io.cucumber.datatable.DataTable dataTable)
    {
       BasePage.giftCardsPage.entertextintorecipientname(dataTable.cell(1,0));
       BasePage.giftCardsPage.entertextintoyourname(dataTable.cell(1,1));
       BasePage.giftCardsPage.entertextintomessage(dataTable.cell(1,2));

    }



    @Then("product added to the cart and i should see {string} message")
    public void productAddedToTheCartAndIShouldSeeMessage(String Confirmmessage)
    {
       actualitemaddedmsg= BasePage.giftCardsPage.itemaddedmsg();
       Assertions.assertEquals(Confirmmessage,actualitemaddedmsg);
    }



}
