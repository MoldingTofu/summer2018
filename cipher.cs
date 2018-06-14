using System;

namespace summer2018 {
  class cipher {
    static void Main(string[] args) {

    }

    static String cipher(String passage, int shift) {
      char[] chars = passage.toCharArray;
      String newPassage = "";

      for (int i = 0; i < chars.length; i++) {
        if (chars[i] == 32) {
          newPassage += chars[i];
        } else if ((int) chars[i] + shift > 90 && (int) chars[i] <= 90) {
          newPassage += (char) ((int) chars[i] + shift - 25);
        } else if ((int) chars[i] + shift > 122 && (int) chars[i] <= 122) {
          newPassage += (char) ((int) chars[i] + shift - 25);
        } else {
          newPassage += (char) ((int) chars[i] + shift);
        }
      }

      return newPassage;
    }
  }
}
