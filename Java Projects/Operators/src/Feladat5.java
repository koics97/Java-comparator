import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an integer");
        int num = scanner.nextInt();

        if (num < 80){
            System.out.println("The number is lesser than 80");
        }
        else if (num > 80){
            System.out.println("The number is greater than 80");
        }
        else{
            System.out.println("The number is exactly 80");
        }
    }
}
