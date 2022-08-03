package homework_java_week4;

import java.util.Scanner;

/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17... are the prime numbers.)

 */
public class PrimeNumber {
    public static void main(String[] args) {
            PrimeNumber p =new PrimeNumber();
            p.a1();
    }

    public void a1(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number : ");
        int x =s1.nextInt();
        boolean b = false;
        for (int i=2;i<= x/2;++i){
            if(x%i ==0){
                b = true;
                break;
            }
        }
        if (!b){
            System.out.println(x + "    This Number is Prime");
        }else {
            System.out.println(x + "    This Number is not Prime");
        }
    }
}
