package model;

public class Item {
    private String name;
    private float weight;

    /**
     * Constructor
     *
     * @param name This parameter contain the name of item.
     * @param weight This parameter contain the weight of item.
     */
    public Item(final String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Gets name of item.
     *
     * @return weight value.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets weight of item.
     */
    public float getWeight() {
        return weight;
    }
}

