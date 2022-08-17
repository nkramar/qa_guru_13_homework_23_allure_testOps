package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class DemoWebShopManualTests {

  @Test
  @Manual
  @Tag("Manual")
  @Owner("nkramar")
  @Feature("Authorization")
  @Story("Unsuccessful authorization")
  @DisplayName("Check unsuccessful authorization")
  public void authTest() {
    step(" Open login page");
    step(" Fill in login field with valid data: petr.petrov@gmail.com");
    step(" Fill in password field with invalid data: abcdef11");
    step(" Click login button");
    step(" Check error text, which is 'The credentials provided are incorrect'");
  }
}
