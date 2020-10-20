package online.qastidy.film.api;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.*;
import org.junit.BeforeClass;

import static online.qastudy.api.utils.Const.*;

public class BaseApiTest {
    protected static RequestSpecification petstoreUserRequestSpecification = null;

    @BeforeClass
    public static void beforeApiTests() {
        RestAssured.baseURI = BASE_URL;
        RestAssured.basePath = BASE_PATH;

        petstoreUserRequestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .build();

        RestAssured.requestSpecification = petstoreUserRequestSpecification;
    }
}
