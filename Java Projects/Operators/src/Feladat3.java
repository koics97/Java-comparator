import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an integer");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println("The number is positive");
        }
        else if (num < 0){
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is 0");
        }
    }
}
