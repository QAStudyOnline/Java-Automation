package online.qastudy.api.request;

import online.qastudy.api.dto.User;
import online.qastudy.api.dto.UserResponse;

import static online.qastudy.api.utils.Const.USER;

public class UserRequests extends HttpRequests {

    public UserResponse createUser(User user) {
        UserResponse result = doPost(USER, user)
                .getBody().as(UserResponse.class);
        return result;
    }

    public User getUserByUsername(String userName) {
        return doGet(USER + "/" + userName).as(User.class);
    }


}
