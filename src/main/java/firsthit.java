import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class firsthit {

    @Test
    public void testAGetRequest(){

        given().baseUri("https://reqres.in/").and().
                when().get("api/user/{userId}").
                then().assertThat().statusCode(200); // 200 test right user 2 exist

    }

    @Test
    public void testBGetRequest(){

       // for deleting
       given().baseUri("https://reqres.in/").and().pathParam("userId",2)
                .when().delete("api/users/{userId}")
                .then().assertThat().statusCode(204);

        //for getting allusers
                given().baseUri("https://reqres.in/")
                .when().get("api/users/")
                .then().assertThat().statusCode(200);

                //for getting unavailable user
        given().baseUri("https://reqres.in/").and().pathParam("userId",23)
                .when().get("api/users/{userId}")
                .then().assertThat().statusCode(404);

    }
    @Test
    public void Logging(){
        //byraga3 el body bas
        given().baseUri("https://reqres.in/").when().get("api/users/").prettyPrint();
       //byraga3 el data kolaha bel header wel body
        given().baseUri("https://reqres.in/").when().get("api/users/").then().log().all();
    }

   /*
   @Test
    public void req_loggingReq(){
        given().
                baseUri("https://reqres.in/").log().all().
                when().
                get("api/users/2").prettyPrint();
    }*/

}

