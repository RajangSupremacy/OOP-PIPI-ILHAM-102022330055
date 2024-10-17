// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String Nama;
    private int Jumlah;
    private Double Harga;
    private String Bahan;

    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String Nama, int Jumlah, Double harga, String Bahan){
        this.Nama = Nama;
        this.Jumlah = Jumlah;
        this.Harga = Harga;
        this.Bahan = Bahan;
    }
    // Todo : Create Getter and Setter
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public int getJumlah() {
        return Jumlah;
    }
    public void setJumlah(int jumlah) {
        Jumlah = jumlah;
    }
    public Double getHarga() {
        return Harga;
    }
    public void setHarga(Double harga) {
        Harga = harga;
    }
    public String getBahan() {
        return Bahan;
    }
    public void setBahan(String bahan) {
        Bahan = bahan;
    }
    // Todo : Create Method ShowData
    public static void ShowData(){
        System.out.println("Nama :" + Nama);
        System.out.println("Jumlah :" + Jumlah);
        System.out.println("Harga :" + Harga);
        System.out.println("Bahan :" + Bahan);
    }
        
}

