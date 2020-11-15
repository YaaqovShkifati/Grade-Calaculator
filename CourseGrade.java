/**
 * @authuer Yaaqov Shkifati
 * @Since 10-08-2020
 * @Verison 1.0
 */
package CourseGrade;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.IOException;

/**
 * The CourseGrade class calculates the current grades and the potential grades
 * for the Cisc-3130 Data structure class. 
 */
public class CourseGrade {

    private final Grade[] CISC3130 = new Grade[5];

    /**
     * The setLab method sets the lab scores of the Cisc-3130 class.
     * @param lab object of Lab class.
     */
    public void setLab(Labs lab) {
        CISC3130[0] = lab;
    }//End Of setLab.

    /**
     * The setPracticProblems method sets the Practice Problems scores of the Cisc-3130 class.
     * @param homeWork object of PracticProblems class.
     */
    public void setPracticProblems(PracticeProblems homeWork) {
        CISC3130[1] = homeWork;
    }//End Of setPracticProblems.

    /**
     * The setMidterms method sets the midterms scores of the Cisc-3130 class.
     * @param test object of the Midterms class.
     */
    public void setMidterms(Midterms test) {
        CISC3130[2] = test;
    }//End of setMidterms.
    
    /**
     * The setFinal method sets the final exam scores of the Cisc-3130 class.
     * @param lastExam object of the FinalExam class.
     */
    public void setFinal(FinalExam lastExam) {
        CISC3130[3] = lastExam;
    }//End of setFinal.
    
    /**
     * The setTotalGrade method sets the sum of the total scores of the Cisc-3130 class.
     * @param total object of the TotalGrade class.
     */
    public void setTotalGrade(TotalGrade total){
        CISC3130[4]=total;
    }//End of TotalGrade.

    /**
     * The RemindingPoints method calculates whats the remanding points from the current grade.
     * @return available points left.
     */
    public int RemindingPoints() {

        return 100 - CISC3130[4].getScore();
    }//End RemindingPoints.
   
    
    /**
     * The toString class stores the data in a String.
     */
    @Override
    public String toString() {
        return "Total Labs: " + CISC3130[0].getScore() + "\n"
                + "Total Practice Problems: " + CISC3130[1].getScore() + "\n"
                + "Total Midetems: " + CISC3130[2].getScore() + "\n"
                + "Total Points: "+ CISC3130[4].getScore() +"\n";
    }//End of toString.

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);  
        PrintStream output = new PrintStream("TotalGrade.txt");  

        //Printing to the screen and to a file.
        System.out.println("Data Stuctures Calculator:");
        output.println("Data Stuctures Calculator:");
        System.out.println("\nGrading Table: ");
        output.println("\nGrading Table: ");
        System.out.println("Labs: 16 Points\nPractice Problems: 44 Points\nMidetems: 20 Points\nFinal: 20 Points");
        output.println("Labs: 16 Points\nPractice Problems: 44 Points\nMidetems: 20 Points\nFinal: 20 Points");
        System.out.println("---------------------------------");
        output.println("---------------------------------");

        Labs labsScore = new Labs();  
        PracticeProblems homeWork = new PracticeProblems();
        Midterms test = new Midterms();
        FinalExam lastExam = new FinalExam();
        TotalGrade total= new TotalGrade();
        CourseGrade course = new CourseGrade();

        labsScore.currentLab(); //Asks the user to enter all the labs score they recived so far.
        labsScore.sumLabs();    //Sums all the recived lab scores.

        homeWork.currentHw(); //Asks the user to enter all the practice problems score the recived so far.
        homeWork.sumHomeWork(); // Sums all the recived practice problems scores.

        test.currentMidterms(); //Asks the user to enter the midterms Scores.
        test.sumMidterms();   //sums the midterms score.

       //Sets the total score recived so far. 
      total.setTotalGrade (labsScore.sumLabs()+homeWork.sumHomeWork()+test.sumMidterms());

        course.setLab(labsScore);
        course.setPracticProblems(homeWork);
        course.setMidterms(test);
        course.setTotalGrade(total);

        System.out.println("\nCurrent Total Grades:");
        output.println("\nCurrent Total Grades:");

        System.out.println(course.toString());
        output.println(course.toString());
        
        System.out.println("Remaining Points: " + course.RemindingPoints());
        output.println("Remaining Points: " + course.RemindingPoints());
     
       System.out.println("---------------------------------");
        output.println("---------------------------------");
       
      // The desierd potential grade.
      
        labsScore.potentialLab(); //Asks the user to enter their remaining desierd lab grades.
        labsScore.sumLabs(); // Sums all the labs scores.

        homeWork.potintalHw();  //Asks the user to enter their remaining practice problems grades.
        homeWork.sumHomeWork(); //Sums all the practice problems scores.

        System.out.println("\nPotintal Final Exam Grades:");
        output.println("\nPotintal Final Exam Grades:");
        
        System.out.print("Final Exam: ");
        output.print("Final Exam: ");
        int exam = input.nextInt(); //Asks the user to enter desiered Final grade.
        lastExam.setfinalScore(exam);
        output.print(exam);
        
         //Sets the total desierd potential grade.
       total.setTotalGrade (labsScore.sumLabs()+homeWork.sumHomeWork()+test.sumMidterms()+exam);

        course.setLab(labsScore);
        course.setPracticProblems(homeWork);
        course.setFinal(lastExam);
        course.setTotalGrade(total);
        
        //Prints the data.

        System.out.println("\nPotintal Total Grades:");
        output.println("\n\nPotintal Total Grades:");
        
        System.out.println(course.toString());
        output.println(course.toString());
        
        System.out.println("Final Exam: "+ course.CISC3130[3].getScore());
        output.println("Final Exam: "+ course.CISC3130[3].getScore());
        
        System.out.println("Letter Grade: "+ course.CISC3130[4].getGrade());
        output.println("Letter Grade: "+ course.CISC3130[4].getGrade());
        
        input.close(); // close Scanner.
        output.close(); //Close the output file.
    }

}
