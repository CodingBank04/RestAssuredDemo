package steps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BDDStyleMethod {

    public static void SimpleGETPost(String postNumber){
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:3000/posts/%s", postNumber)).
                then().body("author", is("paris"));

    }
    public static void PerformContainsCollection(){
        given()
                .contentType(ContentType.JSON)
        .when()
                .get(String.format("http://localhost:3000/posts/"))
        .then()
                   .body("author", containsInAnyOrder("paris","londra","ankara")).statusCode(200);

    }
    public static void PerformPathParameter(){
        given()
                .contentType(ContentType.JSON).
         with()
                .pathParam("post",3).
         when()
                .get("http://localhost:3000/posts/{post}").
         then()
                .body("author",containsString("ankara"));
    }
    public static void PerformQueryParameter(){
        given()
                .contentType(ContentType.JSON)
                .queryParam("id", 3).
                when()
                .get("http://localhost:3000/posts/").
                then()
                .body("author", containsString("ankara"));
    }
}
