
//Question 8
class printFiveIntegersPerLine{
    void printFiveIntegers(){
        int start ;
        int end = 2000 ;
        for (start=1000;start<=end;start++){
            System.out.print(start+"  ");
            if ((start-999)%5==0){
                System.out.println();
            }}
    }
}

public class Q8_FivePerLine{
    public static void main(String[] args){
        printFiveIntegersPerLine obj = new printFiveIntegersPerLine();
        obj.printFiveIntegers();
    }
}