// Q7: Program to check substring length and value
public class Q7_SubstringExample {
    public static void main(String[] args) {
        String str = "Was it a car or a cat I saw?";

        String sub = str.substring(9, 12); // from index 9 (inclusive) to 12 (exclusive)

        System.out.println("Original String: " + str);
        System.out.println("Substring (9,12): " + sub);
        System.out.println("Length of substring = " + sub.length());
    }
}
