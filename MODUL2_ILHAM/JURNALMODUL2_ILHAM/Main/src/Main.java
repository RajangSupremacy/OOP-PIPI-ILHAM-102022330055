public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer Komputer = new Komputer(5000, 20, "Warnet GamingX");
        System.out.println();
        // To do: Panggillah Method Informasi dari class Komputer
        Komputer.informasi();
        System.out.println("INFORMASI KOMPUTER");


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(false, 3000, 20, "Warnet GamingX");

        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.informasi();
        System.out.println("");
        // To do: Panggillah Method Login
        komputerVIP.Login("Asep");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputerVIP.Bermain(5);
        komputerVIP.Bermain(5, 25);
        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium 
        // To do: Panggillah Method Informasi dari class KomputerPremium

        // To do: Panggillah Method Pesan

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       
    }
}