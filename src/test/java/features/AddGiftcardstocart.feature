Feature:Add to cart GiftCards
  In order to Add gift cards to cart
 I should go to url click on GiftCards fill all the details and click on AddToCart button

  //Background:navigate to url page
    //Given i navigate to url "https://demo.nopcommerce.com/"
    //Then  i should be navigated to home page
    //When i click on GiftCards link from nav bar
    //Then i go to  GiftCards page
@endtoend
  Scenario: Adding GiftCards To Cart positive and negative case
  Given i navigate to url "https://demo.nopcommerce.com/"
  Then  i should be navigated to home page
  When i click on GiftCards link from nav bar
  And i click on product link
  And i click on $50 GiftCard AddToCart
    Then i get error message as "Enter valid recipient name"
    When i close the error message
    When i enter Recipient'sName YourName Message
                  |Recipient'sName  |   YourName |Message|
                   | Silpa|M|   Hi                           |
  And i click on $50 GiftCard AddToCart
    Then product added to the cart and i should see "The product has been added to your" message



