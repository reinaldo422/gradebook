package gradebook.model;

import java.util.ArrayList;

/**
 * Creates a GradebookCatergory which has a name, a weight and a list of items
 * @author Reinaldo Cruz
 */

public class GradebookCategory {

    private String name;
    private double weight;
    private ArrayList<GradebookItem> items;

    public GradebookCategory(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.items = new ArrayList<GradebookItem>();
    }

    public void addGradebookItem(GradebookItem newItem) {
        items.add(newItem);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<GradebookItem> getItems() {
        return items;
    }
}
