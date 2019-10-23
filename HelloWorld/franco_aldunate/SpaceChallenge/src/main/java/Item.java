/**
 * This class represents an Item to be carried by a Rocket.
 *
 * @author Franco Aldunate
 * @version 22/10/2019
 */
public class Item {
    private String name;
    private int weight;

    /**
     * Constructor {@link Item} initializes values.
     *
     * @param name   of item.
     * @param weight value of item.
     */
    public Item(final String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
