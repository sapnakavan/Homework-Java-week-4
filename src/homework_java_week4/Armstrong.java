package homework_java_week4;

import java.util.Scanner;

/*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153

 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num,a,sum =0,t = 0;
        num=s1.nextInt();

        t=num;
        while (num != 0){
            a=num%10;
            num = num/10;
            sum =sum + (a*a*a);
        }
        if(sum == t){
            System.out.println("Is Armstrong Number");
        }
        else {
            System.out.println("Is not an Armstrong number");
        }
    }
}
