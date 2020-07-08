package online.qastudy.api;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import online.qastudy.api.dto.User;

import static online.qastudy.api.utils.Const.BASE_URL;
import static online.qastudy.api.utils.Const.USER;

public class RequestWrapper {

    public Response getUserByUserName(String username){
        return RestAssured.get(BASE_URL + USER)
                .path(username);
    }

    public Response getUser(User user){
        return getUserByUserName(user.getUserName());
    }

    public Response createUser(User user){
        return RestAssured.given().baseUri(BASE_URL + USER)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(user)
                .when()
                .post();
    }
}
