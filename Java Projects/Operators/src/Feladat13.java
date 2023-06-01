import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me 3 integer:");
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        int indexOfBiggest = 0;
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > numbers[indexOfBiggest]){
                indexOfBiggest = i;
            }
        }
        if (numbers[0] == numbers[indexOfBiggest] && numbers[1] == numbers[indexOfBiggest] && numbers[2] == numbers[indexOfBiggest]){
            System.out.println("All 3 numbers are equal");
        } else if (numbers[0] == numbers[indexOfBiggest] && numbers[1] == numbers[indexOfBiggest]){
            System.out.println("The 1. and the 2. numbers are the greatest");
        } else if (numbers[0] == numbers[indexOfBiggest] && numbers[2] == numbers[indexOfBiggest]){
            System.out.println("The 1. and the 3. numbers are the greatest");
        } else if (numbers[1] == numbers[indexOfBiggest] && numbers[2] == numbers[indexOfBiggest]){
            System.out.println("The 2. and the 3. numbers are the greatest");
        } else {
            System.out.println("The " + ++indexOfBiggest + ". number is the greatest");
        }
    }
}
