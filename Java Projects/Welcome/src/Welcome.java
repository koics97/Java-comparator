import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        //lower camelcase firstWordIsLowerCaseNextWordsAreUppercase
        //byte aVeryRandomValue = 20;


        //Írjunk egy alkalmazást, ami bekéri a felhasználó nevét és visszaírja hogy hello + név
        //pl ha a megadott név Géza, akkor visszaírja, hogy Hello Géza

       // Scanner scanner = new Scanner(System.in); //input bekérés

       /* System.out.println("Give me your name, please: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! I am happy to welcome you.");*/

        //kérd be a usertől az életkorát, majd írd ki a következő szöveget:
        //"You are <age> years old
       /* System.out.println("Give me your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");*/

        /*
        System.out.println("Please give me a byte value: ");
        byte byteValue = scanner.nextByte();
        System.out.println("Please give me a short value: ");
        short shortValue = scanner.nextShort();
        System.out.println("Please give me an integer value: ");
        int intValue = scanner.nextInt();
        System.out.println("Please give me a long value: ");
        long longValue = scanner.nextLong();
        System.out.println("Please give me a double value: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Please give me a float value: ");
        float floatValue = scanner.nextFloat();
        System.out.println("PLease give me a boolean value: ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Please give me a char value: ");
        char charValue = scanner.next().charAt(0);

        System.out.println("You gave me a byte as " + byteValue);
        System.out.println("You gave me a short as " + shortValue);
        System.out.println("You gave me an integer as " + intValue);
        System.out.println("You gave me a long as " + longValue);
        System.out.println("You gave me a double as " + doubleValue);
        System.out.println("You gave me a float as " + floatValue);
        System.out.println("You gave me a boolean as a " + booleanValue);
        System.out.println("You gave me a char as " + charValue); */

        //System.out.println("This is a basic calculator program. Please type two numbers");
        //1. welcome message
        //2. create a new scanner
        //3. define two numbers
        //4. create a new variable

        /*
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;
        int difference = firstNumber - secondNumber;
        double dividedValue = (double) firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The product of the two numbers is: " + product);
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The divided value of the two numbers is: " + dividedValue);
        System.out.println("The mod of the two numbers is: " + mod);
        */

        System.out.println("Give us the names of the group members!");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        String name4 = scanner.nextLine();
        String name5 = scanner.nextLine();
        String name6 = scanner.nextLine();

        System.out.println("Welcome our new students at our academy!");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);
        System.out.println("We are glad having you here :)");

    }
}
