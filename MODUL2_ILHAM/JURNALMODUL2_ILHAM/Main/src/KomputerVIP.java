class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(boolean vipCard, float hargaPerJam, int jumlahKomputer, String namaWarnet) {
        super(hargaPerJam, jumlahKomputer, namaWarnet);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
@Override
    public void informasi(){
        super.informasi();
        System.out.println("Jumlah komputer : " + jumlahKomputer);
        System.out.println("Nama warnet : " + namaWarnet);
        System.out.println("Harga : " + hargaPerJam);
        if (vipCard){
            System.out.println("Status : Member VIP");
            System.out.println("Benefit member VIP : ");
            System.out.println("- Diskon 10% kalo main diatas 3 jam");
            System.out.println("- Gratis minum kalo main 4 jam");
            System.out.println("- jadi prioritas");
        }
        else {
            System.out.println("Bayar le");
        }

    }
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username){
        System.out.println("Login dengan username : " + username);
    }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam){
        System.out.println("Bermain selama " + jam);
    }

    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menit){
        System.out.println("Nambah billing selama " + jam + "jam " + menit + "menit" );
    }


}