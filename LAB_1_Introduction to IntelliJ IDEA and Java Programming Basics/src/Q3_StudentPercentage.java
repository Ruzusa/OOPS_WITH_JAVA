// Q3: Program to calculate the percentage of a student
public class Q3_StudentPercentage {
    public static void main(String[] args) {
        int english = 76;
        int math = 88;
        int physics = 94;
        int history = 85;

        int totalMarks = english + math + physics + history;
        int subjects = 4;

        double percentage = (totalMarks / (double)(subjects * 100)) * 100;

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage + "%");
    }
}
