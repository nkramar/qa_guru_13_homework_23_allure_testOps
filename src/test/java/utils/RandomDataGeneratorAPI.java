package utils;

import java.util.Random;

public class RandomDataGeneratorAPI {
  public static String randomGender() {
    String[] gender = new String[]{"M", "F"};
    Random random = new Random();
    String randomGender = gender[random.nextInt(gender.length)];
    return randomGender;
  }
}
