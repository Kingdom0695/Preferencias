package gatodedany.example.omen.preferencias;

public class Preferencias {

    private String nombre;
    private String password;

    public Preferencias(){
        nombre = null;
        password = null;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getPassword() {return password; }
    public void setPassword(String password) {this.password = password;}
}
