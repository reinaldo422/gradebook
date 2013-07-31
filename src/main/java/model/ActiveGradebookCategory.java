package gradebook.model;

/**
 * Active record for GradebookCategory to store data
 * @author Reinaldo Cruz
 */

public abstract class ActiveGradebookCategory extends GradebookCategory {

    public ActiveGradebookCategory(String name, Double weight) {
        super(name, weight);
    }

    public abstract GradebookCategory createNew(String name, Double weight);
    public abstract Course findById(int id);
    public abstract void save();
}
