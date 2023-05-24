package entidad;

public class Hombre extends Persona{
    protected String sexo = "Hombre";

    public Hombre() {
    }
    
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public void caminar(){
        System.out.println("Caminando...");
    }

    @Override
    public void gritar() {
        System.out.println("SOY UN HOMBREEE");
    }
}
