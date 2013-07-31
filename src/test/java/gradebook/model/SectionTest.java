package gradebook.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import gradebook.model.*;

/**
 * Test class for Section; not testing getter methods
 * @author Reinaldo Cruz
 */
 
public class SectionTest {
    
    @Test
    public void createSection() {
        Class newClass = new Class(null, "Spring");
        Section section = new Section(newClass, "a1");
        assertTrue(section != null);
    }
    
    @Test
    public void testAddStudent() {
        Class newClass = new Class(null, "Spring");
        Section section = new Section(newClass, "a1");
        Student student = new Student(section, "Rei");
        section.addStudent(student);
        assertTrue(section.getStudents().size() > 0);
    }
    
    @Test
    public void testAddMultipleStudents() {
        Class newClass = new Class(null, "Spring");
        Section section = new Section(newClass, "a1");
        Student student1 = new Student(section, "Rei");
        Student student2 = new Student(section, "Carlos");
        Student student3 = new Student(section, "John");
        Student student4 = new Student(section, "Smith");
        Student student5 = new Student(section, "Tyler");
        section.addStudent(student1);
        section.addStudent(student2);
        section.addStudent(student3);
        section.addStudent(student4);
        section.addStudent(student5);
        assertTrue(section.getStudents().size() == 5);
    }
    
    @Test
    public void testCalculateSectionScores() {
        Class newClass = new Class(null, "Spring");
        Section section = new Section(newClass, "a1");
        Student student1 = new Student(section, "Rei");
        Student student2 = new Student(section, "Bob");
        section.addStudent(student1);
        section.addStudent(student2);
        GradebookCategory category = new GradebookCategory("test", 1.0);
        GradebookItem item1 = new GradebookItem("test1", category, 100.0);
        GradebookItem item2 = new GradebookItem("test2", category, 90.0);
        GradebookItem item3 = new GradebookItem("test3", category, 80.0);
        category.addGradebookItem(item1);
        category.addGradebookItem(item2);
        category.addGradebookItem(item3);
        student1.addGradebookItem(item1);
        student1.addGradebookItem(item2);
        student1.addGradebookItem(item3);
        student2.addGradebookItem(item1);
        student2.addGradebookItem(item2);
        student2.addGradebookItem(item3);
        double score = section.calculateAvgScore(new DefaultGradingScheme());
        assertTrue(score > 80.0);
    }
}
