public class komik extends buku { //inhertens atau suclass komik dari superclass buku
    private int volume;

   // Constructor
    public komik(int id, String judul, String penulis, int jumlah_halaman, double harga, int volume) {
        super(id, judul, penulis, jumlah_halaman, harga);
        this.volume = volume;
    }

    // Getter method volume
    public int getVolume() {
        return volume;
    }

    // Override dari method naikkanHarga 
    public void naikkanHarga() {
        volume += volume * 0.1; // increase by 10%
    }

}
