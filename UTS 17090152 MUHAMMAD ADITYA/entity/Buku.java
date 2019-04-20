package entity;

public class Buku{

    private String kode;
    private String kategori;
    private String judul;
    private String pengarang;

    public Buku(String kode, String kategori, String judul, String pengarang){
        this.kode = kode;
        this.kategori = kategori;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public boolean equals(Object object){
        Buku tmp = (Buku) object;
        return kode.equals(tmp.getKode());
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}