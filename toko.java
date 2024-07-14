public class toko {
    private String namaToko;
    private String alamat;
    private String nomorTelepon;
    private double totalPendapatan;
    private int jumlahBarang;
    
    // Constructor
    public toko(String namaToko, String alamat, String nomorTelepon) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.totalPendapatan = 0;
        this.jumlahBarang = 0;
    }
    // Getter methods
    public String getNamaToko() {
        return namaToko;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public double getTotalPendapatan() {
        return totalPendapatan;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }
    // Setter methods
    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void setTotalPendapatan(double totalPendapatan) {
        this.totalPendapatan = totalPendapatan;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    // Method untuk tampilan informasi toko
    public void tampilanInfo() {
        System.out.println("Nama Toko: " + namaToko);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Total Pendapatan: " + totalPendapatan);
        System.out.println("Jumlah Barang: " + jumlahBarang);
    } 
    // Method untuk tambah pejualan
    public void tambahPenjualan(double harga) {
        totalPendapatan += harga;
        jumlahBarang++;
    }

    // Overloaded method untuk tambah penjualan dengan kuantitas
    public void tambahPenjualan(double harga, int kuantitas) {
        totalPendapatan += harga * kuantitas;
        jumlahBarang += kuantitas;
    }
}
