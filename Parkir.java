import java.util.ArrayList;

public class Parkir {
    private ArrayList<Kendaraan> dataKendaraan = new ArrayList<>();

    public void tambahKendaraan(Kendaraan k) {
        dataKendaraan.add(k);
    }

    public void hapusKendaraan(String platNomor) {
        dataKendaraan.removeIf(k -> k.getPlatNomor().equalsIgnoreCase(platNomor));
    }

    public void tampilkanLaporan() {
        int totalPendapatan = 0;
        System.out.println("\n===== LAPORAN PARKIR =====");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", 
                "Plat", "Jenis", "Masuk", "Keluar", "Durasi", "Biaya");

        for (Kendaraan k : dataKendaraan) {
            int durasi = k.hitungDurasi();
            int biaya = k.hitungBiaya();
            totalPendapatan += biaya;

            System.out.printf("%-10s %-10s %-10d %-10d %-10d %-10d%n",
                    k.getPlatNomor(), k.getJenis(), k.getJamMasuk(), 
                    k.getJamKeluar(), durasi, biaya);
        }

        System.out.println("===========================");
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);
    }
}
