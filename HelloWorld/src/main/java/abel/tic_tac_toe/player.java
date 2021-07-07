package abel.tic_tac_toe;

public class player {


    private final String name;
    private final String tag;

    public  player(String name, String tag) {
        this.name = name;
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }
}

