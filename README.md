# STUDI KASUS 2 : SISTEM RESERVASI PARKIR OTOMATIS
Nama Kelompok 12 
1. Tryanda Finoza Dewantara (G1A025017)
2. Muhammad Gazril Alfarizi (G1A025097)

---
# Overview Sistem

Sistem ini dirancang untuk membantu pengelola parkir di *Bencoolen Mall* dalam mencatat kendaraan yang **masuk dan keluar secara otomatis**, serta menghitung **biaya parkir berdasarkan lama waktu kendaraan diparkir**.
Sistem bekerja secara dinamis menggunakan struktur data **List (ArrayList)** untuk menyimpan dan mengelola data kendaraan.

---

#### **Tujuan Sistem**

1. Mencatat data kendaraan (plat nomor, jenis, waktu masuk, dan waktu keluar).
2. Menghitung **durasi parkir** dan **biaya parkir** secara otomatis.
3. Menampilkan **laporan daftar kendaraan** dan **total pendapatan** parkir.
4. Memungkinkan penambahan dan penghapusan data kendaraan secara dinamis.

---

#### **Struktur Program**

##### 1. **Class Kendaraan**

Berfungsi untuk merepresentasikan setiap kendaraan yang masuk ke area parkir.

**Atribut:**

* `platNomor : String` → Nomor plat kendaraan.
* `jenis : String` → Jenis kendaraan (Mobil/Motor).
* `jamMasuk : int` → Jam kendaraan masuk.
* `jamKeluar : int` → Jam kendaraan keluar.

**Method:**

* `hitungDurasi()` → Menghitung selisih antara jam keluar dan jam masuk.
* `hitungBiaya()` → Menghitung biaya parkir berdasarkan jenis kendaraan:

  * Mobil = Rp 7000/jam
  * Motor = Rp 4000/jam

**Fungsi Tambahan:**
Tersedia **constructor** dan **getter/setter** untuk inisialisasi dan pengaksesan atribut.

---

##### 2. **Class Parkir**

Mengelola seluruh data kendaraan yang sedang parkir.

**Atribut:**

* `dataKendaraan : ArrayList<Kendaraan>` → Menyimpan daftar kendaraan yang masuk.

**Method:**

* `tambahKendaraan()` → Menambahkan data kendaraan baru.
* `hapusKendaraan()` → Menghapus data kendaraan yang sudah keluar.
* `tampilkanLaporan()` → Menampilkan seluruh daftar kendaraan beserta total pendapatan parkir.

---

##### 3. **Class Main**

Sebagai pengendali utama sistem (program utama).

**Fungsi:**

* Menggunakan **looping** untuk menerima input kendaraan masuk dan keluar secara berulang.
* Mengelola menu interaktif (tambah, hapus, tampil laporan).
* Memanfaatkan **struktur data List dan array** untuk manajemen data dinamis.

---

#### **Alur Kerja Sistem**

1. Pengguna memasukkan data kendaraan (plat, jenis, jam masuk).
2. Sistem menyimpan data ke dalam daftar (ArrayList).
3. Ketika kendaraan keluar, pengguna memasukkan jam keluar.
4. Sistem menghitung durasi parkir dan biaya otomatis berdasarkan jenis kendaraan.
5. Sistem menampilkan laporan kendaraan dan total pendapatan parkir.
