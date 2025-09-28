// Q8: Program to concatenate two strings in two ways
class Q8_StringConcat {
    public static void main(String[] args) {
        String stringOne = "Hi";
        String stringTwo = "Mom";

        // Method 1: Using + operator
        String result1 = stringOne + ", " + stringTwo + ".";

        // Method 2: Using concat() method
        String result2 = stringOne.concat(", ").concat(stringTwo).concat(".");

        System.out.println("Using + operator: " + result1);
        System.out.println("Using concat() method: " + result2);
    }
}
