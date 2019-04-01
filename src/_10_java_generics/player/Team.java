package _10_java_generics.player;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private int played;
    private int won;
    private int lost;
    private int tied;
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

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (opponent != null) {
            if (ourScore > theirScore) {
                won++;
                opponent.lost++;
                message = " beat ";
            } else if (ourScore < theirScore) {
                lost++;
                opponent.won++;
                message = " lost to ";
            } else {
                tied++;
                opponent.tied++;
                message = " drew with ";
            }
            played++;
            System.out.println(this.getName() + message + opponent.getName());
            System.out.println("\t" + "\t" + "The score was: " + "\n" + this.getName() + " - " + opponent.getName()
                    + "  " + ourScore + " : " + theirScore);
        }
    }

    public int ranking() {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            System.out.println(this.getName() + " : " + team.getName());
            return -1;
        } else if (this.ranking() < team.ranking()) {
            System.out.println(this.getName() + " : " + team.getName());
            return 1;
        } else {
            System.out.println(this.getName() + " : " + team.getName());
            return 0;
        }
    }
}
