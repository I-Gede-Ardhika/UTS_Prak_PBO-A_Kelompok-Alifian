public class Pemesanan implements Pembayaran {
    // Static & Konstanta
    public static final String NAMA_BIOSKOP = "BIOSKOP KITA";
    public static int totalTransaksi = 0;

    // Relasi Objek
    private Pelanggan pelanggan;
    private Jadwal jadwal;
    private Tiket tiket;
    private StatusPemesanan status;

    public Pemesanan(Pelanggan pelanggan, Jadwal jadwal, Tiket tiket, StatusPemesanan status) {
        this.pelanggan = pelanggan;
        this.jadwal = jadwal;
        this.tiket = tiket;
        this.status = status;
        totalTransaksi++; // Bertambah otomatis setiap ada objek Pemesanan baru
    }

    @Override
    public double hitungTotalBayar() {
        return tiket.hitungHarga();
    }

    @Override
    public void cetakStruk() {
        System.out.println("====================================");
        System.out.println("           " + NAMA_BIOSKOP);
        System.out.println("====================================");
        System.out.println("Pelanggan   : " + pelanggan.getNama() + " (" + pelanggan.getNoHp() + ")");
        System.out.println("Film        : " + jadwal.getFilm().getJudul() + " (" + jadwal.getFilm().getGenre() + ")");
        System.out.println("Jadwal      : " + jadwal.getJamTayang() + " | " + jadwal.getStudio());
        System.out.println("Kursi/Tipe  : " + tiket.getNomorKursi() + " (" + tiket.getJenisTiket() + ")");
        System.out.println("Total Bayar : Rp" + hitungTotalBayar());
        System.out.println("Status      : " + status);
        System.out.println("====================================\n");
    }
}