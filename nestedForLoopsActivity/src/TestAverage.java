import javax.swing.JOptionPane;
//**********************************************************************************************************************
// Activity 8: Test Average
// Name: Blaine Bailey
// Date of Submission: 1/31/2023
//**********************************************************************************************************************
// To use this program:
// Press the green arrow to start the program. Then enter the amount of students in the class. Then enter the amount of
// tests per student. Then enter each test score for each student. The program will display the average test score for
// each student.
//**********************************************************************************************************************
// This program uses JOptionPane for input.
//**********************************************************************************************************************
public class TestAverage {
    public static void main(String[] args) {
        //Gathering the amount of students
        String students = JOptionPane.showInputDialog("How any students are there in your class?");
        int numStudents = Integer.parseInt(students);

        //Gathering the amount of test scores per student
        String scores = JOptionPane.showInputDialog("How many test scores are there per student?");
        int numScores = Integer.parseInt(scores);

        //Declare variables
        String score;
        int testScore;
        int totalScore;
        double avgScore;

        //Get all the test scores for each student
        for(int i = 1; i <= numStudents; i++) {
            totalScore = 0;
            for(int j = 1; j <= numScores; j++) {
                score = JOptionPane.showInputDialog(String.format("Enter in Test score %d for Student %d", j, i));
                testScore = Integer.parseInt(score);

                totalScore += testScore;
            }

            //Calculate and display the average test score per student
            avgScore = (double)totalScore/numScores;
            JOptionPane.showMessageDialog(null, String.format("The average test score for student %d is %.2f", i, avgScore));
        }
    }
}