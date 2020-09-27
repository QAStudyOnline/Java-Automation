package online.qastidy.film.api;

import online.qastudy.api.dto.User;
import online.qastudy.api.dto.UserResponse;
import org.assertj.core.api.Assertions;
import org.hamcrest.Condition;
import org.hamcrest.CoreMatchers;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static online.qastudy.api.utils.Const.*;

public class PetStoreUserApiTest extends BaseApiTest {
    private static User user = null;

    @BeforeClass
    public static void beforePetStoreUserApiTest() {
        user = new User.UserBuilder()
                .withId(123L)
                .withEmail("test@email.com")
                .withFirstName("TestApi1")
                .withLastName("TestLastName")
                .withPassword("secret")
                .withPhone("+38011222334455")
                .withUserStatus(true)
                .build();

    }

    @Test
    public void testCanCreateUser() {
        given()
                .body(user)
                .when()
                .post(USER)
                .prettyPeek()
                .then()
                .statusCode(200)
                .and()
                .body("code", CoreMatchers.equalTo(200))
                .and()
                .body("type", CoreMatchers.equalTo("unknown"))
                .and()
                .body("message", CoreMatchers.equalTo(user.getId().toString()));
    }

    @Test
    public void testCanCreateUserAndCompareResponseAsObjects() {
        UserResponse expectedResult = new UserResponse(200L, "unknown", "123");
        UserResponse actualResult = given().body(user).when().post(USER).getBody().as(UserResponse.class);
        Assertions.assertThat(actualResult)
                .isInstanceOf(UserResponse.class)
                .hasNoNullFieldsOrProperties()
                .hasFieldOrProperty("code")
                .hasFieldOrProperty("message")
                .hasFieldOrProperty("type")
                .isEqualToComparingFieldByField(expectedResult)
                .hasToString(expectedResult.toString());
    }
}
