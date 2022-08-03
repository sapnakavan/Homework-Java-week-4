package homework_java_week4;
/*Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *

 */
public class Left_Angle_Triangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int a=1; a <= rows ; a++){
            for (int i= 1 ; i<=rows-i ; i++){
                System.out.print("");
            }
            for (int x=1;x<=a; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
