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
 * The Lab Class gets all the lab grades.
 */
public class Labs extends Grade {

    private ArrayList<Integer> labScore;
    private Scanner input;
    private PrintStream output;

    /**
     * The Lab Constructor.
     * @throws IOException 
     */
    public Labs() throws IOException {
      
        //There is only 7 labs for the whole semseter.
        labScore = new ArrayList<>(6); 
        
        input = new Scanner(System.in);
       
        //Prints all the labs scores to a text file.
        output= new PrintStream("LabGrade.txt"); 
      
    }//End of Constructor.

    /**
     * The setLab method sets lab scores.
     * @param labScore numerical grade.
     */
    public void setLabScore(int labScore) {
        this.labScore.add(labScore);

    }//End of setLabScore.

    /**
     * The getLab method gets the lab scores.
     * @return labScores.
     */
    public ArrayList<Integer> getLab() {
        return labScore;
    }// End of getLab.

    /**
     * The SumLab method sums up all the lab scores.
     * @return the total scores of all the labs.
     */
    public int sumLabs() {

        int total = 0;

        for (int i = 0; i < labScore.size(); i++) {
            total += labScore.get(i);

        }
        super.setScore(total);
        return total;

    }//End of sumLabs.

    /**
     * The currentLab lab method asks the user to enter their lab grades they received
     * and prints into to a text file.
     * @throws IOException 
     */
    public void currentLab() throws IOException{

        System.out.println("\nCurrent Labs Grades:");
        output.println("\nCurrent Labs Grades:");
       
        System.out.print("Lab 1 Grade: ");
        output.print("\nLab 1 Grade: ");
        int lab = input.nextInt();
           labScore.add(lab);
         output.print(labScore.get(0));

        System.out.print("Lab 2 Grade: ");
        output.print("\nLab 2 Grade: ");
        lab = input.nextInt();
        labScore.add(lab);
        output.print(labScore.get(1));
       
        System.out.print("Lab 3 Grade: ");
        output.print("\nLab 3 Grade: ");
        lab = input.nextInt();
        labScore.add(lab);
        output.print(labScore.get(2));

        System.out.print("Lab 4 Grade: ");
        output.print("\nLab 4 Grade: ");
        lab = input.nextInt();
        labScore.add(lab);
        output.print(labScore.get(3));

        System.out.print("Lab 5 Grade: ");
        output.print("\nLab 5 Grade: ");
        lab = input.nextInt();
        labScore.add(lab);
        output.print(labScore.get(4));

    }//End of currentLab.
    
    
    /**
     * The potential lab method asks the user to enter their desired lab grades for their remaining labs. 
     * @throws IOException 
     */
    public void potentialLab()throws IOException{
        
        output.println("\n---------------------------------");
        
        System.out.println("\nPotintal Lab Grade:");
        output.println("\nPotintal Lab Grade:");
        
       System.out.print("Lab 6 Grade: ");
       output.print("\nLab 6 Grade: ");
        int lab = input.nextInt();
        labScore.add(lab);
        output.print(labScore.get(5));
        
        System.out.print("Lab 7 Grade: ");
        output.print("\nLab 7 Grade: ");
        lab = input.nextInt();
        labScore.add(lab);
        output.print(labScore.get(6));
        
    }//End of potentialLab.

}//End of Labs class.
