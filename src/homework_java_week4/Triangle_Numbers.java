package homework_java_week4;

import java.util.Scanner;

/*
Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
public class Triangle_Numbers {
    public static void main(String[] args) {
        int x;
        int y ;
        System.out.println("Input numbers of rows : ");
        Scanner z = new Scanner(System.in);
        int a = z.nextInt();

        for(x=1;x<=a;x++){
            for (y=1;y<=x;y++)
                System.out.print(y);
            System.out.println();
        }
    }
}
