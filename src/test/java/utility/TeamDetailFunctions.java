package utility;

import pojoClasses.PlayerDetail;
import pojoClasses.TeamDetail;

import java.util.Objects;

public class TeamDetailFunctions {

    /*
    This class contains functions related to Response Data RCB json
     */

    int foreignplayers;
    int wicketkeepers;

    /*
    This function will calculate number of foreign players
     */
    public int calculateForeignPlayers(TeamDetail teamDetail){
        foreignplayers = 0;
        for(PlayerDetail p : teamDetail.getPlayerDetails()){
            if(!Objects.equals(p.getCountry(), "India")){
                foreignplayers++;
            }
        }
        return foreignplayers;
    }

    /*
    This function will calculate number of wicket keeper/s
     */
    public int calculateWicketKeepers(TeamDetail teamDetail){
        wicketkeepers = 0;
        for(PlayerDetail p : teamDetail.getPlayerDetails()){
            if(Objects.equals(p.getRole(), "Wicket-keeper")){
                wicketkeepers++;
            }
        }
        return wicketkeepers;
    }

}
