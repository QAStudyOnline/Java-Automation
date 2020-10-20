package online.qastudy.api.request;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import online.qastudy.api.utils.Log;
import org.apache.log4j.Logger;
import org.awaitility.Awaitility;
import org.awaitility.reflect.exception.FieldNotFoundException;

import java.io.File;

public class HttpRequests {

    protected Response doGet(String url) {
        return RestAssured.given().when().get(url);
    }

    protected Response doPost(String url, Object body) {
        Response post = RestAssured.given().body(body).when().post(url);
        Log.getInstance().info("POST RESPONSE: \n" + post.prettyPrint());
        try {
            throw new FieldNotFoundException("C:\\ not found!!");
        }catch (FieldNotFoundException e){
            Log.getInstance().error(e.getMessage());
        }
        return post;
    }

    protected Response doPut(String url, Object body) {
        return RestAssured.given().body(body).when().put(url);
    }

    protected Response doDelete(String url) {
        return RestAssured.given().when().delete(url);
    }
}
