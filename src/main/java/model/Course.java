package gradebook.model;

import java.util.ArrayList;

/**
 * Creates a Course which has a subject, name and prerequisite Classes
 * @author Reinaldo Cruz
 */

public class Course {

    private String subject;
    private int number;
    private String name;
    private ArrayList<Course> prerequisites;
    private ArrayList<Class> classes;

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
}
