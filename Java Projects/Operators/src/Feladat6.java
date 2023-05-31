import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an integer");
        int num = scanner.nextInt();

        if (num % 7 == 0){
            System.out.println("The number can be divided with 7");
        }
        else {
            System.out.println("The number cannot be divided with 7");
        }
    }
}
