public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Anggora", "Joko", 3);
        kucing.infoHewan();
        kucing.suara();
        kucing.makan();
        kucing.makan("Whiskas");
        System.out.println();

        Burung burung = new Burung("Ungu", "Nadya", 2);
        burung.infoHewan();
        burung.suara();
        burung.makan();
        burung.makan("Kuaci");
        System.out.println();
    }
}
