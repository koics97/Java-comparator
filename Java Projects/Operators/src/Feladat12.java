import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me 3 integer:");
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        int biggestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > biggestNumber){
                biggestNumber = numbers[i];
            }
        }
        System.out.println("The biggest number is " + biggestNumber);
    }
}
