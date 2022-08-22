package GenericsClass;

public class Main {

    public static void main(String[] args) {
        FootballPlayer ariel = new FootballPlayer("Ariel");
        BaseballPlayer tim = new BaseballPlayer("Tim");
        SoccerPlayer joe = new SoccerPlayer("Joe");

        Team<FootballPlayer> coolTeam = new Team<>("Cool Team");
        coolTeam.addPlayer(ariel);
//        coolTeam.addPlayer(tim);
//        coolTeam.addPlayer(joe);

        System.out.println(coolTeam.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Cubs");
        baseballTeam.addPlayer(tim);

        Team<SoccerPlayer> brokenTeam = new Team<>("Kick Team");
        brokenTeam.addPlayer(joe);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gourdon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(coolTeam, 9, 8);

        System.out.println("Rankings:");
        System.out.println(coolTeam.getName() + ": " + coolTeam.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());

        System.out.println(coolTeam.compareTo(hawthorn));
    }
}
