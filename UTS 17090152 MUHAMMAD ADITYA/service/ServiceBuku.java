package service;

import entity.*;
import java.util.*;

public class ServiceBuku{

    private static List<Buku> data = new LinkedList<Buku>();

    public void tambahData(Buku bk){
        ServiceBuku.data.add(bk);
        System.out.println("data disimpan");
    }

    public void ubahData(Buku bk){
        int result = data.indexOf(bk);
        if (result >= 0){
            data.set(result,bk);
            System.out.println("data diubah");
        }
    }

    public void hapusData(String kode){
        int idx = data.indexOf(new Buku(kode,"","",""));
        if (idx >= 0){
            data.remove(idx);
            System.out.println("data dihapus");
        }else {
            System.out.println("tidak ada data");
        }
    }

    public void cetakData(){
        System.out.println("--- Data Buku ---");
        int i=1;
        for (Buku bk : data){
            System.out.println("data ke - " + i++);
            System.out.println("    Kode Buku : " + bk.getKode());
            System.out.println("    Kategori : " + bk.getKategori());
            System.out.println("    Judul : " + bk.getJudul());
            System.out.println("    Pengarang : " + bk.getPengarang());

        }
    }
}