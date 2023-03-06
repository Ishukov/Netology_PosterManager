import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;

public class PosterManagerTest {
    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);
    Poster movie1 = new Poster("Film1", 11);
    Poster movie2 = new Poster("Film2", 12);
    Poster movie3 = new Poster("Film3", 13);
    Poster movie4 = new Poster("Film4", 14);
    Poster movie5 = new Poster("Film5", 15);
    Poster movie6 = new Poster("Film6", 16);
    Poster movie7 = new Poster("Film7", 17);
    Poster movie8 = new Poster("Film8", 18);
    Poster movie9 = new Poster("Film9", 19);
    Poster movie10 = new Poster("Film10", 20);

    @Test
    public void shouldAllMovies() {
        Poster[] posters = {movie1, movie2, movie3};
        doReturn(posters).when(repo).allMovie();

        Poster[] expected = posters;
        Poster[] actual = repo.allMovie();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovie() {
        Poster[] posters = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        doReturn(posters).when(repo).lastMovie();

        Poster[] expected = posters;
        Poster[] actual = repo.lastMovie();

        Assertions.assertArrayEquals(expected, actual);
    }

}
