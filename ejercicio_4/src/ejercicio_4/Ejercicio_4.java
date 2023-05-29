package ejercicio_4;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int totalLavadora = 0, totalTelevisor = 0;
        int cantidadLavadora = 0, cantidadTelevisor = 0;
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Lavadora(10, "blanco", 'c', 500));
        electrodomesticos.add(new Televisor(41, true, "negro", 'a', 10));
        electrodomesticos.add(new Televisor(20, false, "azul", 'b', 20));
        electrodomesticos.add(new Lavadora(200, "negro", 'a', 10));
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico instanceof Lavadora){
                totalLavadora =+ electrodomestico.getPrecio();
                cantidadLavadora++;
            }else if(electrodomestico instanceof Televisor){
                totalTelevisor =+ electrodomestico.getPrecio();
                cantidadTelevisor++;
            }
        }
        System.out.println(cantidadLavadora + " lavadoras. Total: " + totalLavadora);
        System.out.println(cantidadTelevisor + " televisores. Total: " + totalTelevisor);
        System.out.println("total: $" + (totalLavadora + totalTelevisor));
    }
}
