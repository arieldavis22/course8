package GenericsClass;

public class Main {

    public static void main(String[] args) {
        FootballPlayer ariel = new FootballPlayer("Ariel");
        BaseballPlayer tim = new BaseballPlayer("Tim");
        SoccerPlayer joe = new SoccerPlayer("Joe");

        Team coolTeam = new Team("Cool Team");
        coolTeam.addPlayer(ariel);
        coolTeam.addPlayer(tim);
        coolTeam.addPlayer(joe);

        System.out.println(coolTeam.numPlayers());
    }
}
