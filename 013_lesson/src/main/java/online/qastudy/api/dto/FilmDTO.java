package online.qastudy.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "director"
})
public class FilmDTO implements Serializable {

    @XmlElement(name = "MovieName")
    @JsonProperty("name")
    private String name;

    @XmlElement(name = "MovieMaker")
    @JsonProperty("director")
    private String director;

    public FilmDTO() {
    }

    public FilmDTO(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmDTO filmDTO = (FilmDTO) o;

        if (name != null ? !name.equals(filmDTO.name) : filmDTO.name != null) return false;
        return director != null ? director.equals(filmDTO.director) : filmDTO.director == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (director != null ? director.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FilmDTO{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public static class FilmDTOBuilder {

        private String name;
        private String director;

        public FilmDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public FilmDTOBuilder withDirector(String director) {
            this.director = director;
            return this;
        }

        public FilmDTO build() {
            return new FilmDTO(this.name, this.director);
        }

    }
}
