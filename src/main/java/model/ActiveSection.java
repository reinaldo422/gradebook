package gradebook.model;

/**
 * Active record for Section to store data
 * @author Reinaldo Cruz
 */

public abstract class ActiveSection extends Section {

    public ActiveSection(Class myClass, String name) {
        super(myClass, name);
    }

    public abstract Section createNew(Class myClass, String name);
    public abstract Course findById(int id);
    public abstract void save();
}
