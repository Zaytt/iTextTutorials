package mappers;

import model.Film;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

public interface FilmMapper {

    String GET_FILMS = "SELECT f.film_id, f.title, f.description, f.release_year, l.name as `language`, f.length, " +
            "f.rating FROM film f JOIN language l  ON l.language_id = f.language_id;";

    @Select(GET_FILMS)
    public ArrayList<Film> getAllFilms();

}
