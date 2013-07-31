package gradebook.model;

import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Creates default grading scheme that calculates using normal cutoffs
 * @author Reinaldo Cruz
 */

public class DefaultGradingScheme implements GradingScheme {

    private static final double A_DEFAULT = 90.0;
    private static final double B_DEFAULT = 80.0;
    private static final double C_DEFAULT = 70.0;
    private static final double D_DEFAULT = 60.0;

    private ArrayList<GradebookItem> items;
    private DecimalFormat df = new DecimalFormat("#.00");
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
        score = Double.parseDouble(df.format(score));
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
