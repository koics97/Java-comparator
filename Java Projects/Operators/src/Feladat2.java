import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give us 3 integer");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;

        if (sum == 180){
            System.out.println("The sum of the 3 numbers are exactly 180");
        }
        else{
            System.out.println("The sum of the 3 numbers are NOT equal with 180");
        }
    }
}
