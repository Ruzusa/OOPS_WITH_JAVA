// Q9: Program to find ASCII code of a character
import java.util.Scanner;

public class Q9_AsciiCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("Character: " + ch);
        System.out.println("ASCII Code: " + ascii);
    }
}
