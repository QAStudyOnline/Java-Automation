package online.qastidy.film.api;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import online.qastudy.api.dto.User;
import online.qastudy.api.utils.Log;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static online.qastudy.api.utils.Const.*;

public class UserApiTest {


    @Test
    public void canAddUser() {
        User testUser = new User.UserBuilder()
                .withId(99l)
                .withUsername("i2i")
                .withFirstName("Ivan")
                .withLastName("Ivanov")
                .withEmail("testUser1@gmail.com")
                .withPassword("TopSecretPassword")
                .withPhone("+380694445522")
                .withUserStatus(true).build();

        RequestSpecification request = given();

        Response response = request.baseUri(BASE_URL + BASE_PATH + USER)
                .contentType(ContentType.JSON)
                .body(testUser)
                .when()
                .post();

        Log.LOG.info(response.prettyPrint());

        Assertions.assertThat(response.statusCode()).isEqualTo(200);
        Assertions.assertThat(response.getContentType().contentEquals(ContentType.JSON.toString()));
    }

    @Test
    public void canGetUserByUsername() {
        User testUser = new User.UserBuilder()
                .withId(99l)
                .withUsername("i2i")
                .withFirstName("Ivan")
                .withLastName("Ivanov")
                .withEmail("testUser1@gmail.com")
                .withPassword("TopSecretPassword")
                .withPhone("+380694445522")
                .withUserStatus(true).build();

        RequestSpecification request = given();

        Response response = request.baseUri(BASE_URL + BASE_PATH + USER)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .basePath(testUser.getUser_name_true())
                .when()
                .get();

        Log.LOG.info(response.prettyPeek());

        response.then()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON);

        Assertions.assertThat(response.getBody().as(User.class)).isEqualToComparingFieldByField(testUser);
    }

    @Test
    public void tmp(){
        given()
                .baseUri("https://google.com")
                .contentType(ContentType.ANY)
                .accept("Accept")
                .param("q","Job for automation qa in LA")
        .when()
                .get()
        .then()
                .statusCode(200)
                .and()
                .toString()
                .contains("Job for automation qa in LA");

    }

}
