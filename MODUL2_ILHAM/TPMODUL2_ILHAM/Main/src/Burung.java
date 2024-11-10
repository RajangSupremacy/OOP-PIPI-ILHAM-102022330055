public class Burung extends Hewan {
    private final String warnaBulu;

    public Burung(String warnaBulu, String nama, int umur) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }


@Override
    public void suara(){
        System.out.println(nama + " burungnya sudah bernyanyi CICITCUIT~~~~");
    }
@Override
    public void infoHewan(){
        super.infoHewan();
        System.out.println("Warna bulunya " + warnaBulu);
    }
}

