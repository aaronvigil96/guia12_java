package ejercicio_8;

import entidad.HotelCuatro;
import servicio.HotelServicio;

public class Ejercicio_8 {
    public static void main(String[] args) {
        HotelServicio hs = new HotelServicio();
        HotelCuatro hotel = hs.crearHotelCuatro();
        System.out.println(hotel);
        System.out.println(hotel.calcularPrecio());
    }
}
