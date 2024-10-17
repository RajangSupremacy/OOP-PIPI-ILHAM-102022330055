import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    ArrayList<Penumpang> daftarPenumpang = new ArrayList<>();
    ArrayList<Penerbangan> daftarPenerbanganDipesan = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pembelian pembelian = new Pembelian();
        pembelian.daftarPenerbangan.add(new Penerbangan("P0LUT", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        pembelian.daftarPenerbangan.add(new Penerbangan("J4W44", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        pembelian.Menu();
    }

    public void Menu() {
        System.out.println("EAD Ticket Booking System");
        System.out.println("1. Tampilkan Daftar Penerbangan");
        System.out.println("2. Beli Tiket");
        System.out.println("3. Tampilkan Pesanan Tiket");
        System.out.println("4. Exit");
        System.out.print("Silahkan pilih menu: ");
        String menuInput = scanner.nextLine();

        switch (menuInput) {
            case "1" -> DaftarPenerbangan();
            case "2" -> beliTiket();
            case "3" -> Pesanan();
            case "4" -> {
                System.out.println("Terima kasih!");
                System.exit(0);
            }
            default -> {
                System.out.println("Pilihan menu tidak valid.");
                Menu();
            }
        }
    }

    public void DaftarPenerbangan() {
        System.out.println("Daftar Penerbangan yang Tersedia:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ".");
            daftarPenerbangan.get(i).DaftarPenerbangan();
        }
        Menu();
    }

    public void beliTiket() {
        System.out.println("Silakan isi data diri anda terlebih dahulu");
        System.out.print("Masukkan NIK: ");
        String NIK = scanner.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = scanner.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = scanner.nextLine();

        System.out.println("Terima Kasih Telah Mengisi Data Pelanggan. Silakan Pilih Tiket Penerbangan Yang Tersedia:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPenerbangan.get(i).kodePenerbangan + " - Dari: " + daftarPenerbangan.get(i).asal + " ke " + daftarPenerbangan.get(i).tujuan);
        }

        System.out.print("Pilih nomor penerbangan (ex: 1): ");
        int pilihanIndex = Integer.parseInt(scanner.nextLine()) - 1;

        if (pilihanIndex >= 0 && pilihanIndex < daftarPenerbangan.size()) {
            Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
            daftarPenumpang.add(penumpang);

            Penerbangan penerbanganDipilih = daftarPenerbangan.get(pilihanIndex);
            daftarPenerbanganDipesan.add(penerbanganDipilih);

            System.out.println("Pemesanan Tiket Berhasil untuk Penerbangan " + penerbanganDipilih.kodePenerbangan);
            Menu();
        } else {
            System.out.println("Pilihan penerbangan tidak valid. Silakan coba lagi.");
            beliTiket();
        }
    }

    public void Pesanan() {
        if (daftarPenumpang.isEmpty()) {
            System.out.println("Belum ada tiket yang dipesan.");
        } else {
            for (int i = 0; i < daftarPenumpang.size(); i++) {
                System.out.println("Detail Pesanan Tiket " + (i + 1));
                daftarPenumpang.get(i).DaftarPenumpang();

                daftarPenerbanganDipesan.get(i).DaftarPenerbangan();
            }
        }
        Menu();
    }
}

class Penumpang {
    String NIK, namaDepan, namaBelakang;

    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void DaftarPenumpang() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama: " + namaDepan + " " + namaBelakang);
    }
}

class Penerbangan {
    String kodePenerbangan, asal, tujuan, waktuBerangkat, waktuTiba;
    int harga;

    public Penerbangan(String kodePenerbangan, String asal, String tujuan, String waktuBerangkat, String waktuTiba, int harga) {
        this.kodePenerbangan = kodePenerbangan;
        this.asal = asal;
        this.tujuan = tujuan;
        this.waktuBerangkat = waktuBerangkat;
        this.waktuTiba = waktuTiba;
        this.harga = harga;
    }

    public void DaftarPenerbangan() {
        System.out.println("Kode Penerbangan: " + kodePenerbangan);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Waktu Berangkat: " + waktuBerangkat);
        System.out.println("Waktu Tiba: " + waktuTiba);
        System.out.println("Harga: Rp " + harga);
    }
}
