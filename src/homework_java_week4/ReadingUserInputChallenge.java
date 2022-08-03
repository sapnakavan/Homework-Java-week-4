package homework_java_week4;
/*Read 10 numbers from the console entered by the user and print the sum of those
numbers.-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add itto the sum.
-Before the user enters each number, print the message Enter number #x: where x representsthe
count, i.e. 1, 2, 3, 4, etc.
-For example,the first message printed to the user would be Enter number #1:,the next Enter number
#2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.

 */

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        int counter =0;
        int sum = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number :  ");
        while (counter < 10 ){
            if (!s1.hasNextInt()){
                System.out.println(" invalid number ");
                s1.next();
            }else {
                if(counter == 10 ){
                    break;
                }
                System.out.println("Enter number : ");
                int x = s1.nextInt();
                sum = sum +x;
                counter = counter +1;

            }
        }
        System.out.println( sum );
    }

}
