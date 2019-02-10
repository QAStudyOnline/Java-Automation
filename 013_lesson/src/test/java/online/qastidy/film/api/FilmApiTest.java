package online.qastidy.film.api;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import online.qastudy.api.dto.FilmDTO;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class FilmApiTest {
    public static final String BASE_URL = "http://localhost:8080/film";
    public static final String APPLICATION_JSON = "application/json";
    public static final String APPLICATION_XML = "application/xml";

    @Test
    public void testGetFilmById() {
        Assertions.assertThat(
                RestAssured.given()
                        .accept(ContentType.JSON)
                        .baseUri(BASE_URL)
                        .basePath("/1")
                        .get()
                        .as(FilmDTO.class)
                        .equals(new FilmDTO.FilmDTOBuilder()
                                .withDirector("Peter_Jackson")
                                .withName("The Lord of the Rings: The Fellowship of the Ring")));
    }
}
