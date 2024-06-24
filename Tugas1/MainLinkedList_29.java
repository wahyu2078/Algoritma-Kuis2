package Tugas1;

import java.util.Scanner;

public class MainLinkedList_29 {
    public static void main(String[] args) {
        LinkedListMahasiswa_29 list = new LinkedListMahasiswa_29();

        list.tambahMahasiswa(new Mahasiswa_29("123", "Gegas", "01-01-2000"));
        list.tambahMahasiswa(new Mahasiswa_29("124", "Fikar", "02-02-2001"));
        list.tambahMahasiswa(new Mahasiswa_29("125", "Malik", "03-03-2002"));
        list.tambahMahasiswa(new Mahasiswa_29("126", "Wahyu", "04-04-2003"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    list.tambahMahasiswa(new Mahasiswa_29(nim, nama, tglLahir));
                    break;
                case 2:
                    System.out.print("NIM yang akan dihapus: ");
                    nim = scanner.nextLine();
                    list.hapusMahasiswa(nim);
                    break;
                case 3:
                    System.out.print("NIM yang dicari: ");
                    nim = scanner.nextLine();
                    Mahasiswa_29 mhs = list.cariMahasiswa(nim);
                    if (mhs != null) {
                        System.out.println("Mahasiswa ditemukan: " + mhs);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 4:
                    list.cetakSemuaMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}

