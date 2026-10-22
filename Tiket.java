public abstract class Tiket {
    private String nomorKursi;
    protected double hargaDasar;

    public Tiket(String nomorKursi, double hargaDasar) {
        this.nomorKursi = nomorKursi;
        this.hargaDasar = hargaDasar;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    // Method abstract yang wajib di-override oleh kelas anak
    public abstract double hitungHarga();
    public abstract String getJenisTiket();
}

// Pewarisan: TiketReguler mewarisi Tiket
class TiketReguler extends Tiket {
    public TiketReguler(String nomorKursi, double hargaDasar) {
        super(nomorKursi, hargaDasar);
    }

    @Override
    public double hitungHarga() {
        return hargaDasar;
    }

    @Override
    public String getJenisTiket() {
        return "Reguler";
    }
}

// Pewarisan: TiketVIP mewarisi Tiket
class TiketVIP extends Tiket {
    private static final double BIAYA_TAMBAHAN_VIP = 20000; // Static & Konstanta

    public TiketVIP(String nomorKursi, double hargaDasar) {
        super(nomorKursi, hargaDasar);
    }

    @Override
    public double hitungHarga() {
        return hargaDasar + BIAYA_TAMBAHAN_VIP;
    }

    @Override
    public String getJenisTiket() {
        return "VIP";
    }
}