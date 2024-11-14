class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(boolean ruangPrivat, float hargaPerJam, int jumlahKomputer, String namaWarnet) {
        super(hargaPerJam, jumlahKomputer, namaWarnet);
        this.ruangPrivat = ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
@Override
    public void informasi(){
        super.informasi();
        System.out.println("Jumlah komputer : " + jumlahKomputer);
        System.out.println("Nama warnet : " + namaWarnet);
        System.out.println("Harga : " + hargaPerJam);
        
        if (ruangPrivat){
            System.out.println("Ruangan premium");
            System.out.println("Benefit premium : ");
            System.out.println("- Ada AC");
            System.out.println("- Sofa gaming");
            System.out.println("- Komputer spek tinggi");
            System.out.println("- Interner gacor");
        }
        else {
            System.out.println("BAYAR LE");
        }
    }
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
        System.out.println("mesen komputer : " + nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("mesen makan : " + makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("mesen makan sama minum : " + makanan + ", " + minuman);
    }

    
}
