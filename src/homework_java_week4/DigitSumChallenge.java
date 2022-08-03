package homework_java_week4;

import java.util.Scanner;

/*
Digit Sum Challenge
Write a method with the name sumDigitsthat has one int parameter called number.
If the parameter is >= 10 then the method should processthe number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbersfrom0-9 have 1 digitso we don't want to processthem; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1)should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
Hint: Use n % 10 to extract the least-significant digit.
Use n = n / 10 to discard the least-significant digit.
The method needs to be static
Create a class with the name DigitSumChallenge.
 */
public class DigitSumChallenge {
    public static void main(String[] args) {
        int number, sum;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number ");
        number = s1.nextInt();
        sum = SumDigit(number);
        System.out.println("Sum of digits " + sum);
    }

    public static int SumDigit(int number) {

        if (number < 10) {
            System.out.println("-1");
        } else {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }


            return sum;
        }
        return number;
    }
}
