package gradebook.model;

/**
 * Active record for Student to store data
 * @author Reinaldo Cruz
 */

public abstract class ActiveStudent extends Student {

    public ActiveStudent(Section section, String name) {
        super(section, name);
    }

    public abstract Student createNew(Section section, String name);
    public abstract Course findById(int id);
    public abstract void save();
}
