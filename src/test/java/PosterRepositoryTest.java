import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {

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
        PosterRepository repo = new PosterRepository();

        Poster expected[] = new Poster[0];
        Poster actual[] = repo.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldAddMovie() {
        PosterRepository repo = new PosterRepository();
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);

        Poster expected[] = {movie1, movie2, movie3};
        Poster actual[] = repo.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllMovies() {
        PosterRepository repo = new PosterRepository();
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);

        Poster expected[] = {movie1, movie2, movie3};
        Poster actual[] = repo.allMovie();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovies() {
        PosterRepository repo = new PosterRepository();
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
        PosterRepository repo = new PosterRepository(3);
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);

        Poster expected[] = {movie3, movie2, movie1};
        Poster actual[] = repo.lastMovie();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        PosterRepository repo = new PosterRepository();
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);

        Poster expected[] = {movie3};
        Poster actual[] = repo.findId(13);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        PosterRepository repo = new PosterRepository();
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);
        repo.removeById(13);

        Poster expected[] = {movie1, movie2};
        Poster actual[] = repo.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        PosterRepository repo = new PosterRepository();
        repo.addNewMovie(movie1);
        repo.addNewMovie(movie2);
        repo.addNewMovie(movie3);
        repo.removeAll();

        Poster[] expected = new Poster[0];
        Poster actual[] = repo.getPosters();

        Assertions.assertArrayEquals(expected, actual);

    }
}
