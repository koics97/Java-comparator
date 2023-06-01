import java.util.Scanner;

public class Feladat10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me two numbers of double:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println("The first number is greater then the second");
        } else if (num1 < num2) {
            System.out.println("The second number is greater then the first");
        } else {
            System.out.println("The two numbers are equal");
        }
    }
}
