package ex_03_Ternaryoperator;

public class label_05_Grade_Calculation_program {

    public static void main(String[] args) {

/*
        Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

        A: 90-100

        B: 80-89

        C: 70-79

        D: 60-69

        F: 0-59 */

        int score = 45;


        String grade = (score>90)?"A":(score>80)?"B":(score>70)?"C":(score<60)?"F":"D";


        System.out.println(grade);

    }
}
