import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class day5_API {
    @Test
    public void extractfromserver() {

        Response extractedResponce = given().baseUri("http://localhost:3000/"). //  http://localhost:3000/  https://reqres.in
                when().get("locations").//locations  /api/users
                then().extract().response();

        //dependencies
        JsonPath path = extractedResponce.jsonPath();
        System.out.println((String) path.get("address_components[0].long_name[0]"));

       // System.out.println((String) path.get("id"));
        // System.out.println((String) path.get("name"));

    }
}