package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class DemoWebShopUiTests extends TestBase {

  @Test
  @Tag("UI")
  @DisplayName("Authorize on DemoWebShop website (UI)")
  void loginTest() {

    step("Open login page", () -> {
      open(loginUrl);
    });

    step("Fill in login form", () -> {
      demoWebShopLoginPage.setLogin(login);
      demoWebShopLoginPage.setPassword(password);
    });

    step("Verify successful authorization", () -> {
      demoWebShopLoginPage.shouldBeAuthorized(login);
    });
  }

  @Test
  @Tag("UI")
  @DisplayName("Register new user on DemoWebShop website (UI)")
  void registrationTest() {

    step("Open registration page", () -> {
      open(registerUrl);
    });

    step("Fill in required data", () -> {
      demoWebShopRegisterPage.setGender(testData.genderIU);
      demoWebShopRegisterPage.setFirstName(testData.firstName);
      demoWebShopRegisterPage.setLastName(testData.lastName);
      demoWebShopRegisterPage.setEmail(testData.email);
      demoWebShopRegisterPage.setPassword(testData.password);
      demoWebShopRegisterPage.setConfirmPassword(testData.confirmPassword);

    });
    step("Click on registration button", () -> {
      demoWebShopRegisterPage.clickRegisterButton();

    });

    step("Verify successful authorization", () -> {
      demoWebShopRegisterResultPage.shouldBeAuthorized(testData.email);
      demoWebShopRegisterResultPage.shouldHaveSuccessfulRegistrationText("Your registration completed");
    });
  }
}
