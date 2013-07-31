package gradebook.model;

import java.util.ArrayList;

/**
 * Inteface that implements methods that describe a grading scheme
 * @author Reinaldo Cruz
 */

public interface GradingScheme {

    void updateGradebookItems(ArrayList<GradebookItem> gradebookItems);
    double calculateScore();
    String calculateGrade(double score);
}
