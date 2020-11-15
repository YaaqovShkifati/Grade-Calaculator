/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseGrade;

/**
 *
 * @author yaaqovshkifati
 */
public class Grade {
    
    private int score;

    /**
     * The Set Score method sets the score field.
     * @param score The value of store in score.
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * The getScore method returns the score.
     * @return The value to store in score field.
     */
    public int getScore() {
        return score;
    }

    /**
     * The getGrade method returns a letter grade determined from the score
     * field.
     * @return The letter Grade.
     */
    public char getGrade() {

        char letterGrade;

        if (score >= 90) {
            letterGrade = 'A';
        } else if (score >= 80) {
            letterGrade = 'B';
        } else if (score >= 70) {
            letterGrade = 'C';
        } else if (score >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        return letterGrade;
    }

}
