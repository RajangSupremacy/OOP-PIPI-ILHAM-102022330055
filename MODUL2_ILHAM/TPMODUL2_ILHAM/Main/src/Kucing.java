public class Kucing extends Hewan {
    private final String ras;

    public Kucing(String ras, String nama, int umur) {
        super(nama, umur);
        this.ras = ras;
    }
@Override
    public void suara(){
        System.out.println(nama + " mengeluarkan suara MEONGGG!! (ngamuk gitu meng nya)");
    }

@Override
    public void infoHewan(){
        super.infoHewan();
        System.out.println("Rasnya " + ras);
    }

}
    

