public class PosterManager {
    private PosterRepository repo;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }

    public void addNewMovie(Poster newMovie) {
        repo.addNewMovie(newMovie);
    }

    public Poster[] allMovies() {
        Poster[] tmp = repo.allMovie();
        return tmp;
    }

    public Poster[] lastMovie() {
        Poster[] tmp = repo.lastMovie();
        return tmp;
    }

    public Poster[] findId(int id) {
        Poster[] tmp = repo.findId(id);
        return tmp;
    }

    public void removeById(int id) {
        repo.removeById(id);
    }

    public void removeAll() {
        repo.removeAll();
    }
}

