package homework_java_week4;
/*
Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@

 */
public class Right_Angle_Triangle {
    public static void main(String[] args) {
        int a;
        int b;

        for (a=1;a<=5;a++){
            for (b=1;b<=a;b++)
                System.out.print(" @ ");
            System.out.println(" ");
        }
    }

}
