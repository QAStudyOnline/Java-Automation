package online.qastudy.api.request;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import online.qastudy.api.dto.User;
import online.qastudy.api.dto.UserResponse;
import online.qastudy.api.utils.Log;

import static java.lang.String.format;
import static online.qastudy.api.utils.Const.USER;

public class UserRequests extends HttpRequests {

    public UserResponse createUser(User user) {
        Log.getInstance().debug(format("Send POST request Create user: \n %s", user.toString()));
        Response response = doPost(USER, user);
        response.then().statusCode(200);
        response.then().contentType(ContentType.JSON);

        UserResponse result = response
                .getBody().as(UserResponse.class);
        return result;
    }

    public User getUserByUsername(String userName) {
        return doGet(USER + "/" + userName).as(User.class);
    }


}
