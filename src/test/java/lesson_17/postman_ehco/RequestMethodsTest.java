package lesson_17.postman_ehco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class RequestMethodsTest {
    @BeforeEach
    public void setUp(){
        request(baseURI = "https://postman-echo.com/");
    }
    @Test
    @DisplayName("GET Request")
    public void testGetRequest() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .assertThat().statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    @DisplayName("POST Raw Text")
    public void testPostRawText() {
        String response = "This is expected to be sent back as part of response body.";
        given()
                .contentType("text/plain")
                .body(response)
                .when()
                .post("/post")
                .then()
                .assertThat().statusCode(200)
                .body("data", equalTo(response));
    }

    @Test
    @DisplayName("POST Form Data")
    public void testPostFormData() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .assertThat().statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    @DisplayName("PUT Request")
    public void testPutRequest(){
        String response = "This is expected to be sent back as part of response body.";
    given()
            .contentType("text/plain")
            .body(response)
            .when()
            .put("/put")
            .then()
            .assertThat().statusCode(200)
            .body("data", equalTo(response));
    }

    @Test
    @DisplayName("PATCH Request")
    public void testPatchRequest(){
        String response = "This is expected to be sent back as part of response body.";
        given()
                .contentType("text/plain")
                .body(response)
                .when()
                .patch("/patch")
                .then()
                .assertThat().statusCode(200)
                .body("data", equalTo(response));
    }

    @Test
    @DisplayName("DELETE Request")
    public void testDeleteRequest(){
        given()
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then()
                .statusCode(200);
    }
}
