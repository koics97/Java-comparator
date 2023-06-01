import java.util.Scanner;

public class Feladat9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a text here:");
        String text1 = scanner.nextLine();
        System.out.println("Please type another text here:");
        String text2 = scanner.nextLine();

        int charSumOfTexts = text1.length() + text2.length();

        System.out.printf("The number of the characters of your texts is " + charSumOfTexts);
    }
}
