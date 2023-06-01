import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a text here");
        String text = scanner.nextLine();

        System.out.println("The length of your text is " + text.length() + " character");
    }
}
