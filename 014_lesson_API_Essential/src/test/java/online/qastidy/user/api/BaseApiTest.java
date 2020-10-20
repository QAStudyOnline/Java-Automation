package online.qastidy.user.api;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.filter.Filter;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.mapper.ObjectMapperType;
import com.jayway.restassured.mapper.ObjectMapper;
import com.jayway.restassured.response.*;
import com.jayway.restassured.specification.*;
import org.junit.BeforeClass;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static online.qastudy.api.utils.Const.BASE_PATH;
import static online.qastudy.api.utils.Const.BASE_URL;

public class BaseApiTest {
    protected static RequestSpecification petstoreUseRequestSpecification = null;

    @BeforeClass
    public static void beforeApiTests() {
        RestAssured.baseURI = BASE_URL;
        RestAssured.basePath = BASE_PATH;

        petstoreUseRequestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .build();

        RestAssured.requestSpecification = petstoreUseRequestSpecification;
    }
}
