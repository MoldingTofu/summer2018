import java.util.Scanner;

public class cipher {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String passage;
    int shift;

    System.out.print("Enter sentence: ");
    passage = reader.nextLine();
    System.out.print("Enter shift value: ");
    shift = reader.nextInt();
    reader.nextLine();

    System.out.println("New sentence: " + cipher(passage, shift));
  }

  public static String cipher(String passage, int shift) {
    char[] chars = passage.toCharArray();
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
