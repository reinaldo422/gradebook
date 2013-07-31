package gradebook.model;

import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Creates a Class which has a Course and a semester
 * @author Reinaldo Cruz
 */

public class Class implements Gradeable {

    private ArrayList<Section> sections;
    private String semester;
    private Course course;
    private double score;
    private DecimalFormat df = new DecimalFormat("#.00");

    public Class(Course course, String semester) {
        this.course = course;
        this.semester = semester;
        this.sections = new ArrayList<Section>();
    }

    public void addSection(Section newSection) {
        sections.add(newSection);
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    @Override
    public double calculateAvgScore(GradingScheme gradingScheme) {
        double total = 0;
        for (int i = 0; i < sections.size(); i++) {
            total += sections.get(i).calculateAvgScore(gradingScheme);
        }
        score = total / sections.size();
        score = Double.parseDouble(df.format(score));
        return score;
    }

    @Override
    public String calculateGrade(GradingScheme gradingScheme) {
        score = calculateAvgScore(gradingScheme);
        String grade = gradingScheme.calculateGrade(score);
        return grade;
    }
}
