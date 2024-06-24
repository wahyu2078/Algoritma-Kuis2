package Tugas2;

import java.util.ArrayList;

public class ArrayListMahasiswa_29 {
    private ArrayList<Mahasiswa_29> listMahasiswa;

    public ArrayListMahasiswa_29() {
        listMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa_29 mhs) {
        listMahasiswa.add(mhs);
    }

    public void hapusMahasiswa(String nim) {
        listMahasiswa.removeIf(mhs -> mhs.getNim().equals(nim));
    }

    public Mahasiswa_29 cariMahasiswa(String nim) {
        for (Mahasiswa_29 mhs : listMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;
    }

    public void cetakSemuaMahasiswa() {
        for (Mahasiswa_29 mhs : listMahasiswa) {
            System.out.println(mhs);
        }
    }
}
