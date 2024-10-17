public class Penumpang {
    String NIK;
    String namaDepan;
    String namaBelakang;

    public Penumpang(String nik, String namaDepanPenumpang, String namaBelakangPenumpang) {
        NIK = nik;
        namaDepan = namaDepanPenumpang;
        namaBelakang = namaBelakangPenumpang;
    }
    
    public void tampilDaftarPenumpang() {
        System.out.println("Nomor Induk Kependudukan: " + NIK);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
        System.out.println();
    }
}
