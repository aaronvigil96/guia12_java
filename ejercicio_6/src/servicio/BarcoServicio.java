package servicio;

import entidad.BarcoConMotor;
import entidad.Velero;
import entidad.Yate;
import java.util.Scanner;

public class BarcoServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Velero crearVelero(){
        Velero barco = new Velero();
        System.out.println("Creando Velero...");
        System.out.println("Ingresá la matricula");
        barco.setMatricula(entrada.nextLong());
        entrada.nextLine();
        System.out.println("Ingresá el eslora en metros");
        barco.setEslora(entrada.nextDouble());
        entrada.nextLine();
        System.out.println("Ingresá el año de fabricación");
        barco.setAnio(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Ingresá la cantidad de mástiles");
        barco.setMastiles(entrada.nextInt());
        return barco;
    }
    
    public BarcoConMotor crearBarcoConMotor(){
        BarcoConMotor barco = new BarcoConMotor();
        System.out.println("Creando Barco con motor...");
        System.out.println("Ingresá la matricula");
        barco.setMatricula(entrada.nextLong());
        entrada.nextLine();
        System.out.println("Ingresá el eslora en metros");
        barco.setEslora(entrada.nextDouble());
        entrada.nextLine();
        System.out.println("Ingresá el año de fabricación");
        barco.setAnio(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Ingresá los caballos de fuerza");
        barco.setCaballosDeFuerza(entrada.nextInt());
        entrada.nextLine();
        return barco;
    }
    
    public Yate crearYate(){
        Yate barco = new Yate();
        System.out.println("Creando Barco con motor...");
        System.out.println("Ingresá la matricula");
        barco.setMatricula(entrada.nextLong());
        entrada.nextLine();
        System.out.println("Ingresá el eslora en metros");
        barco.setEslora(entrada.nextDouble());
        entrada.nextLine();
        System.out.println("Ingresá el año de fabricación");
        barco.setAnio(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Ingresá los caballos de fuerza");
        barco.setCaballosDeFuerza(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Ingresá la cantidad de camarotes");
        barco.setCamarotes(entrada.nextInt());
        entrada.nextLine();
        return barco;
    }
}
