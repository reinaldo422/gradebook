package gradebook.model;

import java.util.ArrayList;

/**
 * Creates a Section which has a Class, a name and a list of students
 * @author Reinaldo Cruz
 */

public class Section implements Gradeable {

    private ArrayList<Student> students;
    private String name;
    private Class myClass;
    private double score;

    public Section(Class myClass, String name) {
        this.myClass = myClass;
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public Class getMyClass() {
        return myClass;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public double calculateAvgScore(GradingScheme gradingScheme) {
        double total = 0;
        for (int i = 0; i < students.size(); i++) {
            total += students.get(i).calculateAvgScore(gradingScheme);
        }
        score = total / students.size();
        return score;
    }

    @Override
    public String calculateGrade(GradingScheme gradingScheme) {
        score = calculateAvgScore(gradingScheme);
        String grade = gradingScheme.calculateGrade(score);
        return grade;
    }
}
