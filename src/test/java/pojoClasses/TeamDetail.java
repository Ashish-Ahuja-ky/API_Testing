package pojoClasses;

import java.util.List;

public class TeamDetail {

    private String name;
    private String location;
    private List<PlayerDetail> player;

    public List<PlayerDetail> getPlayerDetails() {
        return player;
    }

    public void setPlayerDetails(List<PlayerDetail> player) {
        this.player = player;
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
