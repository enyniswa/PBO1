public class buku {
    //atribut
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private double harga;

    // Constructor
    public buku(int id, String judul, String penulis, int jumlah_halaman, double harga) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah_halaman = jumlah_halaman;
        this.harga = harga;
    }
    // getter setter buku
    public int getid(){
        return this.id;
    }
        
    public String getjudul(){
        return this.judul;
    }

    public String getpenulis(){
        return this.penulis;
    }

    public int getjumlah_halaman(){
        return this.jumlah_halaman;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void judul(String judul){
        this.judul = judul;
    }

    public void setpenulis(String penulis){
        this.penulis = penulis;
    }

    public void setjumlah_halaman (int jumlah_halaman){
        this.jumlah_halaman = jumlah_halaman;
    }

    public void setharga (double harga){
        this.harga = harga;
    }

    // methods
    public void tampilanBuku() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Jumlah Halaman: " + jumlah_halaman);
        System.out.println("Harga: " + harga);
    }

   // Method naikkan harga
    public void naikkanHarga() {
        harga += harga * 0.1; // increase by 10%
    }

   // Overload naikkanHarga dengan parameter kenaikan double 
    public void naikkanHarga(double kenaikan) {
        harga += harga * kenaikan / 100; // increase by kenaikan percentage
    }
    
}
