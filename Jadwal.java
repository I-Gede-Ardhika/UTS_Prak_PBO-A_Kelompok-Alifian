public class Jadwal {
    private final String  film; // Relasi objek dengan kelas Film
    private final String jamTayang;
    private final String studio;
    private final String genre;

    public Jadwal(String film, String jamTayang, String studio, String genre) {
        this.film = film;
        this.jamTayang = jamTayang;
        this.studio = studio;
        this.genre = genre;
    }

    public String getFilm() {
        return film;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public String getStudio() {
        return studio;
    }

    public String getGenre() {
        return genre;
    }
}