package gradebook.model;

import java.util.ArrayList;

/**
 * Grading scheme with simply lower cutoff grades to test around
 *  with CalculateGrade()
 * @author Reinaldo Cruz
 */

public class GenerousTeacherScheme implements GradingScheme {

    private static final double A_DEFAULT = 85.0;
    private static final double B_DEFAULT = 75.0;
    private static final double C_DEFAULT = 65.0;
    private static final double D_DEFAULT = 60.0;

    private ArrayList<GradebookItem> items;
    private double score;

    public void updateGradebookItems(ArrayList<GradebookItem> items) {
        this.items = items;
    }

    public double calculateScore() {
        for (int i = 0; i < items.size(); i++) {
            int size = items.get(i).getCategory().getItems().size();
            score += items.get(i).getScore()
                            * items.get(i).getCategory().getWeight() / size;
        }
        return score;
    }

    public String calculateGrade(double score) {
        String grade = "F";
        if (score >= A_DEFAULT) {
            grade = "A";
        } else if (score >= B_DEFAULT) {
            grade = "B";
        } else if (score >= C_DEFAULT) {
            grade = "C";
        } else if (score >= D_DEFAULT) {
            grade = "D";
        }
        return grade;
    }
}
