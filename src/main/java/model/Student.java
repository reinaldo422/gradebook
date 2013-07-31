package gradebook.model;

import java.util.ArrayList;

/**
 * Creates a Student which has a section, a name and a list of gradebook items
 * @author Reinaldo Cruz
 */
public class Student implements Gradeable {

    private ArrayList<GradebookItem> gradebookItems;
    private String name;
    private Section section;
    private double score;

    public Student(Section section, String name) {
        this.name = name;
        this.section = section;
        this.gradebookItems = new ArrayList<GradebookItem>();
    }

    public void addGradebookItem(GradebookItem newGradebookItem) {
        gradebookItems.add(newGradebookItem);
    }

    public String getName() {
        return name;
    }

    public Section getSection() {
        return section;
    }

    public ArrayList<GradebookItem> getGradebookItems() {
        return gradebookItems;
    }

    @Override
    public double calculateAvgScore(GradingScheme gradingScheme) {
        gradingScheme.updateGradebookItems(gradebookItems);
        score = gradingScheme.calculateScore();
        return score;
    }

    @Override
    public String calculateGrade(GradingScheme gradingScheme) {
        score = calculateAvgScore(gradingScheme);
        String grade = gradingScheme.calculateGrade(score);
        return grade;
    }
}
