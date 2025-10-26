// Question 5

import java.util.Scanner;
class seasonCheck{
    int monthNumber;
    String month;
    int day;
    void setseason(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month no from 1-12: ");
        monthNumber = input.nextInt();
        switch (monthNumber){
            case 1 : month =  "January"; break;
            case 2 : month ="February"; break;
            case 3 : month ="March"; break;
            case 4 : month ="April"; break;
            case 5 : month ="May"; break;
            case 6 : month ="June"; break;
            case 7 : month ="July"; break;
            case 8 : month ="August"; break;
            case 9 : month ="September"; break;
            case 10 : month ="October"; break;
            case 11 : month ="November"; break;
            case 12 : month ="December"; break;
        }
        System.out.print("Enter day no from 1-30");
        day = input.nextInt();
        String season = "";
        if ((month.equals("March") && day >= 21 || month.equals("April") || month.equals("May") || month.equals("June") && day<=20  )){
            season = "Spring";
            System.out.println("Season : " + season);
        }
        else if ((month.equals("June") && day >= 21) || (month.equals("July") )||( month.equals("August")) || (month.equals("September") && day<=22 )) {
            season = "Summer";
            System.out.println("Season : " + season);
        }
        else if ((month.equals("September") && day >= 23) || (month.equals("October") )||( month.equals("November")) || (month.equals("December") && day<=21)  ){
            season = "Fall";
            System.out.println("Season : " + season);
        }
        else if ((month.equals("December") && day >= 21 )|| (month.equals("January")) || (month.equals("February")) ||( month.equals("March") && day <=20)){
            season = "Winter";
            System.out.println("Season : " + season);
        }
    }
}
public class Q5_SeasonFinder{
    public static void main(String[] args){
        seasonCheck Seasoncheck = new seasonCheck();
        Seasoncheck.setseason();
    }
}