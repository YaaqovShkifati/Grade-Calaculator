/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseGrade;

import java.util.Scanner;

public class FinalExam extends Grade {
    private int finalScore;
    private Scanner input;
    
    public FinalExam(){
        input= new Scanner(System.in);
        
        super.setScore(finalScore);
    }
    
    public void setfinalScore(int score){
         finalScore=score;
         super.setScore(finalScore);
    }
    public int getfinalScore(){
        return finalScore;
    }
}
