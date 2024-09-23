import java.util.*;
import java.util.Scanner;

public class MainStudentSystem {

    public static void main(String[] args) {

       StudentSystem student = new StudentSystem(null,0,0,0);
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<2;i++) {

            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Math: ");
            int math = scanner.nextInt();
            System.out.print("English: ");
            int english = scanner.nextInt();
            System.out.print("Science: ");
            int science = scanner.nextInt();

             student = new StudentSystem(name,math,english,science);
            System.out.println(student.getName() + " " + student.calculateAverage());
            student.assignGrade();

        }








        /****int[][] scores = {
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
            }

            System.out.print("Average Score: ");
            studentsystem.calculateAverage();
            System.out.print("Grade: ");
            studentsystem.assignGrade();
            System.out.println("--------------------------------------------------------");
        }***/


    }
}
