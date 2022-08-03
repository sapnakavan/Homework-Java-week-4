package homework_java_week4;

import java.util.Scanner;

/*Write a program in Java to display the pattern like a diamond.
While loop

 */
public class Diamond_while {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println(" Enter a :  ");
        int a = s1.nextInt();
        System.out.println("Enter symbol : ");
        char c = s1.next().charAt(0);
        int x = 1;
        int y;
        while (x <= a) {

           y=1;
            while (y++ <= a - x) {
                System.out.print(" ");
            }
            y=1;
            while (y++<=x*2-1){
                System.out.print( c );
            }
            System.out.println( );
            x++;

        }
        x=a-1;
        while (x>0){
            y=1;
            while (y++<=a-x){
                System.out.print(" ");
            }
            y=1;
            while (y++<=x*2-1){
                System.out.print( c );
            }
            System.out.println();
            x--;
        }
    }
}