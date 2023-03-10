package HW2;
//5c

import java.util.List;

public class Team {
    private int code;
    private List<Player> players;
    public Team() {
    }
}

class Player {
    private String name;
    private boolean expert;
    public Player(String name, boolean expert) {
        this.name = name;
        this.expert = expert;
    }
}
