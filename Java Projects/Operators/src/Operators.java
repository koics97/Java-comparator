public class Operators {
    public static void main(String[] args) {
        int number1  = 20;
        int number2 = 32;
        String name1 = "x";
        String name2 = "y";

        System.out.println("The original value of number 1 is " + number1);

        /*System.out.println(number1 + number2);
        System.out.println(name1 + name2); //String concatenation
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);

        number1 = number1 + 10;
        number1 = number1 - 10;
        number1 = number1 * 10;
        number1 = number1 / 10;

        number1 += 10;
        number1 -= 10;
        number1 *= 10;
        number1 /= 10;*/

      // System.out.println("The modified value of number 1 is " + number1);

        /*number1++;
        ++number1;*/

        System.out.println(number1++);
        System.out.println(++number1);

        int number3 = 6 - 4 * 2 - 3 + 5 / 7; //5/7 == 0
        System.out.println(number3 == 17); // = --> értékadás, == --> egyenlőség-vizsgálat

        boolean isTrue = true && false || true && false;
        System.out.println(isTrue);

        int number4 = 20;
        boolean isNumber420 = number4 == 20;
        System.out.println("Number 4 equals 20: " + isNumber420);
        boolean isNumber4Not20 = number4 != 20;
        System.out.println("Number 4 equals 20: " + isNumber4Not20);


    }
}
