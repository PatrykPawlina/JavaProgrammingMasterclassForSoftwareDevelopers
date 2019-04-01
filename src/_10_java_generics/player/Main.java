package _10_java_generics.player;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer john = new FootballPlayer("John");

        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer mark = new BaseballPlayer("Mark");

        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");


        System.out.println("------------Football Team-------------");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> sydneySwans = new Team<>("Syndny Swans");
        adelaideCrows.addPlayer(joe);
        sydneySwans.addPlayer(john);
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

        System.out.println("--------------------MatchResult FootBall Team--------------------");
        adelaideCrows.matchResult(sydneySwans, 7, 3);
        sydneySwans.matchResult(adelaideCrows, 5, 5);

        System.out.println("--------------------MatchResult BaseBall Team--------------------");
        chicagoCubs.matchResult(newYorkYankees, 1, 3);
        newYorkYankees.matchResult(chicagoCubs, 2, 3);
        chicagoCubs.matchResult(newYorkYankees, 3, 3);

        System.out.println("--------------------MatchResult Soccer Team--------------------");
        realMadrid.matchResult(chelseaLondon, 5, 7);
        realMadrid.matchResult(chelseaLondon, 6, 4);
        chelseaLondon.matchResult(realMadrid, 7, 2);
        chelseaLondon.matchResult(realMadrid, 4, 4);

        System.out.println("--------------------Ranking Football Team--------------------");

        System.out.println("Ranking Football Team");
        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
        System.out.println(sydneySwans.getName() + " : " + sydneySwans.ranking());

        System.out.println("--------------------Ranking Baseball Team--------------------");
        System.out.println("RankingBaseball Team");
        System.out.println(chicagoCubs.getName() + " : " + chicagoCubs.ranking());
        System.out.println(newYorkYankees.getName() + " : " + newYorkYankees.ranking());

        System.out.println("--------------------Ranking Soccer Team--------------------");
        System.out.println("Ranking Soccer Team");
        System.out.println(realMadrid.getName() + " : " + realMadrid.ranking());
        System.out.println(chelseaLondon.getName() + " : " + chelseaLondon.ranking());

        System.out.println("--------------------CompareTo Football Team--------------------");
        System.out.println(adelaideCrows.compareTo(sydneySwans));
        System.out.println(sydneySwans.compareTo(adelaideCrows));

        System.out.println("--------------------CompareTo Baseball Team--------------------");
        System.out.println(chicagoCubs.compareTo(newYorkYankees));
        System.out.println(newYorkYankees.compareTo(chicagoCubs));

        System.out.println("--------------------CompareTo Soccer Team--------------------");
        System.out.println(chelseaLondon.compareTo(realMadrid));
        System.out.println(realMadrid.compareTo(chelseaLondon));

    }
}
