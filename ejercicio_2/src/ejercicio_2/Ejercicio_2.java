package ejercicio_2;

import entidad.Hombre;
import entidad.Mujer;
import entidad.Persona;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Persona hombre = new Hombre();
        Persona mujer = new Mujer();
        hombre.caminar();
        hombre.gritar();
        mujer.caminar();
        mujer.gritar();
    }
    
}
