package entidad;

public class Gato extends Animal{
    public Gato(String nombre, String alimento, int edad, String raza){
        super(nombre, alimento, edad, raza);
    }
    @Override
    public void mostrarAlimentacion(){
        System.out.println("Se alimenta de " + this.alimento);
    }
}
