package pojoClasses;

import java.util.List;

public class TeamDetail {

    private String name;
    private String location;
    private List<PlayerDetail> playerDetails;

    public List<PlayerDetail> getPlayerDetails() {
        return playerDetails;
    }

    public void setPlayerDetails(List<PlayerDetail> playerDetails) {
        this.playerDetails = playerDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
