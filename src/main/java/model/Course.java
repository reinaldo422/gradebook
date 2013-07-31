package gradebook.model;

import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Creates a Course which has a subject, name and prerequisite Classes
 * @author Reinaldo Cruz
 */

public class Course implements Gradeable {

    private String subject;
    private int number;
    private String name;
    private ArrayList<Course> prerequisites;
    private ArrayList<Class> classes;
    private double score;
    private DecimalFormat df = new DecimalFormat("#.00");

    public Course(String subject, int number, String name) {
        this.subject = subject;
        this.number = number;
        this.name = name;
        this.prerequisites = new ArrayList<Course>();
        this.classes = new ArrayList<Class>();
    }

    public Course(String subject, int number, String name,
                    ArrayList<Course> prerequisites) {
        this.subject = subject;
        this.number = number;
        this.name = name;
        this.prerequisites = prerequisites;
        this.classes = new ArrayList<Class>();
    }

    public void setPrerequisites(ArrayList<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void addPrerequisite(Course newCourse) {
        prerequisites.add(newCourse);
    }

    public void addClass(Class newClass) {
        classes.add(newClass);
    }

    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }

    public String getSubject() {
        return subject;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    @Override
    public double calculateAvgScore(GradingScheme gradingScheme) {
        double total = 0;
        for (int i = 0; i < classes.size(); i++) {
            total += classes.get(i).calculateAvgScore(gradingScheme);
        }
        score = total / classes.size();
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
