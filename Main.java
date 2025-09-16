/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bandmetal.main;
import com.mycompany.bandmetal.model.Band;
import com.mycompany.bandmetal.service.BandService;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author muham
 */
public class Main {
    private static BandService bandService = new BandService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            tampilkanMenu();
            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        tambahBand();
                        break;
                    case 2:
                        tampilkanSemuaBand();
                        break;
                    case 3:
                        ubahDataBand();
                        break;
                    case 4:
                        hapusBand();
                        break;
                    case 5:
                        cariBand();
                        break;
                    case 6:
                        running = false;
                        System.out.println("Terima kasih Salam METALLARGGWW!!!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih 1-6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Silakan masukkan angka.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("MANAJEMEN BAND METAL");
        System.out.println("1. Tambah Band Metal Baru");
        System.out.println("2. Tampilkan Semua Band Metal");
        System.out.println("3. Ubah Data Band Metal");
        System.out.println("4. Hapus Band Metal");
        System.out.println("5. Cari Band Metal");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu (1-6): ");
    }

    private static void tambahBand() {
        System.out.println("TAMBAH BAND BARU");
        System.out.print("Masukkan nama band Metal: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan genre Band Metal: ");
        String genre = scanner.nextLine();
        
        int tahun = 0;
        int anggota = 0;
        try {
            System.out.print("Masukkan tahun berdiri Band Metal : ");
            tahun = scanner.nextInt();
            System.out.print("Masukkan jumlah anggota Band Metal: ");
            anggota = scanner.nextInt();
            scanner.nextLine();
            
            Band bandBaru = new Band(nama, genre, tahun, anggota);
            bandService.addBand(bandBaru);
            System.out.println("Band '" + nama + "' Yooo berhasil ditambahkan!");
        } catch (InputMismatchException e) {
            System.out.println("Input tahun atau jumlah anggota tidak valid. Operasi dibatalkan Men.");
            scanner.nextLine();
        }
    }

    private static void tampilkanSemuaBand() {
        System.out.println("DAFTAR SEMUA BAND");
        ArrayList<Band> bands = bandService.getAllBands();
        if (bands.isEmpty()) {
            System.out.println("Belum ada data band Metal Itu.");
            return;
        }
        for (int i = 0; i < bands.size(); i++) {
            System.out.println((i + 1) + ". " + bands.get(i).toString());
            System.out.println();
        }
    }
    
    private static void ubahDataBand() {
        System.out.println("UBAH DATA BAND");
        tampilkanSemuaBand();
        if (bandService.getAllBands().isEmpty()) {
            return;
        }
        
        System.out.print("Pilih nomor band Metal yang ingin diubah: ");
        try {
            int index = scanner.nextInt() - 1;
            scanner.nextLine();
            
            Band band = bandService.getBand(index);
            if (band == null) {
                System.out.println("Nomor band Metal tidak valid!");
                return;
            }
            
            System.out.println("Data saat ini: \n" + band.toString());
            
            System.out.print("Masukkan nama Band Metal baru (kosongkan jika tidak diubah): ");
            String namaBaru = scanner.nextLine();
            if (!namaBaru.isEmpty()) band.setNama(namaBaru);
            
            System.out.print("Masukkan genre Band metal yang baru (kosongkan jika tidak diubah): ");
            String genreBaru = scanner.nextLine();
            if (!genreBaru.isEmpty()) band.setGenre(genreBaru);
            
            System.out.print("Masukkan tahun berdiri Band Metal yang baru (kosongkan jika tidak diubah): ");
            String tahunInput = scanner.nextLine();
            if (!tahunInput.isEmpty()) {
                band.setTahunBerdiri(Integer.parseInt(tahunInput));
            }

            System.out.print("Masukkan jumlah anggotaBand Metal yang baru (kosongkan jika tidak diubah): ");
            String anggotaInput = scanner.nextLine();
            if (!anggotaInput.isEmpty()) {
                band.setJumlahAnggota(Integer.parseInt(anggotaInput));
            }
            
            bandService.updateBand(index, band);
            System.out.println("Data band Metal berhasil diubah!");
            
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Input tidak valid. Operasi dibatalkan.");
            scanner.nextLine();
        }
    }
    
    private static void hapusBand() {
        System.out.println("HAPUS BAND");
        tampilkanSemuaBand();
        if (bandService.getAllBands().isEmpty()) {
            return;
        }
        
        System.out.print("Pilih nomor Band Metal yang ingin dihapus: ");
        try {
            int index = scanner.nextInt() - 1;
            scanner.nextLine();
            
            Band band = bandService.getBand(index);
            if (band == null) {
                System.out.println("Nomor band Metal tidak valid!");
                return;
            }
            
            System.out.print("Yakin ingin menghapus data Band Metal '" + band.getNama() + "'? (yoo/noo): ");
            String konfirmasi = scanner.nextLine();
            
            if (konfirmasi.equalsIgnoreCase("yoo")) {
                bandService.deleteBand(index);
                System.out.println("Band Metal berhasil dihapus!");
            } else {
                System.out.println("Penghapusan dibatalkan.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Operasi dibatalkan.");
            scanner.nextLine();
        }
    }
    
    private static void cariBand() {
        System.out.println("CARI BAND METAL");
        System.out.print("Masukkan (nama/genre): ");
        String keyword = scanner.nextLine();
        
        ArrayList<Band> hasil = bandService.searchBands(keyword);
        
        if (hasil.isEmpty()) {
            System.out.println("Tidak ada band Metal yang ditemukan'" + keyword + "'.");
        } else {
            System.out.println("Hasil Pencarian Band Metal");
            for (Band band : hasil) {
                System.out.println(band.toString());
                System.out.println();
            }
        }
    }
}