public class tamu extends pengguna {  //inhertance
    private int sisaMasaAktif;

    public void menambahMasaAktif(int tambahan){
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
    }

    //overriding
    public void hapus() {
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }
    public void login() {
        System.out.println("Login sebagai tamu");
    }
}
