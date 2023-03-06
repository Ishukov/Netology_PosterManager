import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int lastMovies;

    public PosterManager() {
        this.lastMovies = 10;
    }

    public PosterManager(int selectLastMovies) {
        this.lastMovies = selectLastMovies;
    }

    public void addNewMovie(Poster newMovie) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = newMovie;
        posters = tmp;
    }

    public Poster[] allMovie() {
        Poster[] all = getPosters();
        return all;
    }

    public Poster[] lastMovie() {
        int resultLength;
        if (posters.length < lastMovies) {
            resultLength = posters.length;
        } else {
            resultLength = lastMovies;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }
}