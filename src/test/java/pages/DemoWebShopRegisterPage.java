package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class DemoWebShopRegisterPage {

  SelenideElement
          firstNameField = $("#FirstName"),
          lastNameField = $("#LastName"),
          emailField = $("#Email"),
          passwordField = $("#Password"),
          confirmPasswordField = $("#ConfirmPassword"),
          registerButton = $("#register-button"),
          genderField = $(".inputs");


  public void setGender(String value) {
    genderField.$(byText(value)).click();
  }

  public void setFirstName(String value) {
    firstNameField.setValue(value);
  }

  public void setLastName(String value) {
    lastNameField.setValue(value);
  }

  public void setEmail(String value) {
    emailField.setValue(value);
  }

  public void setPassword(String value) {
    passwordField.setValue(value);
  }

  public void setConfirmPassword(String value) {
    confirmPasswordField.setValue(value);
  }

  public void clickRegisterButton() {
    registerButton.click();
  }
}
