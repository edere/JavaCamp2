
public class Main {

	public static void main(String[] args) {
		
		Team team1 = new Team(1, "Bayern Münih", "Bundesliga Ligi");
		Team team2 = new Team(2, "Arsenal", "UEFA Avrupa Ligi");
		Team team3 = new Team(3, "Liverpool FC", "Premier Ligi");

		TeamManager  teamManager = new TeamManager();
		Team[] teams = {team1,team2,team3};
		
		League league1 = new League(1,"UEFA Avrupa Ligi");
		League league2 = new League(2,"Premier Ligi");
		League league3 = new League(3,"Bundesliga Ligi");
		
		League[] leagues =  {league1,league2,league3};
		
		System.out.println("TAKIM LÝSTESÝ");
		System.out.println("**************");
		
		for(Team team: teams) {
			System.out.println(team.teamName);
		}
		
        System.out.println("-----SON-----");
    	System.out.println("LÝG LÝSTESÝ");
		System.out.println("**************");
        
    	for(League league: leagues) {
			System.out.println(league.LeagueName);
		}
    	System.out.println("-----SON-----");
	
		System.out.println("******infooooooo*******");
		teamManager.addTeam(team1);
		teamManager.addTeam(team2);
		teamManager.addTeam(team3);

		System.out.println("******infooooooo*******");
		teamManager.listTeam(team1);
		teamManager.listTeam(team2);
		teamManager.listTeam(team3);
		
		
		
		
	}

}
