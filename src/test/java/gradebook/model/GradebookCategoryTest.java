package gradebook.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import gradebook.model.*;

/**
 * Test class for GradebookCategory; not testing getter methods
 * @author Reinaldo Cruz
 */
 
public class GradebookCategoryTest {
    
    @Test
    public void createGradebookCategory() {
        GradebookCategory category = new GradebookCategory("tests", .5);
        assertTrue(category != null);
    }
    
    @Test
    public void testAddGradebookItem() {
        GradebookCategory category = new GradebookCategory("tests", .5);
        GradebookItem item = new GradebookItem("test1", category, 100.0);
        category.addGradebookItem(item);
        assertTrue(category.getItems().size() > 0);
    }
    
    @Test
    public void testAddMultipleGradebookItem() {
        GradebookCategory category = new GradebookCategory("tests", .5);
        GradebookItem item1 = new GradebookItem("test1", category, 100.0);
        GradebookItem item2 = new GradebookItem("test2", category, 80.0);
        GradebookItem item3 = new GradebookItem("test3", category, 93.0);
        GradebookItem item4 = new GradebookItem("test4", category, 95.0);
        GradebookItem item5 = new GradebookItem("test5", category, 20.0);
        category.addGradebookItem(item1);
        category.addGradebookItem(item2);
        category.addGradebookItem(item3);
        category.addGradebookItem(item4);
        category.addGradebookItem(item5);
        assertTrue(category.getItems().size() == 5);
    }
}
