/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseGrade;


public class TotalGrade extends Grade{
    
    private int sumGrade;
    
    public TotalGrade(){
 
        super.setScore(sumGrade);
    }
    
    public void setTotalGrade(int total){
        sumGrade=total;
        super.setScore(sumGrade);
    }
    
    
}
