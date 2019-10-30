package model;

public interface SpaceShip {

    boolean launch();

    boolean land();

    boolean canCarry(final Item item);

    void carry(final Item item);
}
