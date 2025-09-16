# Manajemen Band Metal
**Nama: Muhamad Irpan Santoso**

**Nim: 2409116119**

**Kelas: Sistem Informasi C**

## Deskripsi Program
Manajemen Band Metal adalah program sederhana untuk mengelola data band metal. Pengguna dapat melakukan operasi dasar seperti menambah, melihat, mengubah, menghapus, dan mencari data band. Program ini dirancang dengan menggunakan arsitektur MVC (Model-View-Controller) untuk memisahkan logika bisnis dari antarmuka pengguna, sehingga kode menjadi lebih terstruktur dan mudah dikembangkan.

## Struktur Package
Proyek ini diorganisir ke dalam tiga package utama, sesuai dengan arsitektur MVC:

1.  **`com.mycompany.bandmetal.model`**
    * **Fungsi:** Package ini berfungsi sebagai **Model**.
    * **Isi:** Berisi kelas `Band.java` yang merupakan representasi data band. Kelas ini memiliki properti seperti `nama`, `genre`, `tahunBerdiri`, dan `jumlahAnggota`, serta dilengkapi dengan *constructor* dan *access modifier* (`private` untuk properti, `public` untuk method) untuk menerapkan enkapsulasi.

2.  **`com.mycompany.bandmetal.service`**
    * **Fungsi:** Package ini berfungsi sebagai **Controller** (logika bisnis).
    * **Isi:** Berisi kelas `BandService.java`. Kelas ini bertanggung jawab penuh atas semua operasi CRUD (Create, Read, Update, Delete). Logika untuk menambah, menampilkan, mengubah, menghapus, dan mencari data band disimpan di sini.

3.  **`com.mycompany.bandmetal.main`**
    * **Fungsi:** Package ini berfungsi sebagai **View** dan **Controller** utama (entry point).
    * **Isi:** Berisi kelas `Main.java` yang mengelola menu interaktif untuk pengguna. Kelas ini menerima input dari pengguna, melakukan validasi, dan kemudian memanggil metode yang sesuai dari kelas `BandService` untuk menjalankan operasi.

## Penjelasan Alur Program 

1. **Menambahkan Band Metal**
   
<img width="600" height="351" alt="image" src="https://github.com/user-attachments/assets/559bd426-3253-4fbe-9722-e064cde78589" />

Gambar diatas adalah proses menambahkan data Band Metal, disini saya memasukkan data Band Metal Killswitch engage, dari nama, tahun berdiri, genre, jumlah anggota.

2. **Menampilkan Data Band Metal**

<img width="393" height="330" alt="Screenshot 2025-09-16 202906" src="https://github.com/user-attachments/assets/030a98c3-baea-432d-a8bf-8bf82b4b9d9e" />

Gambar diatas adalah proses menampilkan data Band Metal, bisa terlihat data Band Metal yang saya masukkan sebelumnya pada poin 1.

3. **Mengubah Data Band Metal**

<img width="678" height="484" alt="image" src="https://github.com/user-attachments/assets/584f0ec6-13df-4b20-a83c-0690838d815a" />

Gambar diatas adalah proses mengubah/update data data pada Band Metal yang sudah ditambahkan, bisa dilihat pada gambar yang awalnya genre Band Metal Killswitch engage ini metalcore modern lalu saya ubah menjadi metalcore saja. 

4. **Menghapus Data Band Metal**

<img width="595" height="539" alt="image" src="https://github.com/user-attachments/assets/a7989c41-e92e-45b1-a485-b8c7bf8d8edf" />

Gambar diatas adalah proses menghapus data Band Metal, sesuai pada gambar saya menghapus Band Metal Falling In Reverse pada No 2 dan digambar bisa dilihat bahwa proses menghapus data Band Metal telah berhasil.

5. **Menghapus Data Band Metal**

<img width="414" height="335" alt="image" src="https://github.com/user-attachments/assets/d68ea550-1098-4436-81d1-357dc61b9986" />

Gambar diatas adalah proses mencari data Band Metal, disini saya mencoba mencari data Band Metal dengan menyebutkan/memanggil menggunakan kata kunci genre dan bisa dilihat pada gambar proses berhasil.

6. **Keluar**

<img width="741" height="329" alt="image" src="https://github.com/user-attachments/assets/5571801a-f5df-49e0-8d52-754a3c1febbe" />

Gambar diatas adalah proses keluar dari pemograman Manajemen Band Metal

## Fitur Utama

* **Tambah Band:** Memungkinkan pengguna untuk menambahkan data band baru.
* **Tampilkan Semua Band:** Menampilkan daftar lengkap band yang sudah ada.
* **Ubah Data Band:** Memungkinkan pengguna mengubah informasi band yang sudah ada.
* **Hapus Band:** Menghapus data band dari daftar.
* **Cari Band:** Fitur pencarian berdasarkan nama atau genre band.
* **Validasi Input:** Mencegah kesalahan program (crash) ketika pengguna memasukkan input yang tidak sesuai (misalnya, memasukkan teks saat diminta angka).
