package _10_java_generics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        System.out.println("------------Football Team-------------");
        Team<FootballPlayer> footballTeam = new Team<>("Adelaide Crows");
        footballTeam.addPlayer(joe);
//        footballTeam.addPlayer(pat);
//        footballTeam.addPlayer(beckham);  error, code does not work, incompatibility of generic types

        System.out.println(footballTeam.numPlayers());

        System.out.println("------------Baseball Team-------------");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        System.out.println(baseballTeam.numPlayers());

        System.out.println("------------Soccer Team--------------");
        Team<SoccerPlayer> soccerTeam = new Team<>("Real Madrid");
        soccerTeam.addPlayer(beckham);

        System.out.println(soccerTeam.numPlayers());

//        Team<String> falseTeam = new Team<>("this won't work"); // error, String cannot be cast to object Player
//        falseTeam.addPlayer("nobody");
    }
}
