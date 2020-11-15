/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseGrade;

import java.util.Scanner;

/**
 * The Final Exam class.
 */
public class FinalExam extends Grade {
    private int finalScore;
    private Scanner input;
    
    /**
     * The FinalExam Constructor.
     */
    public FinalExam(){
        input= new Scanner(System.in);
        
        super.setScore(finalScore);
    } //End of Constructor.
    
    /**
     * The setfinalScore sets the score of the final exam.
     * @param score final exam.
     */
    public void setfinalScore(int score){
         finalScore=score;
         super.setScore(finalScore);
    }//End of final exam.
    
    /**
     * The getfinalScore method returns the final exam score.
     * @return final exam score.
     */
    public int getfinalScore(){
        return finalScore;
    }//End of getfinalScore.
    
}//End of FinalExam class.
