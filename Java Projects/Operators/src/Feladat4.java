import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me 4 integer");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int sumOfTheFirstThreeNumber = num1 + num2 + num3;

        if (sumOfTheFirstThreeNumber == num4){
            System.out.println("The sum of the first 3 numbers are equal with the fourth number");
        }
        else{
            System.out.println("The sum of the first 3 numbers are NOT equal with the fourth number");
        }
    }
}
