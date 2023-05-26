package ejercicio_4;

import entidad.Electrodomestico;
import entidad.Lavadora;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String color;
        char consumoEnergetico;
        int peso, carga;
        
        System.out.println("Ingresá el color");
        color = entrada.next();
        System.out.println("Ingresá el consumo energetico");
        consumoEnergetico = entrada.next().charAt(0);
        System.out.println("Ingresá el peso");
        peso = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresá la carga");
        carga = entrada.nextInt();
        entrada.nextLine();
        
        Electrodomestico lavadora = new Lavadora(carga, color, consumoEnergetico, peso);
        System.out.println(lavadora);
        
    }
}
