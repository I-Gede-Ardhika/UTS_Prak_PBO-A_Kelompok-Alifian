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
    public abstract double hitungHarga();
    public abstract String getJenisTiket();
}
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
class TiketVIP extends Tiket {
    private static final double BIAYA_TAMBAHAN_VIP = 20000; 
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