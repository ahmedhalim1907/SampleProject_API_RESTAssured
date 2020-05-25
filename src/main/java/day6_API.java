import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
//hagar
import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification


public class day6_API {
    @Test
    public void verifyjsonshcma() {
        given().when().get("http://localhost:3000/ice_creams"). //http:localhost
                then().body(matchesJsonSchemaInClasspath("schema_example.json")).log().ifError();

    }
}