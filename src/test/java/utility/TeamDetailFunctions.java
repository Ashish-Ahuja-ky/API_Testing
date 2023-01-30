package utility;

import pojoClasses.PlayerDetail;
import pojoClasses.TeamDetail;

import java.util.Objects;

public class TeamDetailFunctions {

    int foreignplayers;
    public int calculateForeignPlayers(TeamDetail teamDetail){
        foreignplayers =0;
        for(PlayerDetail p : teamDetail.getPlayerDetails()){
            if(!Objects.equals(p.getCountry(), "India")){
                foreignplayers++;
            }
        }
        return foreignplayers;
    }

}
