public class pengguna{
    private int id;
    private String username;
    private String password;

    //method construktor
    public pengguna(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    //getter dan setter id, ussername, password
    public int getid(){
        return this.id;
    }
        
    public String getusername(){
        return this.username;
    }

    public String getpassword(){
        return this.password;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
    //method pengguna
    public void login(){
        System.out.println("Ini method untuk Login");
        }
        
    public void lupaPassword(){
        System.out.println("Ini method Lupa Password");
        }
        
    public void daftar(){
        System.out.println("Ini method Daftar user baru");
        }
    /// overloading
    public void hapus(){
        System.out.println("DELETE FROM pengguna");
        }
    public void hapus(int id){
        System.out.println("DELETE FROM pengguna WHERE id=" + id);
        }
    public void hapus(String username) {
        System.out.println("DELETE FROM pengguna WHERE username=" + username);
        }
    public void login(String tokenGoogle) {
        System.out.println("Ini Login menggunakan Google");
        }
}