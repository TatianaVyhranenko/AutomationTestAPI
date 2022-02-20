package API;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class VerificationStatusCode {

    private final static String URL = "https://reqres.in/";
    private final int EXPECTED_STATUS_CODE = 404;

    @Test
    public void checkStatusCode() {
        int actualStatusCode = given()
                .when()
                .get(URL + "/api/users/23")
                .getStatusCode();

        Assert.assertNotNull(actualStatusCode);
        Assert.assertEquals(actualStatusCode, EXPECTED_STATUS_CODE);
    }
}
