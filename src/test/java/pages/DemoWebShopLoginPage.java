package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DemoWebShopLoginPage {

  SelenideElement loginField = $("#Email"),
          passwordField = $("#Password"),
          accountData = $(".account");

  public DemoWebShopLoginPage setLogin(String value) {
    loginField.setValue(value);
    return this;
  }

  public void setPassword(String value) {
    passwordField.setValue(value).pressEnter();
  }

  public DemoWebShopLoginPage shouldBeAuthorized(String value) {
    accountData.shouldHave(text(value));
    return this;
  }
}
