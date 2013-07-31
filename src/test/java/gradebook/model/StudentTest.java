package gradebook.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import gradebook.model.*;

/**
 * Test class for Student; not testing getter methods
 * @author Reinaldo Cruz
 */
 
public class StudentTest {
    
    @Test
    public void createStudent() {
        Class newClass = new Class(null, "Spring");
        Section section = new Section(newClass, "a1");
        Student student = new Student(section, "rei");
        assertTrue(student != null);
    }
    
    @Test
    public void testAddGradebookItem() {
        Class newClass = new Class(null, "Spring");
        Section section = new Section(newClass, "a1");
        Student student = new Student(section, "Rei");
        GradebookCategory category = new GradebookCategory("test", 0.5);
        GradebookItem item = new GradebookItem("test1", category, 100.0);
        student.addGradebookItem(item);
        assertTrue(student.getGradebookItems().size() > 0);
    }
    
    @Test
    public void testCalculateScore() {
        Class newClass = new Class(null, "Spring");
        Section section = new Section(newClass, "a1");
        Student student = new Student(section, "Rei");
        GradebookCategory category = new GradebookCategory("test", 1.0);
        GradebookItem item1 = new GradebookItem("test1", category, 100.0);
        GradebookItem item2 = new GradebookItem("test2", category, 90.0);
        GradebookItem item3 = new GradebookItem("test3", category, 80.0);
        category.addGradebookItem(item1);
        category.addGradebookItem(item2);
        category.addGradebookItem(item3);
        student.addGradebookItem(item1);
        student.addGradebookItem(item2);
        student.addGradebookItem(item3);
        double score = student.calculateAvgScore(new DefaultGradingScheme());
        assertTrue(score == 90.0);
    }
    
    @Test
    public void testCalculateScore2() {
        Class newClass = new Class(null, "Spring");
        Section section = new Section(newClass, "a1");
        Student student = new Student(section, "Rei");
        GradebookCategory category1 = new GradebookCategory("test", .6);
        GradebookCategory category2 = new GradebookCategory("hw", .4);
        GradebookItem test1 = new GradebookItem("test1", category1, 100.0);
        GradebookItem test2 = new GradebookItem("test2", category1, 100.0);
        GradebookItem test3 = new GradebookItem("test3", category1, 100.0);
        GradebookItem hw1 = new GradebookItem("hw1", category2, 80.0);
        GradebookItem hw2 = new GradebookItem("hw2", category2, 80.0);
        GradebookItem hw3 = new GradebookItem("hw3", category2, 80.0);
        category1.addGradebookItem(test1);
        category1.addGradebookItem(test2);
        category1.addGradebookItem(test3);
        category2.addGradebookItem(hw1);
        category2.addGradebookItem(hw2);
        category2.addGradebookItem(hw3);
        student.addGradebookItem(test1);
        student.addGradebookItem(test2);
        student.addGradebookItem(test3);
        student.addGradebookItem(hw1);
        student.addGradebookItem(hw2);
        student.addGradebookItem(hw3);
        double score = student.calculateAvgScore(new DefaultGradingScheme());
        assertTrue((int)score == 92);
    }
    
    @Test
    public void testLetterGrade() {
        Class newClass = new Class(null, "Spring");
        Section section = new Section(newClass, "a1");
        Student student = new Student(section, "Rei");
        GradebookCategory category = new GradebookCategory("test", 1.0);
        GradebookItem item1 = new GradebookItem("test1", category, 100.0);
        GradebookItem item2 = new GradebookItem("test2", category, 90.0);
        GradebookItem item3 = new GradebookItem("test3", category, 80.0);
        category.addGradebookItem(item1);
        category.addGradebookItem(item2);
        category.addGradebookItem(item3);
        student.addGradebookItem(item1);
        student.addGradebookItem(item2);
        student.addGradebookItem(item3);
        double score = student.calculateAvgScore(new DefaultGradingScheme());
        String grade = student.calculateGrade(new DefaultGradingScheme());
        assertEquals(grade, "A");
    }
}
