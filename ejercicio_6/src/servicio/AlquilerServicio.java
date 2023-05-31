package servicio;

import entidad.Alquiler;
import entidad.Barco;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

import java.util.Scanner;

public class AlquilerServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Alquiler crearAlquiler(Barco barco){
        Alquiler alquiler = new Alquiler();
        LocalDate fechaAlquiler;
        LocalDate fechaDevolucion;
        System.out.println("creando alquiler...");
        System.out.println("Ingresá el nombre");
        alquiler.setNombre(entrada.next());
        System.out.println("Ingresá el documento");
        alquiler.setDocumento(entrada.nextLong());
        entrada.nextLine();
        System.out.println("Ingresá la fecha de alquiler. YYYY/MM/DD");
        fechaAlquiler = LocalDate.parse(entrada.next());
        alquiler.setFechaDeAlquiler(fechaAlquiler);
        System.out.println("Ingresá la fecha de devolución. YYYY/MM/DD");
        fechaDevolucion = LocalDate.parse(entrada.next());
        alquiler.setFechaDeDevolucion(fechaDevolucion);
        System.out.println("Ingresá la posición del amarre");
        alquiler.setPosicionAmarre(entrada.nextInt());
        entrada.nextLine();
        alquiler.setBarco(barco);
        System.out.println("El alquiler del barco cuesta " + (DAYS.between(fechaAlquiler, fechaDevolucion) * barco.modulo()));
        return alquiler;
    }
}
