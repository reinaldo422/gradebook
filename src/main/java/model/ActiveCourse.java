package gradebook.model;

import java.util.ArrayList;

/**
 * Active record for Course class to store data
 * @author Reinaldo Cruz
 */

public abstract class ActiveCourse extends Course {

    public ActiveCourse(String subject, int number, String name,
                    ArrayList<Course> prerequisites) {
        super(subject, number, name, prerequisites);

    }
    public abstract Course createNew(String subject, int number, String name,
                                        ArrayList<Course> prerequisites);
    public abstract Course findById(int id);
    public abstract void save();
}
