import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a double");
        double num = scanner.nextDouble();

        if (num * 6 > 100){
            System.out.println("The 6 times of the number value is greater then 100");
        }
        else if (num * 6 < 100){
            System.out.println("The 6 times of the number value is lesser then 100");
        }
        else{
            System.out.println("The 6 times of the number value is equal with 100");
        }
    }
}
