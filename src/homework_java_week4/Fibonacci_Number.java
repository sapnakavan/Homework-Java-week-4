package homework_java_week4;
/*9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

 */
public class Fibonacci_Number {
    public static void main(String[] args) {
        int maxNumber =8 , previousNumber =1 ,nextNumber =1;
        System.out.println(" Fibonacci series of " + maxNumber + " numbers:");
        int a =1;
        while (a<= maxNumber){
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            a++;
        }
    }
}
