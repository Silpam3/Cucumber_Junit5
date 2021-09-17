package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftCardsPage
{
   WebDriver driver;

   @FindBy(xpath = "(//button[text()='Add to cart'])[2]")
   public WebElement addtocart2;

   @FindBy(id="giftcard_44_RecipientName")
   public WebElement Recipientname;

   @FindBy(id = "giftcard_44_SenderName")
   public WebElement Yourname;

   @FindBy(id="giftcard_44_Message")
   public WebElement Message;

   @FindBy(id="add-to-cart-button-44")
   public WebElement AddtoCart;

   @FindBy(xpath = "//p[text()='Enter valid recipient name']")
   public WebElement Addtocarterrormsg1;

   @FindBy(xpath = "//p[text()='Enter valid sender name']")
   public WebElement Addtocarterrormsg2;

   @FindBy(className = "close")
   public WebElement close;

   @FindBy(className = "content")
   public WebElement confirmtocart;

   @FindBy(xpath = "(//a[text()='$50 Physical Gift Card'])[2]")
   public WebElement productLink;




   public void clickonAddtoCart()
   {

      WebDriverWait wait=new WebDriverWait(driver,30);
      wait.until(ExpectedConditions.elementToBeClickable(addtocart2));
      addtocart2.click();
   }
   public void entertextintorecipientname(String rn)
   {
      Recipientname.sendKeys(rn);
   }
   public void entertextintoyourname(String yn)
   {
      Yourname.sendKeys(yn);
   }
   public void entertextintomessage(String m)
   {
      Message.sendKeys(m);
   }
   public void clickonaddtocart2() {

      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView();",AddtoCart);

      WebDriverWait wait=new WebDriverWait(driver,30);
      wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));

      AddtoCart.click();
   }
   public  String errormsg1()

   {
    return Addtocarterrormsg1.getText();

   }
   public String errormsg2()
   {
    return Addtocarterrormsg2.getText();
   }
   public String itemaddedmsg()
   {
      return confirmtocart.getText();
   }
   public String giftcardspagetitle()
   {
      return driver.getTitle();
   }
   public void closingerrorwindow()
   {
      close.click();
   }
   public String verify$50giftcardtitle()
   {
      return driver.getTitle();
   }
   public void clickonproductLink()
   {
      JavascriptExecutor js = (JavascriptExecutor) driver;

      js.executeScript("arguments[0].scrollIntoView();",productLink);

      WebDriverWait wait=new WebDriverWait(driver,30);
      wait.until(ExpectedConditions.elementToBeClickable(productLink));

      productLink.click();
   }

}
