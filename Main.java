public class Main {
    public static void main(String[] args) {
        // membuat objek film dan jadwal
        Film film1 = new Film("Jumbo", "Animasi/Petualangan");
        Jadwal jadwal1 = new Jadwal(film1, "19:00 WIB", "Studio 1");

        // membuat objek pelanggan
        Pelanggan pelanggan1 = new Pelanggan("budi", "08123456789");
        Pelanggan pelanggan2 = new Pelanggan("Tuni", "08987654321");

        // mebuat objek tiket
        Tiket tiket1 = new TiketReguler("C5", 40000);
        Tiket tiket2 = new TiketVIP("A1", 40000);

        // membuat objek pesanan
        Pemesanan pesanan1 = new Pemesanan(pelanggan1, jadwal1, tiket1, StatusPemesanan.LUNAS);
        Pemesanan pesanan2 = new Pemesanan(pelanggan2, jadwal1, tiket2, StatusPemesanan.PENDING);

        pesanan1.cetakStruk();
        pesanan2.cetakStruk();

        System.out.println("Total pesanan : " + Pemesanan.totalTransaksi + "pesanan");
    }
}