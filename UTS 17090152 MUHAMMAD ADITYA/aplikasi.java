import entity.*;
import service.*;
import java.util.*;

public class aplikasi{

    private  static ServiceBuku service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new ServiceBuku();

        int opsi = 5;
        do {
            cetakMenu();
            scanner = new Scanner(System.in);
            try {
                opsi = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Tolong dicek inputnya");
                opsi = 0;
            }
//            opsi = scanner.nextInt();
            prosesMenu(opsi);
        }while (opsi != 5) ;
    }

    private static void prosesMenu(int opsi){
        switch (opsi){
            case 1:
                tambahData();
                break;
            case 2:
                ubahData();
                break;
            case 3:
                hapusData();
                break;
            case 4:
                service.cetakData();
                break;
        }
    }
    private static void hapusData(){
        System.out.println("\n Hapus Data Buku");
        scanner = new Scanner(System.in);
        System.out.println("Kode Buku : ");
        String kode = scanner.nextLine();
        service.hapusData(kode);
    }

    private static void ubahData(){
        String kode,kategori,judul, pengarang;
        System.out.println("\n Ubah Data Buku");
        scanner = new Scanner(System.in);
        System.out.println("Kode Buku : ");
        kode = scanner.nextLine();
        System.out.println("Kategori : ");
        kategori = scanner.nextLine();
        System.out.println("Judul : ");
        judul = scanner.nextLine();
        System.out.println("Pengarang : ");
        pengarang = scanner.nextLine();
        service.ubahData(new Buku(kode,kategori,judul, pengarang));
    }
    private static void tambahData(){
        String kode,kategori,judul, pengarang;
        System.out.println("\n Tambah Data Buku");
        scanner = new Scanner(System.in);
        System.out.println("Kode Buku : ");
        kode = scanner.nextLine();
        System.out.println("Kategori : ");
        kategori = scanner.nextLine();
        System.out.println("Judul : ");
        judul = scanner.nextLine();
        System.out.println("Pengarang : ");
        pengarang = scanner.nextLine();
        simpanDataBaru(new Buku(kode,kategori,judul, pengarang));
    }

    private static void simpanDataBaru(Buku bk){
        service.tambahData(bk);
    }

    private static void cetakMenu(){
        System.out.println("-----Aplikasi Mahasiswa-----");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Ubah Data Buku");
        System.out.println("3. Hapus Data Buku");
        System.out.println("4. Tampilkan Data Buku");
        System.out.println("5. Keluar");
        System.out.println("----------------------------");
        System.out.println("Pilihan > ");
    }
}