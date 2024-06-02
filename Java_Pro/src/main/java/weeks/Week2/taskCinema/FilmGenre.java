package weeks.Week2.taskCinema;

public enum FilmGenre {
    ACTION_FILM("Экшн"),
    COMEDY_FILM("Комедия"),
    DRAMA_FILM("Драма");
    private String name;
    FilmGenre(String name) {
        this.name = name;
    }

    public String getGenre() {
        return name;
    }
}
