package paquete2;

public class Persona {
    public String nombre;
    public String apellido;
    public String username;
    public Persona() {
    }
    public Persona(String nombre, String apellido, String username) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getUsername() {
        return username;
    }

    public String toString(){
        String msj = String.format("""
                                   
                                    Nombres: %s 
                                    Apellidos: %s 
                                    Username: %s
                                   """
                ,this.getNombre()
                ,this.getApellido()
                ,this.getUsername());
        return msj;
    }
}
