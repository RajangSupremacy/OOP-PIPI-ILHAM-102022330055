// Don't delete any comments below!!!

public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String Nama;
    private int Jumlah;
    private Double Harga;

    // Todo : Create Constructor of Makanan
    public class MakananKering(String Nama , Int Jumlah, Double Harga){
    this.Nama = Nama;
    this.Jumlah = Jumlah;
    this.Harga = Harga;
    }
    // Todo : Create Getter and Setter
    public String getNama(){
        return Nama;
    }

    public String setNama(String Nama){
        this.Nama = Nama;
    }

    public int getJumlah(){
        return Jumlah;
    }

    public int setJumlah (int Jumlah){
        this.Jumlah = Jumlah
    }

    public Double getHarga(){
        return Harga;
    }

    public Double setHarga(Double Harga){
        this.Harga = Harga
    }

}
