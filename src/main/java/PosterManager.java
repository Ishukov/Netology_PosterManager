import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PosterManager {
    public Poster[] movieNames = new Poster[0];
    public Poster[] lastMovie = new Poster[0];
    public int lastMovieLength = 10;

    public PosterManager(int findLast) {
        if (findLast < 0) {
            return;
        }
        lastMovieLength = findLast;
    }

    public void addNewMovieNames(Poster newMovieName) {
        Poster[] tmp = new Poster[movieNames.length + 1];
        for (int i = 0; i < movieNames.length; i++) {
            tmp[i] = movieNames[i];
        }
        tmp[tmp.length - 1] = newMovieName;
        movieNames = tmp;
    }

    public Poster[] findLastMovies() {
        if (lastMovieLength > movieNames.length) {
            lastMovieLength = movieNames.length;
        }
        Poster[] result = new Poster[lastMovieLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movieNames[movieNames.length - 1 - i];
        }
        lastMovie = result;
        return lastMovie;
    }

    public Poster[] findAll() {
        Poster[] all = getMovieNames();
        return all;
    }


}
