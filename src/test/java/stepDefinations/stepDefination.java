package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pojoClasses.TeamDetail;
import utility.JsonFunctions;
import utility.TeamDetailFunctions;


public class stepDefination extends JsonFunctions {

    static Object object;
    TeamDetail teamDetail;
    JsonFunctions jsonFunctions = new JsonFunctions();
    TeamDetailFunctions teamDetailFunctions = new TeamDetailFunctions();

    @Given("Test json is given in {string}")
    public void testJsonIsGivenIn(String jsonData) {
        // Added to tell user that data is present in <jsonData>
    }

    @When("Read the data of json {string}")
    public void read_the_data_of_json(String string) {
        object = jsonFunctions.deserializeJson(string, TeamDetail.class);
    }

    @Then("Verify that RCB team has only {int} foreign players")
    public void verifyThatRCBTeamHasOnlyForeignPlayers(int players) {
       teamDetail = (TeamDetail)object;
        Assert.assertEquals(players,teamDetailFunctions.calculateForeignPlayers(teamDetail));
    }

}
