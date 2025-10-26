
//Question 7

class printPattern{
    int rows  ;
    int column;
    void pattern(){
        for (rows=1; rows<=6;rows++ ){
            if (rows>=2){
                for (int dot = 1 ; dot<rows;dot++ ){
                    System.out.print(". ");}}
            for(column = rows ; column<=6 ; column++){
                System.out.print("*");
            }
            System.out.println();
        }}

}


public class Q7_TrianglePattern{
    public static void main(String[] args){
        printPattern p =new printPattern();
        p.pattern();
    }}