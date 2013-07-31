package gradebook.model;

/**
 * Active record for GradebookItem to store data
 * @author Reinaldo Cruz
 */

public abstract class ActiveGradebookItem extends GradebookItem {

    public ActiveGradebookItem(String name, GradebookCategory category,
                                Double score) {
        super(name, category, score);
    }

    public abstract GradebookItem createNew(String name,
                                GradebookCategory category, Double score);
    public abstract Course findById(int id);
    public abstract void save();
}
