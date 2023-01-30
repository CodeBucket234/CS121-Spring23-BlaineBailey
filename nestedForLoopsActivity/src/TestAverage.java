import javax.swing.JOptionPane;
public class TestAverage {
    public static void main(String[] args) {
        String students = JOptionPane.showInputDialog("How any students are there in your class?");
        int numStudents = Integer.parseInt(students);

        String scores = JOptionPane.showInputDialog("How many test scores are there per student?");
        int numScores = Integer.parseInt(scores);

        String score;
        int testScore;
        int totalScore = 0;
        int avgScore = 0;
        for(int i = 0; i < numStudents; i++) {
            for(int j = 0; j < numScores; j++) {
                score = JOptionPane.showInputDialog(String.format("Enter in Test score %d for Student %d", j, i));
                testScore = Integer.parseInt(score);

                totalScore += testScore;
            }
        }
    }
}