import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Parkir parkir = new Parkir();

        boolean running = true;

        while (running) {
            System.out.println("=== SISTEM PARKIR OTOMATIS ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Hapus Kendaraan");
            System.out.println("3. Tampilkan Laporan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = input.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan (mobil/motor): ");
                    String jenis = input.nextLine();
                    System.out.print("Masukkan Jam Masuk (0-24): ");
                    int jamMasuk = input.nextInt();
                    System.out.print("Masukkan Jam Keluar (0-24): ");
                    int jamKeluar = input.nextInt();

                    Kendaraan k = new Kendaraan(plat, jenis, jamMasuk, jamKeluar);
                    parkir.tambahKendaraan(k);
                    System.out.println("!Kendaraan berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Masukkan Plat Nomor yang akan dihapus: ");
                    String hapusPlat = input.nextLine();
                    parkir.hapusKendaraan(hapusPlat);
                    System.out.println("!Kendaraan berhasil dihapus!");
                    break;

                case 3:
                    parkir.tampilkanLaporan();
                    break;

                case 4:
                    running = false;
                    System.out.println("Terima kasih! Sistem parkir berhenti.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }
}
