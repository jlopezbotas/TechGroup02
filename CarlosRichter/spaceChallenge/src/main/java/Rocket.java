public class Rocket implements Spaceship {

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return false;
    }

    public void carry(Item item) {

    }
}
