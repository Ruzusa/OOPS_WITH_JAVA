// Q10: Program to demonstrate byte variable range
public class Q10_ByteVariables {
    public static void main(String[] args) {
        // Valid byte values (within -128 to 127)
        byte a = 30;
        byte b = -25;

        System.out.println("Byte a = " + a);
        System.out.println("Byte b = " + b);

        // Invalid values (outside range -128 to 127)
        // Uncommenting below lines will cause compilation error
        // byte c = 7000;   // Error: out of range
        // byte d = -1500;  // Error: out of range

        System.out.println("Values like 7000 and -1500 cannot be stored in byte because byte range is -128 to 127.");
    }
}

//byte in Java ranges from -128 to 127.
//Values 30 and -25 work fine.
//Values like 7000 or -1500 will cause compile-time error because they are outside the byte range.