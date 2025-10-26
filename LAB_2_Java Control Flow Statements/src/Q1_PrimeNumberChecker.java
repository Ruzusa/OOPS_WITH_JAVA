import java.util.Scanner;
// Question 1
public class Q1_PrimeNumberChecker {
    public static void main(String[] args) {
        primeNo primenumber = new primeNo();
        primenumber.checkPrime();
    }
}
class primeNo {
    Scanner input = new Scanner(System.in);
    void checkPrime() {
        System.out.println("Enter any number to check whether it is prime or not");
        int number = input.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else if (number > 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0 && number != i) {
                    isPrime = false;
                    break;

                } else {
                    isPrime = true;
                    break;}}
            System.out.println(isPrime);
        }
    }
}















