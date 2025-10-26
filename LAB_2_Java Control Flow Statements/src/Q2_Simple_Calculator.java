//Question 2

import java.util.Scanner;

class Calculator {
    Scanner input = new Scanner(System.in);

    void Calculate() {
        System.out.println("Enter number a :");
        float a = input.nextFloat();
        System.out.println("Enter number b :");
        float b = input.nextFloat();
        System.out.println("Enter one of these operations + , - , * , / ");
        String operations = input.next();

        switch (operations) {
            case "+":
                System.out.println((int) a + (int) b);
                break;
            case "-":
                System.out.println((int) a - (int) b);
                break;
            case "*":
                System.out.println((int) a * (int) b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Error! Division by zero is not possible.");
                } else {
                    System.out.println((int) a / (int) b);
                }
                break;
            default:
                System.out.println("Error!");
        }
    }

    void Repeat(){
        System.out.println("Do yoy want to repeat the opeartion?");
        String repeatCheck = input.next().toLowerCase();
        if (repeatCheck.equalsIgnoreCase("yes")){
            Calculate();
            Repeat();
        } else if (repeatCheck.equalsIgnoreCase("no")){
            System.out.println("Thank you for choosing us!");
        }
        else{
            System.out.println("Invalid input! Try again.");
            Repeat();

        }
    }
}
public class Q2_Simple_Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.Calculate();
        calculator.Repeat();
    }
}
