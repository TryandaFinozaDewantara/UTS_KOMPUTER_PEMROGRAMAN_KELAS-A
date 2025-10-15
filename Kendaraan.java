public class Kendaraan {
    private String platNomor;
    private String jenis;
    private int jamMasuk;
    private int jamKeluar;

    public Kendaraan(String platNomor, String jenis, int jamMasuk, int jamKeluar) {
        this.platNomor = platNomor;
        this.jenis = jenis;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getJenis() {
        return jenis;
    }

    public int getJamMasuk() {
        return jamMasuk;
    }

    public int getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(int jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    public int hitungDurasi() {
        return jamKeluar - jamMasuk;
    }

    public int hitungBiaya() {
        int durasi = hitungDurasi();
        if (jenis.equalsIgnoreCase("mobil")) {
            return durasi * 7000;
        } else if (jenis.equalsIgnoreCase("motor")) {
            return durasi * 4000;
        } else {
            return 0;
        }
    }
}
