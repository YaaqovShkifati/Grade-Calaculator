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

public class Midterms extends Grade {

    private ArrayList<Integer> testScore;
    private PrintStream output;



    public Midterms() throws IOException {

        testScore = new ArrayList<>(2);
        output= new PrintStream("MidtermGrade.txt");
    }

    public void setMidterm(int test1) {
        testScore.add(test1);
    }

    public int sumMidterms() {
        int total = 0;

        for (int i = 0; i < testScore.size(); i++) {
            total += testScore.get(i);
        }
        super.setScore(total);
        return total;
    }

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
