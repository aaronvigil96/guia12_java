package entidad;

public abstract class Persona implements PersonaAcciones{
    private String nombre;
    private String apellido;
    
    //Constructor
    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
