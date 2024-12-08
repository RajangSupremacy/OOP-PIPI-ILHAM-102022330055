public class Album {
    private String namaAlbum;
    private String artis;
    private int total;
    private int available;
    private int rented;

    public Album(String namaAlbum, String artis, int total, int available, int rented) {
        this.namaAlbum = namaAlbum;
        this.artis = artis;
        this.total = total;
        this.available = available;
        this.rented = rented;
    }

    public String getNamaAlbum() {
        return namaAlbum;
    }

    public String getArtis() {
        return artis;
    }

    public int getTotal() {
        return total;
    }

    public int getAvailable() {
        return available;
    }

    public int getRented() {
        return rented;
    }

    public void setNamaAlbum(String namaAlbum) {
        this.namaAlbum = namaAlbum;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setRented(int rented) {
        this.rented = rented;
    }
}
