package entidad;

public class Perro extends Animal{
    public Perro(String nombre, String alimento, int edad, String raza){
       super(nombre, alimento, edad, raza);
    }
    @Override
    public void mostrarAlimentacion(){
        System.out.println("Se alimenta de " + this.alimento);
    }
}