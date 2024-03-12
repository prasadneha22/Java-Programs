package Day06;

import java.util.function.BinaryOperator;

public class LambdaEx {

    public static double operationFunction(double num1, double num2, String operator){

        BinaryOperator<Double> operation = null;

        switch(operator){
            case "+":
            operation = (x,y)->x+y;
            break;
            case "-":
            operation = (x,y)->x-y;
            break;
            case "*":
            operation = (x,y)->x*y;
            break;
            default:System.out.println("Invalid Input");
        }
        return operation.apply(num1, num2);

    }
    public static void main(String[] args) {
        double result;

        result = operationFunction(5, 3, "+");
        System.out.println(result);
        result = operationFunction(5, 3, "-");
        System.out.println(result);
        result = operationFunction(5, 3, "*");
        System.out.println(result);
        
    }
}
