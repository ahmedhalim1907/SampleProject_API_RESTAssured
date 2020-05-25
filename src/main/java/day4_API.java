import io.restassured.http.ContentType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class day4_API {

    @Test(enabled = false)
    public void test_PUTRequest(){

        given().baseUri("https://reqres.in").and().
                header("","").and().   // or header("Accept", ContentType.JSON.getAcceptHeader()).
                body("{\n" +
                        "   \" name\" : \"ahmed\",\n" +
                        "    \"job\" : \"tester\",\n" +
                        "}").
                when().put("api/users/2").
                then().assertThat().statusCode(200).log().body(); // 200 test right user 2 exist ,tale3 400

    }


    @DataProvider(name = "testdata")
    public static Object[][] testdata(){
        return new Object[][]{
                {"1","1","6"},
                {"7","2","6"}

        };
    }


    @Test(dataProvider = "testdata")
    public void test_listUserWithQueryParam( String userid,String page,String per_page){

        given().baseUri("https://reqres.in").and().
                queryParam("userid",userid).
                //queryParam("page","2").
                //queryParam("per_page","6").
                when().get("api/users").
                then().assertThat().statusCode(200).log().all()
                .body("page",equalTo(page)).and().
                body("per_page",equalTo(per_page));

    }

}


