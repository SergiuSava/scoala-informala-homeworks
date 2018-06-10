import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        double number1, number2, result;

        System.out.println("Input the two numbers: ");
        Scanner input = new Scanner(System.in);

        number1 = input.nextDouble();
        number2 = input.nextDouble();

        System.out.println("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication");
        int operation = input.nextInt();


        switch (operation) {
            case 1: {
                result = addition(number1, number2);
                System.out.println("The result is " + result);
                break;
            }

            case 2: {
                result = subtraction(number1, number1);
                System.out.println("The result is " + result);
                break;
            }

            case 3: {
                result = division(number1, number2);
                System.out.println("The result is " + result);
                break;


            }


            case 4: {
                result = multiplication(number1, number2);

                System.out.println("The result is " + result);
                break;
            }


        }


    }


    public static double addition(double a, double b) {
        return a + b;

    }

    public static double subtraction(double a, double b) {
        return a - b;

    }

    public static double multiplication(double a, double b) {

     if (a == 0 || b == 0){
         return 0;
     }else{
         return a * b;
     }
     }


    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Division to zero is impossible");
            return 0;
        } else {
            return a / b;
            }

    }

}

