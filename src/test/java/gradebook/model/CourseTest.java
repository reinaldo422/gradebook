package gradebook.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import gradebook.model.*;

/**
 * Test class for Course; not testing getter methods
 * @author Reinaldo Cruz
 */
 
public class CourseTest {
    
    @Test
    public void createCourseNoPrereq() {
        Course course = new Course("ECE", 2040, "Circuit Analysis");
        assertTrue(course != null);
    }
    
    @Test
    public void createCourseWithPrereq() {
        ArrayList<Course> prereqs = new ArrayList<Course>();
        Course prereq = new Course("CS", 1331, "Java");
        prereqs.add(prereq);
        Course course = new Course("CS", 1332, "Algorithms", prereqs);
        assertTrue(course != null);
    }
    
    @Test
    public void testSetPrereqs() {
        ArrayList<Course> prereqs = new ArrayList<Course>();
        Course prereq = new Course("CS", 1331, "Java");
        prereqs.add(prereq);
        Course course = new Course("ECE", 2040, "Circuit Analysis");
        course.setPrerequisites(prereqs);
        assertTrue(course.getPrerequisites().size() > 0);
    }    
    
    @Test
    public void testAddPrereq() {
        Course prereq = new Course("CS", 1331, "Java");
        Course course = new Course("ECE", 2040, "Circuit Analysis");
        course.addPrerequisite(prereq);
        assertTrue(course.getPrerequisites().size() > 0);
    }
    
    @Test
    public void testAddClass() {
        Course prereq = new Course("CS", 1331, "Java");
        Class newClass = new Class(prereq, "Spring");
        Course course = new Course("ECE", 2040, "Circuit Analysis");
        course.addClass(newClass);
        assertTrue(course.getClasses().size() > 0);
    }
}