import io.restassured.RestAssured
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method
import io.restassured.specification.RequestSpecification

public class day6_requestspecification {

    RequestSpecification requestSpecification;

    public RequestSpecBuilder(){
        requestSpecification = RestAssured.given().baseUri("https")

    }
}
