import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PosterRepository {
    private Poster[] posters = new Poster[0];
    private int lastMovies = 10;

    public PosterRepository(int selectLastMovies) {
        lastMovies = selectLastMovies;
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
        if (posters.length < lastMovies) {
            lastMovies = posters.length;
        }
        Poster[] result = new Poster[lastMovies];
        for (int i = 0; i < lastMovies; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }

    public Poster[] findId(int id) {
        Poster[] result = new Poster[1];
        for (Poster poster : posters) {
            if (poster.id == id) {
                result = new Poster[]{poster};
            }
        }
        return result;
    }

    public void removeById(int id) {
        Poster[] tmp = new Poster[posters.length - 1];
        int index = 0;
        for (Poster poster : posters) {
            if (poster.id != id) {
                tmp[index] = poster;
                index++;
            }
        }
        posters = tmp;
    }

    public void removeAll() {
        Poster[] tmp = new Poster[0];
        posters = tmp;
    }
}