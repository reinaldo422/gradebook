package gradebook.model;

/**
 * Inteface that implements methods to calculate grades
 * @author Reinaldo Cruz
 */

public interface Gradeable {
    double calculateAvgScore(GradingScheme gradingScheme);
    String calculateGrade(GradingScheme gradingScheme);
}
