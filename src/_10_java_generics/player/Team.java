package _10_java_generics.player;

import java.util.ArrayList;

public class Team<T extends Player> {
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already in this team");
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
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            System.out.println("\t" + "\t" + "The score was: " + "\n" + this.getName() + " - " + opponent.getName()
                    + "  " + ourScore + " : " + theirScore);
            opponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied - lost;
    }
}
