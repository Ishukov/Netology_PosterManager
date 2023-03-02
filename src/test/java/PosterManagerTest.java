import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class PosterManagerTest {
    Poster movieName1 = new Poster("Бладшот");
    Poster movieName2 = new Poster("Вперед");
    Poster movieName3 = new Poster("Отель «Белград»");
    Poster movieName4 = new Poster("Джентельмены");
    Poster movieName5 = new Poster("Аватар");
    Poster movieName6 = new Poster("Терминатор");
    Poster movieName7 = new Poster("Властилин колец");
    Poster movieName8 = new Poster("Матрица");
    Poster movieName9 = new Poster("Карты, деньги, 2 ствола");
    Poster movieName10 = new Poster("Джон Уик");



    @Test
    public void shouldFindAllMovies() {
        PosterManager pom = new PosterManager();
        pom.addNewMovieNames(movieName1);
        pom.addNewMovieNames(movieName2);
        pom.addNewMovieNames(movieName3);
        pom.addNewMovieNames(movieName4);
        pom.addNewMovieNames(movieName5);
        pom.addNewMovieNames(movieName6);
        pom.addNewMovieNames(movieName7);
        pom.addNewMovieNames(movieName8);
        pom.addNewMovieNames(movieName9);
        pom.addNewMovieNames(movieName10);

        Poster[] expected = {movieName1, movieName2, movieName3, movieName4, movieName5, movieName6, movieName7, movieName8, movieName9, movieName10};
        Poster[] actual = pom.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        int findLast = 5;
        PosterManager pom = new PosterManager(findLast);
        pom.addNewMovieNames(movieName1);
        pom.addNewMovieNames(movieName2);
        pom.addNewMovieNames(movieName3);
        pom.addNewMovieNames(movieName4);
        pom.addNewMovieNames(movieName5);
        pom.addNewMovieNames(movieName6);
        pom.addNewMovieNames(movieName7);
        pom.addNewMovieNames(movieName8);
        pom.addNewMovieNames(movieName9);
        pom.addNewMovieNames(movieName10);

        Poster[] expected = {movieName10, movieName9, movieName8, movieName7, movieName6};
        Poster[] actual = pom.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "FindLastDate.csv")
    public void shouldFindLast(int findLast, int expected) {
        PosterManager pom = new PosterManager(findLast);
        pom.addNewMovieNames(movieName1);
        pom.addNewMovieNames(movieName2);
        pom.addNewMovieNames(movieName3);
        pom.addNewMovieNames(movieName4);
        pom.addNewMovieNames(movieName5);
        pom.addNewMovieNames(movieName6);
        pom.addNewMovieNames(movieName7);
        pom.addNewMovieNames(movieName8);
        pom.addNewMovieNames(movieName9);
        pom.addNewMovieNames(movieName10);
        pom.findLastMovies();

        int actual = pom.lastMovieLength;

        Assertions.assertEquals(expected, actual);
    }

}
