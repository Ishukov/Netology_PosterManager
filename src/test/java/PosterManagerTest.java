import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

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
    public void shouldEmptyRepo() {
        PosterManager repo = new PosterManager();
        Poster expected[] = new Poster[0];
        Poster actual[] = repo.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldAddMovie() {
        PosterManager repo = new PosterManager();
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);

        Poster expected[] = {movie1, movie2, movie3};
        Poster actual[] = repo.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllMovies() {
        PosterManager repo = new PosterManager();
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);

        Poster expected[] = {movie1, movie2, movie3};
        Poster actual[] = repo.allMovie();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovies() {
        PosterManager repo = new PosterManager();
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);
        repo.addNewMovie(movie4);
        repo.addNewMovie(movie5);
        repo.addNewMovie(movie6);
        repo.addNewMovie(movie7);
        repo.addNewMovie(movie8);
        repo.addNewMovie(movie9);
        repo.addNewMovie(movie10);

        Poster expected[] = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Poster actual[] = repo.lastMovie();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSelectedLastMovies() {
        PosterManager repo = new PosterManager(3);
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);

        Poster expected[] = {movie3, movie2, movie1};
        Poster actual[] = repo.lastMovie();

        Assertions.assertArrayEquals(expected, actual);
    }
}