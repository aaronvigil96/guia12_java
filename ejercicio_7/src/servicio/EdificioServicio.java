package servicio;

import entidad.EdificioDeOficinas;
import java.util.Scanner;
import entidad.Polideportivo;
import enumeracion.InstalacionEnumeracion;

public class EdificioServicio {
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public Polideportivo crearPolideportivo(){
        int opcion = 0;
        Polideportivo edificio = new Polideportivo();
        System.out.println("Creando Polideportivo...");
        edificio.setAltura((int) Math.round((Math.random() + 1) * 4));
        edificio.setAncho((int) Math.round((Math.random() + 1) * 4));
        edificio.setLargo((int) Math.round((Math.random() + 1) * 4));
        System.out.println("Ingresá el nombre");
        edificio.setNombre(entrada.next());
        do{
            System.out.println("¿Que tipo de instalación tiene?");
            System.out.println("1)- Techado");
            System.out.println("2)- Abierto");
            opcion = entrada.nextInt();
        }while(opcion != 1 && opcion != 2);
        edificio.setInstalacion(InstalacionEnumeracion.values()[opcion - 1]);
        return edificio;
    }
    
    public EdificioDeOficinas crearEdificioDeOficinas() {
        EdificioDeOficinas edificio = new EdificioDeOficinas();
        System.out.println("Creando Edificio de Oficinas");
        edificio.setAltura((int) Math.round((Math.random() + 1) * 4));
        edificio.setAncho((int) Math.round((Math.random() + 1) * 4));
        edificio.setLargo((int) Math.round((Math.random() + 1) * 4));
        System.out.println("¿Cantidad de oficinas?");
        edificio.setCantidadOficinas(entrada.nextInt());
        System.out.println("¿Cantidad de pisos?");
        edificio.setCantidadPisos(entrada.nextInt());
        System.out.println("¿Cantidad de personas por oficina?");
        edificio.setPersonasPorOficina(entrada.nextInt());
        return edificio;
    }
}
