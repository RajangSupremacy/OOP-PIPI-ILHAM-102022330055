class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    // To do: Buatlah constructor pada class Komputer
    public Komputer(float hargaPerJam, int jumlahKomputer, String namaWarnet) {
        this.hargaPerJam = hargaPerJam;
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
    }
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    public void informasi(){
        System.out.println("Jumlah komputer : " + jumlahKomputer);
        System.out.println("Nama warnet : " + namaWarnet);
        System.out.println("Harga per jam : " + hargaPerJam);
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)



}