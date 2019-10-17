package enums;

/**
 * This is an enum class for TicTacToe board cell seed value.
 *
 * @author Franco Aldunate
 * @version 15/10/2019
 */
public enum Seed {
    EMPTY("-"),
    CROSS("X"),
    NOUGHT("O");

    private String seed;

    /**
     * Sets Seed value.
     *
     * @param seed actual value.
     */
    Seed(final String seed) {
        this.seed = seed;
    }

    /**
     * Gets actual seed value.
     * @return seed value.
     */
    public String getValue() {
        return this.seed;
    }
}
