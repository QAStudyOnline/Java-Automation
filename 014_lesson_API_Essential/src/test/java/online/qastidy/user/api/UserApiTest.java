package online.qastidy.user.api;

import online.qastudy.api.dto.User;
import online.qastudy.api.dto.UserResponse;
import online.qastudy.api.request.UserRequests;
import org.assertj.core.api.Assertions;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserApiTest extends BaseApiTest {

    private static UserRequests requests = null;
    private static User userObject = null;

    @BeforeClass
    public static void beforeUserApiTest() {
        requests = new UserRequests();
        userObject = new User.UserBuilder().withId(99l)
                .withUsername("i2i")
                .withFirstName("Ivan")
                .withLastName("Ivanov")
                .withEmail("testUser1@gmail.com")
                .withPassword("TopSecretPassword")
                .withPhone("+380694445522")
                .withUserStatus(true).build();
    }

    @Test
    public void canCreateUser() {
        UserResponse expectedResult = new UserResponse(200L, "unknown", "99");
        UserResponse actualResult = requests.createUser(userObject);
        User createdUser = requests.getUserByUsername(userObject.getUsername());
        Assertions.assertThat(actualResult).isEqualToComparingFieldByField(expectedResult);
        Assertions.assertThat(createdUser).isEqualToComparingFieldByField(userObject);
    }
}
