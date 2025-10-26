// Question 4

class Divisionby5 {
    void division() {
        int number = 1;
        do {
            if (number % 5 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 100);
    }
}
public class Q4_DivisibleByFive {
    public static void main(String[] args) {
        Divisionby5 d = new Divisionby5();
        d.division();
    }
}