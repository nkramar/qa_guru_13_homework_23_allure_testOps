package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DemoWebShopRegisterResultPage {

  SelenideElement
          accountData = $(".account"),
          successfulRegistrationText = $(".result");



  public void shouldBeAuthorized(String value) {
    accountData.shouldHave(text(value));
  }

  public void shouldHaveSuccessfulRegistrationText(String value) {
    successfulRegistrationText.shouldHave(text(value));
  }

}
