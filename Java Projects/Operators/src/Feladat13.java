import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me 3 integer:");
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        if (numbers[0] == numbers[1] && numbers[0] == numbers[2]){
            System.out.println("All three numbers are equal.");
        } else if (numbers[0] == numbers[1]) {
            System.out.println("The 1. and the 2. number are the greatest.");
        } else if (numbers[0] == numbers[2]){
            System.out.println("The 1. and the 3. number are the greatest.");
        } else if (numbers[1] == numbers[2]){
            System.out.println("The 2. and the 3. number are the greatest.");
        } else {
            int indexOfBiggest = 0;
            for (int i = 1; i < numbers.length; i++){
                if (numbers[i] > numbers[indexOfBiggest]){
                    indexOfBiggest = i;
                }
            }

            System.out.println("The " + ++indexOfBiggest + ". number is the greatest");
        }
    }
}
