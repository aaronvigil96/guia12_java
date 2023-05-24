package ejercicio_3;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;

public class Ejercicio_3 {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Hannah","Comida balanceada", 7, "Callejero"));
        animales.add(new Caballo("Manto Negro", "Avena", 5, "Bayo"));
        animales.add(new Gato("Griselda", "cualquier cosa", 5, "Callejero"));
        
        for (Animal animal : animales) {
            System.out.println(animal.getNombre());
            animal.mostrarAlimentacion();
            System.out.println("----");
        }
    }
    
}
