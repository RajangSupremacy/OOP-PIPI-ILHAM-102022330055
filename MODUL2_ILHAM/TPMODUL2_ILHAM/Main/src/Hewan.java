public class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void suara(){
        System.out.println(" Hewan bersuaralahhh!!!");
    }

    public void makan(){
        System.out.println(nama + " sek mangan ");
    }

    public void makan(String makanan){
        System.out.println(nama + " sek mangan " + makanan + ".");
    }

    public void infoHewan(){
        System.out.println("Namanya " + nama + " umurnya " + umur + " tahun");
    }


}
