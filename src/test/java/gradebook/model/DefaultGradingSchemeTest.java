package gradebook.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import gradebook.model.*;

/**
 * Test class for DefaultGradingSchemeTest; not testing getter methods
 * @author Reinaldo Cruz
 */
 
 public class DefaultGradingSchemeTest {
    Class newClass = new Class(null, "Spring");
    Section section = new Section(newClass, "a1");
    Student student = new Student(section,"rei");
    GradebookCategory tests = new GradebookCategory("test", .5);
    GradebookCategory quizz = new GradebookCategory("Quizzes", .2);
    GradebookCategory finalExam = new GradebookCategory("Final Exam", .3);
    GradebookItem test1 = new GradebookItem("test1", tests, 85);
    GradebookItem test2 = new GradebookItem("test2", tests, 90);
    GradebookItem test3 = new GradebookItem("test3", tests, 75);
    GradebookItem quizzes = new GradebookItem("quizzes", quizz, 85);
    GradebookItem finalTest = new GradebookItem("final", finalExam, 65);
    
    DefaultGradingScheme scheme = new DefaultGradingScheme();
    ArrayList<GradebookItem> gradebookItems = new ArrayList<GradebookItem>();

    @Test
    public void testScoreCalculation() {
         gradebookItems.add(test1);
         gradebookItems.add(test2);
         gradebookItems.add(test3);
         gradebookItems.add(quizzes);
         gradebookItems.add(finalTest);
         scheme.updateGradebookItems(gradebookItems);
         double score = scheme.calculateScore();
         assertTrue((int)score >= 78);
    }
}
      