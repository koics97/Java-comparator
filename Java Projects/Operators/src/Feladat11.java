import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a text here:");
        String text = scanner.nextLine();
        System.out.println("Give me an integer:");
        int num = scanner.nextInt();

        if (text.length() > num){
            System.out.println("The length of the text is greater then the number you gave");
        } else if (text.length() < num) {
            System.out.println("The number is greater then the length of the text you typed in");
        } else {
            System.out.println("The length of the text and the number you gave are equal");
        }
    }
}
