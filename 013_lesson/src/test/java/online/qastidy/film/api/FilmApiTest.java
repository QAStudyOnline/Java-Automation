package online.qastidy.film.api;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.mapper.ObjectMapperType;
import online.qastudy.api.dto.FilmDTO;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FilmApiTest {
    public static final String BASE_URL = "http://localhost:8080/film";
    public static final String ADD = "/add";


    @Test
    public void testGetFilmByIdInJSON() {
        Assertions.assertThat(
        RestAssured.given()
                        .accept(ContentType.JSON)
                        .baseUri(BASE_URL)
                        .basePath("/1")
                        .get()
                        .as(FilmDTO.class)
                        .equals(new FilmDTO.FilmDTOBuilder()
                                .withDirector("Peter_Jackson")
                                .withName("The Lord of the Rings: The Fellowship of the Ring").build())
    );
    }

    @Test
    public void testGetFilmByIdInXML() {
        Assertions.assertThat(
                RestAssured.given()
                        .accept(ContentType.XML)
                        .baseUri(BASE_URL)
                        .basePath("/1")
                        .get()
                        .as(FilmDTO.class)
                        .equals(new FilmDTO.FilmDTOBuilder()
                                .withDirector("Peter_Jackson")
                                .withName("The Lord of the Rings: The Fellowship of the Ring").build()));
    }
}
