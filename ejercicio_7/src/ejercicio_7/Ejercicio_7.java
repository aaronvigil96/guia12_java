package ejercicio_7;

import entidad.Edificio;
import entidad.EdificioDeOficinas;
import entidad.Polideportivo;
import enumeracion.InstalacionEnumeracion;
import java.util.ArrayList;
import java.util.Iterator;
import servicio.EdificioServicio;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int vueltas = 0;
        int techado = 0;
        int abierto = 0;
        EdificioServicio es = new EdificioServicio();
        ArrayList<Edificio> edificios = new ArrayList<>();
        while(vueltas < 1){
            edificios.add(es.crearPolideportivo());
            edificios.add(es.crearEdificioDeOficinas());
            vueltas++;
        }
        Iterator<Edificio> it = edificios.iterator();
        while(it.hasNext()){
            Edificio actual = it.next();
            System.out.println(actual + " superficie: " + actual.calcularSuperficie() + " metros, volumen: " + actual.calcularVolumen() + " metros");
            if(actual instanceof Polideportivo){
                if(((Polideportivo) actual).getInstalacion() == InstalacionEnumeracion.ABIERTO) {
                    abierto++;
                }else {
                    techado++;
                }
            }
            if(actual instanceof EdificioDeOficinas){
                ((EdificioDeOficinas) actual).cantidadDePersonas();
            }
        }
        System.out.println("La cantidad de polideportivos techados es: " + techado);
        System.out.println("La cantidad de polideportivos abiertos es: " + abierto);
    }
}
