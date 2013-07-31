package gradebook.model;

/**
 * Creates a GradebookItem which has a name, a category and a score value
 * @author Reinaldo Cruz
 */

public class GradebookItem {

    private String name;
    private double score;
    private GradebookCategory category;

    public GradebookItem(String name, GradebookCategory category,
                            double score) {
        this.name = name;
        this.category = category;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public GradebookCategory getCategory() {
        return category;
    }

    public double getScore() {
        return score;
    }
}
