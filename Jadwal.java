public class Jadwal {
    private Film film; // Relasi objek dengan kelas Film
    private String jamTayang;
    private String studio;

    public Jadwal(Film film, String jamTayang, String studio) {
        this.film = film;
        this.jamTayang = jamTayang;
        this.studio = studio;
    }

    public Film getFilm() {
        return film;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public String getStudio() {
        return studio;
    }
}