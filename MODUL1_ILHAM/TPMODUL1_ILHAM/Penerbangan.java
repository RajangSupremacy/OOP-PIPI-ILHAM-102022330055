public class Penerbangan {
    String nomorPenerbangan;
    String bandaraKeberangkatan;
    String bandaraTujuan;
    String waktuKeberangkatan;
    String waktuKedatangan;
    float hargaTiket;

    public Penerbangan(String nomor, String keberangkatan, String tujuan, 
                       String waktuBerangkat, String waktuTiba, float harga) {
        nomorPenerbangan = nomor;
        bandaraKeberangkatan = keberangkatan;
        bandaraTujuan = tujuan;
        waktuKeberangkatan = waktuBerangkat;
        waktuKedatangan = waktuTiba;
        hargaTiket = harga;
    }

    public Penerbangan(String keberangkatan, String tujuan, float harga, String nomor, String waktuBerangkat, String waktuTiba) {
        bandaraKeberangkatan = keberangkatan;
        bandaraTujuan = tujuan;
        hargaTiket = harga;
        nomorPenerbangan = nomor;
        waktuKeberangkatan = waktuBerangkat;
        waktuKedatangan = waktuTiba;
    }

    public String NomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String BandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String BandaraTujuan() {
        return bandaraTujuan;
    }

    public String WaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String WaktuKedatangan() {
        return waktuKedatangan;
    }

    public float HargaTiket() {
        return hargaTiket;
    }

    public void DaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan + " ---> Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: Rp." + hargaTiket);
        System.out.println();
    }

    public void NomorPenerbangan(String nomor) {
        nomorPenerbangan = nomor;
    }

    public void BandaraKeberangkatan(String keberangkatan) {
        bandaraKeberangkatan = keberangkatan;
    }

    public void BandaraTujuan(String tujuan) {
        bandaraTujuan = tujuan;
    }

    public void WaktuKeberangkatan(String waktuBerangkat) {
        waktuKeberangkatan = waktuBerangkat;
    }

    public void WaktuKedatangan(String waktuTiba) {
        waktuKedatangan = waktuTiba;
    }

    public void HargaTiket(float harga) {
        hargaTiket = harga;
    }
}
