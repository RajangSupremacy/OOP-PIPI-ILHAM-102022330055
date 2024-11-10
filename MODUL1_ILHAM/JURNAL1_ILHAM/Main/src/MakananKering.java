// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String Nama;
    private int Jumlah;
    private String Brand;
    private Double Harga;

    // Todo : Create Constructor of MakananKering
    public class MakananKering(String Nama , Int Jumlah, Double Harga, String Brand){
    this.Nama = Nama;
    this.Jumlah = Jumlah;
    this.Harga = Harga;
    This.Brand = Brand;
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

    public String getBrand(){
        return Brand;
    }

    public String setBrand(String Brand){
        this.Brand = Brand
    }
    // Todo : Create Method ShowData
    public void ShowData(){
        System.out.println("Nama :" + Nama);
        System.out.println("Jumlah :" + Jumlah);
        System.out.println("Harga :" + Harga);
        System.out.println("Brand :" + Brand);
    }
}
