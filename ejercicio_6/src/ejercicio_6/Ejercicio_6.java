package ejercicio_6;

import servicio.AlquilerServicio;
import servicio.BarcoServicio;
import java.util.Scanner;

public class Ejercicio_6 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AlquilerServicio as = new AlquilerServicio();
        BarcoServicio bs = new BarcoServicio();
        int opc;

        do {
            System.out.println("¿Que tipo de barco tenes?");
            System.out.println("1)- Velero");
            System.out.println("2)- Barco a motor");
            System.out.println("3)- Yate");
            System.out.println("0)- Salir");
            opc = entrada.nextInt();
            entrada.nextLine();
            switch (opc) {
                case 1: {
                    as.crearAlquiler(bs.crearVelero());
                    break;
                }
                case 2: {
                    as.crearAlquiler(bs.crearBarcoConMotor());
                    break;
                }
                case 3: {
                    as.crearAlquiler(bs.crearYate());
                    break;
                }
            }
        } while (opc != 0);
    }
}
