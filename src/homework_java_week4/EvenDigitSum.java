package homework_java_week4;
/*Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative

 */
public class EvenDigitSum {
    public static void getEvenDigitSum(int number){
        int sum = 0;
        if(number >0){
            while( number!= 0){
                int a = number % 10;
                if(a% 2== 0){
                    sum += a;

                }
                number/=10;
            }
            System.out.println(sum);
        }
        if (number < 0){
            System.out.println("-1  since the number is negative");
        }


    }

    public static void main(String[] args) {
        getEvenDigitSum(252);
        getEvenDigitSum(123456789);
        getEvenDigitSum(-22);
        getEvenDigitSum(456);
    }
}
