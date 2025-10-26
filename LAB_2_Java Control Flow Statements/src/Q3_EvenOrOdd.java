// Question 3

class Number{
    void printNumbers (){
        int number = 100;
        do {
            if(number%2==0){

                System.out.println(number + " : Even.");
            }
            else{
                System.out.println(number + " : Odd.");
            }
            number--;
        }while(number>=1);
    }
}

public class Q3_EvenOrOdd {
    public static void main(String[] args) {
        Number number = new Number();
        number.printNumbers();

    }
}

