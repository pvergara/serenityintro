package org.ecos.logic.serenity_intro.steps.automation_exercise.api;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.assertj.core.api.Assertions.assertThat;
import static org.ecos.logic.serenity_intro.operation.AutomationExerciseOperation.DELETE;

public class AutomationExerciseAPISteps {

    @Then("I delete the user")
    @After(value = "@DeleteUserWhenItHasBeenCreated")
    public void addANewBookCart(){

        RequestSpecification requestSpecification =  RestAssured.given().relaxedHTTPSValidation();

        Response response = requestSpecification.given().
                baseUri(DELETE.getDomain()).
                contentType(DELETE.getContentType()).
                multiPart("email", "lerele@lolailo.com").
                multiPart("password", "lerele").
                when().
            request(DELETE.getOperationType().getOperationName(), DELETE.getEndpoint());

        assertThat(response.getStatusCode()).isEqualTo(200);
        assertThat(response.body().asPrettyString()).contains("Account deleted!");
    }
}
