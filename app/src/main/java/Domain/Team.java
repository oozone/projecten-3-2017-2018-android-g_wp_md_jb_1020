package Domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by timos on 5-10-2017.
 */

public class Team {

    //Variables
    private int team_id;
    private String teamName;


    private Location location;      // now hear me out on this one, when we need to replace a member they can be replaced by anyone of the same organization that has the same division so In my oppinion this should be added to class diagram
    private Division division;
    private CompetitionClass competitionClass;
    private Boolean homeTeam;


    private List<Player> players = new ArrayList<>();

    public Team(String teamname, CompetitionClass competitionClass) {
        this.teamName = teamname;
        this.competitionClass = competitionClass;
    }

    public void setHomeTeam(Boolean homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Boolean getHomeTeam() {
        return homeTeam;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void addPlayers(Player p){
        players.add(p);
    }

    public String getTeamName() {
        return teamName;
    }


    public void addPlayers(Player[] p){
        players.addAll(Arrays.asList(p));
    }

    public List<Player> getPlayersByStatus(Status s){
        List<Player> list = new ArrayList<>();
        for(Player p: players){
            if(p.getStatus().equals(s)){
                list.add(p);
            }
        }
        return list;
    }


    public List<Player> getPlayers(){
        return players;
    }

    public Player getPlayerById(int id){
        Player pl = null;
        for(Player p: players){
            if(p.getPlayer_id() == id){
                pl = p;
            }
        }
        return pl;
    }
}
