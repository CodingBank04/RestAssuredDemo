package steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.RestAssuredExtension;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;


public class GetPostSteps {
    @Given("^I performm GET operation for \"([^\"]*)\"$")
    public void iPerformmGETOperationFor(String url) throws Throwable {
        RestAssuredExtension.GetOps(url);

    }


    @And("^I perform GET for the post number \"([^\"]*)\"$")
    public void iPerformGETForThePostNumber(String postNumber) throws Throwable {
    BDDStyleMethod.SimpleGETPost(postNumber);

    }

    @Then("I should see the author name as \"([^\"]*)\"$")
    public void iShouldSeeTheAuthorNameAs(String name) {

    }


    @Then("^I should see the author name$")
    public void iShouldSeeTheAuthorName() {
        BDDStyleMethod.PerformContainsCollection();
    }

    @Then("I should see verify GET parameter")
    public void iShouldSeeVerifyGETParameter() {
         // BDDStyleMethod.PerformPathParameter();
          BDDStyleMethod.PerformQueryParameter();
    }
}
