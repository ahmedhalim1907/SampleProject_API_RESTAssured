import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.BeforeClass
import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification


public class day6_gemy {
    //public class Request_specRefactor(){
        RequestSpecification reqspec;

        @BeforeClass
        public void Intialization(){
            reqspec =  new RequestSpecBuilder().
                    setBaseUri("https://reqres.in/").setAccept(ContentType.JSON).build();
        }

    //}
}
