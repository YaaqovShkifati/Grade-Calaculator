/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseGrade;

/**
 * The TotalGrade class.
 */
public class TotalGrade extends Grade{
    
    private int sumGrade;
    
    /**
     * The setTotalGrade method sets the total grade of the total: labs, practice problems,
     * midterms, and final exam.
     * @param total overall grade.
     */
    public void setTotalGrade(int total){
        sumGrade=total;
        super.setScore(sumGrade);
    }
    /**
     * The getTotalGrade gets the overall grade.
     * @return the total overall grade.
     */
    public int getTotalGrade(){
        return sumGrade;
    }
    
    
}
