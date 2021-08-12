package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("WELCOME TO STRATHMORE UNIVERSITY."+"ENTER HIGHSCHOOL KCSE GRADES: ");
	Scanner scanner = new Scanner(System.in);

        int hschool_grades = scanner.nextInt();
        if(hschool_grades >= 65){
            System.out.println("Congratulations \n" +
                    "Enter interview marks:");
            // Input interview scores if kcse grades are above 65
            int marks_interview = scanner.nextInt();
            if (marks_interview>= 6){
                System.out.println("Good score\n" +
                        "Enter your confidence score:");
                // Input confidence scores if interview scores are above 6
                int confidence_marks = scanner.nextInt();
                if (confidence_marks >= 6){
                    // all three conditions are true
                    System.out.println("You have been admitted \n" +
                            "All requirements met.");
                }
                else{
                    // two conditions : KCSE and interview scores are true
                    System.out.println("Admission secured \n" +
                            "You have met the school KCSE requirement and interview scores");
                }
            }else{
                System.out.println("Low score\n" +
                        "Enter your confidence score:");
                // Input confidence scores if  interview scores are false
                int confidence_marks = scanner.nextInt();
                if (confidence_marks >= 5){
                    //KCSE and confidence scores are true
                    System.out.println("Pick admission letter at the reception.You have met the requirements.");
                }
                else{
                    // Both conditions : confidence and interview scores are false
                    System.out.println("Interview and confidence marks are too low.Please look elsewhere:)");
                }
            }
        }else {
            // hschool marks condition is false <65
            System.out.println("Pass mark not attained."+"Please look elsewhere.");
        }
    }
}








