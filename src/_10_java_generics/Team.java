package _10_java_generics;

import java.util.ArrayList;

public class Team {
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private String name;
    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player) {
        if (members.contains(player)) {
            System.out.println(getName() + " is already in this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " was joined to " + this.name + " team.");
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
            System.out.println("We win");
        } else if (ourScore < theirScore) {
            lost++;
            System.out.println("Our opponent win");
        } else
            tied++;
        System.out.println("The match has been finished with a draw.");
        played++;
        if (opponent != null) {
            opponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied - lost;
    }
}
