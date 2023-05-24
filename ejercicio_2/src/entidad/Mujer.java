package entidad;

public class Mujer extends Persona{
    protected String sexo = "Mujer";

    public Mujer() {
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void gritar() {
        System.out.println("SOY UNA MUJEEEEEEEER");
    }

    @Override
    public void caminar() {
        System.out.println("Estoy caminando por el parque");
    }
    
}
