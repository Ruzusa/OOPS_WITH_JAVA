import java.util.Scanner;

// Question 6

class table{
    void multiplicationTable(){
        System.out.println("Of which number do you want a multiplication table?");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i= 1; i<=10; i++){
            System.out.println(number + " * " + i +" = "+ number*i);
        }
    }
}

public class Q6_MultiplicationTable{
    public static void main(String[] args){
        table Table = new table();
        Table.multiplicationTable();
    }
}
