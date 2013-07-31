package gradebook.model;

/**
 * Active record for Class to store data
 * @author Reinaldo Cruz
 */

public abstract class ActiveClass extends Class {

    public ActiveClass(Course course, String semester) {
        super(course, semester);
    }

    public abstract Class createNew(Course course, String semester);
    public abstract Course findById(int id);
    public abstract void save();
}
