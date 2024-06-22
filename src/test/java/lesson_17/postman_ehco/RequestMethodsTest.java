package lesson_17.postman_ehco;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RequestMethodsTest {
    @Test
    @DisplayName("GET Request")
    public void testGetRequest() {
        given()
                .baseUri("https://postman-echo.com/")
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
        given()
                .baseUri("https://postman-echo.com/")
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .post("/post")
                .then()
                .assertThat().statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    @DisplayName("POST Form Data")
    public void testPostFormData() {
        given()
                .baseUri("https://postman-echo.com/")
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
    given()
            .baseUri("https://postman-echo.com/")
            .contentType("text/plain")
            .body("This is expected to be sent back as part of response body.")
            .when()
            .put("/put")
            .then()
            .assertThat().statusCode(200)
            .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    @DisplayName("PATCH Request")
    public void testPatchRequest(){

    }
}
