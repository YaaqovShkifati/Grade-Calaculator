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
 * The CourseGrade class 
 */
public class CourseGrade {

    private final Grade[] CISC3130 = new Grade[5];

    public void setLab(Labs lab) {
        CISC3130[0] = lab;
    }

    public void setPracticProblems(PracticeProblems homeWork) {
        CISC3130[1] = homeWork;
    }

    public void setMidterms(Midterms test) {
        CISC3130[2] = test;
    }

    public void setFinal(FinalExam lastExam) {
        CISC3130[3] = lastExam;
    }
    public void setTotalGrade(TotalGrade total){
        CISC3130[4]=total;
    }


    public int RemindingPoints() {

        return 100 - CISC3130[4].getScore();
    }
   

    @Override
    public String toString() {
        return "Total Labs: " + CISC3130[0].getScore() + "\n"
                + "Total Practice Problems: " + CISC3130[1].getScore() + "\n"
                + "Total Midetems: " + CISC3130[2].getScore() + "\n"
//                + "Final Exam:" + CISC3130[3].getScore() +"\n"
                + "Total Points: "+ CISC3130[4].getScore() +"\n";
                

    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        PrintStream output = new PrintStream("TotalGrade.txt");

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

        labsScore.currentLab();
        labsScore.sumLabs();

        homeWork.currentHw();
        homeWork.sumHomeWork();

        test.currentMidterms();
        test.sumMidterms();

//       lastExam.setfinalScore(0);
       
      total.setTotalGrade (labsScore.sumLabs()+homeWork.sumHomeWork()+test.sumMidterms());

        course.setLab(labsScore);
        course.setPracticProblems(homeWork);
        course.setMidterms(test);
//        course.setFinal(lastExam);
        course.setTotalGrade(total);

        System.out.println("\nCurrent Total Grades:");
        output.println("\nCurrent Total Grades:");

        System.out.println(course.toString());
        output.println(course.toString());
        System.out.println("Remaining Points: " + course.RemindingPoints());
        output.println("Remaining Points: " + course.RemindingPoints());
        

        System.out.println("---------------------------------");
        output.println("---------------------------------");

        labsScore.potintalLab();
        labsScore.sumLabs();

        homeWork.potintalHw();
        homeWork.sumHomeWork();

        System.out.println("\nPotintal Final Exam Grades:");
        output.println("\nPotintal Final Exam Grades:");
        
        System.out.print("Final Exam: ");
        output.print("Final Exam: ");
        int exam = input.nextInt();
        lastExam.setfinalScore(exam);
        output.print(exam);
        
         
       total.setTotalGrade (labsScore.sumLabs()+homeWork.sumHomeWork()+test.sumMidterms()+exam);

        course.setLab(labsScore);
        course.setPracticProblems(homeWork);
        course.setFinal(lastExam);
        course.setTotalGrade(total);

        System.out.println("\nPotintal Total Grades:");
        output.println("\n\nPotintal Total Grades:");
        
        System.out.println(course.toString());
        output.println(course.toString());
        
        System.out.println("Final Exam: "+ course.CISC3130[3].getScore());
        output.println("Final Exam: "+ course.CISC3130[3].getScore());
        
        System.out.println("Letter Grade: "+ course.CISC3130[4].getGrade());
        output.println("Letter Grade: "+ course.CISC3130[4].getGrade());
        
    }

}
