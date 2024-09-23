import java.util.*;

public class MainStudentSystem {

    public static void main(String[] args) {

        StudentSystem studentsystem = new StudentSystem(null, null, 0);

        int[][] scores = {
                {90,94,99},
                {66,80,90},
                {79,54,66},
                {44,65,99},
                {55,19,60}};

        String[] student = {"didi", "mal", "anas", "apiq", "alim"};

        for(int row=0; row<scores.length;row++){

            studentsystem.setScores(scores[row]);
            studentsystem.setName(student[row]);
            //String subject = "";

            System.out.println("Name: " + studentsystem.getName());

           /**** for(int col=0; col<scores[row].length; col++){

                int[] s = studentsystem.getScores();

                if(col == 0){
                    subject = "Math";
                }
                if(col == 1){
                    subject = "Science";
                }
                if(col == 2){
                    subject = "English";
                }

                System.out.println(subject + " " + s[col]);
            }***/

            System.out.print("Average Score: ");
            studentsystem.calculateAverage();
            System.out.print("Grade: ");
            studentsystem.assignGrade();
            System.out.println("--------------------------------------------------------");
        }


    }
}
