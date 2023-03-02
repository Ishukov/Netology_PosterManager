import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {
    Poster movieName1 = new Poster("Бладшот");
    Poster movieName2 = new Poster("Вперед");
    Poster movieName3 = new Poster("Отель «Белград»");

    @Test
    public void shouldAddNewFilmName() {
        PosterManager pom = new PosterManager();
        pom.addNewMovieNames(movieName1);
        pom.addNewMovieNames(movieName2);
        pom.addNewMovieNames(movieName3);


        Poster[] expected = {movieName1, movieName2, movieName3};
        Poster[] actual = pom.getMovieNames();

        Assertions.assertArrayEquals(expected, actual);

    }
}
