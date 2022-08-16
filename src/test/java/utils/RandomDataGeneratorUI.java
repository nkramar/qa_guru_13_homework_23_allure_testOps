package utils;

import java.util.Random;

public class RandomDataGeneratorUI {
  public static String randomGender() {
    String[] gender = new String[]{"Male", "Female"};
    Random random = new Random();
    String randomGenderUI;
    randomGenderUI = gender[random.nextInt(gender.length)];
    return randomGenderUI;
  }
}
