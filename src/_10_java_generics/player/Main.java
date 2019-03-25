package _10_java_generics.player;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer mark = new BaseballPlayer("Mark");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");


        System.out.println("------------Football Team-------------");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        footballTeam.addPlayer(pat);
//        footballTeam.addPlayer(beckham);  error, code does not work, incompatibility of generic types

        System.out.println(adelaideCrows.numPlayers());

        System.out.println("------------Baseball Team-------------");
        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        Team<BaseballPlayer> newYorkYankees = new Team<>("New York Yankees");
        chicagoCubs.addPlayer(mark);
        newYorkYankees.addPlayer(pat);

        System.out.println(chicagoCubs.numPlayers());

        System.out.println("------------Soccer Team--------------");
        Team<SoccerPlayer> realMadrid = new Team<>("Real Madrid");
        Team<SoccerPlayer> chelseaLondon = new Team<>("Chelsea London");
        realMadrid.addPlayer(beckham);
        realMadrid.addPlayer(ronaldo);

        System.out.println(realMadrid.numPlayers());

//        Team<String> falseTeam = new Team<>("this won't work"); // error, String cannot be cast to object Player
//        falseTeam.addPlayer("nobody");

        realMadrid.matchResult(chelseaLondon, 5, 7);
        chelseaLondon.matchResult(realMadrid, 7, 2);
        realMadrid.matchResult(chelseaLondon, 6, 4);
        chicagoCubs.matchResult(newYorkYankees, 5, 3);

        System.out.println("Ranking");
        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
        System.out.println(chicagoCubs.getName() + " : " + chicagoCubs.ranking());
        System.out.println(realMadrid.getName() + " : " + realMadrid.ranking());
        System.out.println(chelseaLondon.getName() + " : " + chelseaLondon.ranking());

    }
}
