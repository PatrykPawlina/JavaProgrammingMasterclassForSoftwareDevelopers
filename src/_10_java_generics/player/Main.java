package _10_java_generics.player;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer mark = new BaseballPlayer("Mark");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");


        System.out.println("------------Football Team-------------");
        Team<FootballPlayer> footballTeam = new Team<>("Adelaide Crows");
        footballTeam.addPlayer(joe);
//        footballTeam.addPlayer(pat);
//        footballTeam.addPlayer(beckham);  error, code does not work, incompatibility of generic types

        System.out.println(footballTeam.numPlayers());

        System.out.println("------------Baseball Team-------------");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(mark);
        baseballTeam.addPlayer(pat);

        System.out.println(baseballTeam.numPlayers());

        System.out.println("------------Soccer Team--------------");
        Team<SoccerPlayer> soccerTeam = new Team<>("Real Madrid");
        soccerTeam.addPlayer(beckham);
        soccerTeam.addPlayer(ronaldo);

        System.out.println(soccerTeam.numPlayers());

//        Team<String> falseTeam = new Team<>("this won't work"); // error, String cannot be cast to object Player
//        falseTeam.addPlayer("nobody");

        soccerTeam.matchResult(baseballTeam, 4, 7);
        footballTeam.matchResult(soccerTeam, 2, 2);
        baseballTeam.matchResult(baseballTeam, 5, 3);
    }
}
