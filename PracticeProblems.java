/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseGrade;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The PracticeProblems class gets all the Practice Problems assignments grades.
 */
public class PracticeProblems extends Grade {

    private ArrayList<Integer> homeWorkScore;
    private Scanner input;
    private PrintStream output;

    /**
     * The PracticeProblems Constructor.
     * @throws IOException 
     */
    public PracticeProblems() throws IOException{
        //There are only 8 practice problems assigments in the semster.
        homeWorkScore = new ArrayList<>(8);
       
        input = new Scanner(System.in);
     
        //Prints the parctice problems scores to text file.
        output= new PrintStream("HwGrade.txt");
    }
    
    
  /**
   * The sethomeWorkScore method sets the practice problems scores.
   * @param score practice problems grade.
   */
    public void sethomeWorkScore(int score) {
        homeWorkScore.add(score);
    }

    /**
     * The sum sumHomeWork method sums all the practice problems scores.
     * @return total practice problems score.
     */
    public int sumHomeWork() {

        int total = 0;

        for (int i = 0; i < homeWorkScore.size(); i++) {

            total += homeWorkScore.get(i);
        }

        super.setScore(total);
        
        return total;

    }

    /**
     * The currentHw method asks the user to enter their completed practice problems scores
     * and store the data in a text file.
     * @throws IOException 
     */
    public void currentHw()throws IOException {
        
        System.out.println("\nCurrent Prcatice Problem Grades:");
        output.print("\nCurrent Prcatice Problem Grades:");

        System.out.print("Prctice Problems 1 Grade: ");
        output.print("\nPrctice Problems 1 Grade: ");
        int hw = input.nextInt();
        homeWorkScore.add(hw);
        output.print(homeWorkScore.get(0));

        System.out.print("Prctice Problems 2 Grade: ");
        output.print("\nPrctice Problems 2 Grade: ");
        hw = input.nextInt();
        homeWorkScore.add(hw);
        output.print(homeWorkScore.get(1));

        System.out.print("Prctice Problems 3 Grade: ");
        output.print("\nPrctice Problems 3 Grade: ");
        hw = input.nextInt();
        homeWorkScore.add(hw);
        output.print(homeWorkScore.get(2));

        System.out.print("Prctice Problems 4 Grade: ");
        output.print("\nPrctice Problems 4 Grade: ");
        hw = input.nextInt();
        homeWorkScore.add(hw); 
        output.print(homeWorkScore.get(3));

        System.out.print("Prctice Problems 5 Grade: ");
        output.print("\nPrctice Problems 5 Grade: ");
        hw = input.nextInt();
        homeWorkScore.add(hw);
        output.print(homeWorkScore.get(4));

        System.out.print("Prctice Problems 6 Grade: ");
        output.print("\nPrctice Problems 6 Grade: ");
        hw = input.nextInt();
        homeWorkScore.add(hw);
        output.print(homeWorkScore.get(5));

    }
    
    /**
     * The potintalHw method asks the user to enter their desired remaining practice Problems scores.
     * @throws IOException 
     */
    public void potintalHw() throws IOException{
        
        output.println("\n---------------------------------");
        
        System.out.println("\nPotintal Prcatice Problem Grades:");
        output.println("\nPotintal Prcatice Problem Grades:");
        
        System.out.print("Prctice Problems 7 Grade: ");
        output.print("\nPrctice Problems 7 Grade: ");
        int hw = input.nextInt();
        homeWorkScore.add(hw);
        output.print(homeWorkScore.get(6));
        
        System.out.print("Prctice Problems 8 Grade: ");
        output.print("\nPrctice Problems 8 Grade: ");
        hw = input.nextInt();
        homeWorkScore.add(hw);
        output.print(homeWorkScore.get(7));
    }

}
