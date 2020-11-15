/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseGrade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintStream;

/**
 * The midterms class gets all the midterms grades.
 */
public class Midterms extends Grade {

    private ArrayList<Integer> testScore;
    private PrintStream output;


    /**
     * The Midterms Constructor.
     * @throws IOException 
     */
    public Midterms() throws IOException {
        //There are only 2 midterms for the semster. 
        testScore = new ArrayList<>(2);
        
        //Prints the midterms score to a text file.
        output= new PrintStream("MidtermGrade.txt");
    }

    /**
     * The setsMidterm method sets the midterms scores.
     * @param test midterm grade. 
     */
    public void setMidterm(int test) {
        testScore.add(test);
    }
   
    /**
     * The sumMidterms method sums all the midterms scores.
     * @return total midterm grade.
     */
    public int sumMidterms() {
        int total = 0;

        for (int i = 0; i < testScore.size(); i++) {
            total += testScore.get(i);
        }
        super.setScore(total);
        return total;
    }

    /**
     * The currentMidterms method asks the user to enter their two midterm grades.
     * @throws IOException 
     */
    public void currentMidterms() throws IOException{

        Scanner input = new Scanner(System.in);
        
        System.out.println("\nCurrent Exam Grades:");
        output.println("\nCurrent Exam Grades:");

        System.out.print("Midterm 1 Grade: ");
        output.print("\nMidterm 1 Grade: ");
        int test = input.nextInt();
        testScore.add(test);
        output.print(testScore.get(0));

        System.out.print("Midterm 2 Grade: ");
          output.print("\nMidterm 2 Grade: ");
        test = input.nextInt();
        testScore.add(test);
        output.print(testScore.get(1));

    }

}
