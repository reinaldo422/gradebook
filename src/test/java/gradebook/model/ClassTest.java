package gradebook.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import gradebook.model.*;

/**
 * Test class for Class; not testing getter methods
 * @author Reinaldo Cruz
 */
 
public class ClassTest {
    
    @Test
    public void createClass() {
        Class newClass = new Class(null, "Spring");
        assertTrue(newClass != null);
    }
    
    @Test
    public void testAddSection() {
        Class newClass = new Class(null, "Spring");
        Section testSection = new Section(newClass, "a1");
        newClass.addSection(testSection);
        assertTrue(newClass.getSections().size() > 0);
    }
    
    @Test
    public void testAddMultipleSections() {
        Class newClass = new Class(null, "Spring");
        Section testSection1 = new Section(newClass, "a1");
        Section testSection2 = new Section(newClass, "a2");
        Section testSection3 = new Section(newClass, "a3");
        Section testSection4 = new Section(newClass, "a4");
        Section testSection5 = new Section(newClass, "a5");
        newClass.addSection(testSection1);
        newClass.addSection(testSection2);
        newClass.addSection(testSection3);
        newClass.addSection(testSection4);
        newClass.addSection(testSection5);
        assertTrue(newClass.getSections().size() == 5);
    }
}
