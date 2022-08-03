package homework_java_week4;
/* Write a class with the name SimpleCalculator. The class needstwo fields(instance variables) with
names firstNumber and secondNumber both of type double.
Write the following methods(instance methods):
● Method named getFirstNumber without any parameters, it needsto return the value of the
firstNumber field.
● Method named getSecondNumber without any parameters, it needs to return the value of
the secondNumber field.
● Method named setFirstNumber with one parameter oftype double, it needsto set the value
of the firstNumber field.
● *Method named setSecondNumber with one parameter oftype double, it needsto set the
value of the secondNumber field.
● Method named getAdditionResult without any parameters, it needsto return the result of
adding the field values of firstNumber and secondNumber.
● Method named getSubtractionResult without any parameters, it needsto return the result of
subtracting the field values of the secondNumber from the firstNumber.
● Method named getMultiplicationResult without any parameters, it needsto return the result
of multiplying the field values of firstNumber and secondNumber.
● Method named getDivisionResult without any parameters, it needsto return the result of
dividing the field values of firstNumber by the secondNumber. In case the value of
secondNumber is 0 then return 0.
TEST EXAMPLE
TEST CODE:Write the bellow code into main method
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());

 */
public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double ans = firstNumber + secondNumber;
        return  ans;

    }
    public double getSubtractionResult(){
        double ans = firstNumber - secondNumber;
        return  ans;
    }
    public  double getMultiplicationResult(){
        double ans = firstNumber*secondNumber;
        return ans;
    }
    public double getDivisionResult(){
        double ans =0.0;
        if(secondNumber <1){
            secondNumber =0.0;
        }else {
            ans = firstNumber / secondNumber;
        }
        return  ans;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
