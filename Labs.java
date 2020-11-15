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

public class Labs extends Grade {

    private ArrayList<Integer> labScore;
    private Scanner input;
    private PrintStream output;

    public Labs() throws IOException {
        labScore = new ArrayList<>(6);
        input = new Scanner(System.in);
        output= new PrintStream("LabGrade.txt");
      
    }

    public void setLabScore(int labScore) {
        this.labScore.add(labScore);

    }

    public ArrayList<Integer> getLab() {
        return labScore;
    }

    public int sumLabs() {

        int total = 0;

        for (int i = 0; i < labScore.size(); i++) {
            total += labScore.get(i);

        }

        super.setScore(total);
        return total;

    }

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

    }
    public void potintalLab()throws IOException{
        
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
        
    }

}
