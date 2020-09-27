package online.qastudy.api.request;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.awaitility.Awaitility;

public class HttpRequests {

    public Response doGet(String url) {
        return RestAssured.given().when().get(url);
    }

    public Response doPost(String url, Object body) {
        Response post = RestAssured.given().body(body).when().post(url);
        post.then().statusCode(200);
        return post;
    }

    public Response doPut(String url, Object body) {
        return RestAssured.given().body(body).when().put(url);
    }

    public Response doDelete(String url) {
        return RestAssured.given().when().delete(url);
    }
}
