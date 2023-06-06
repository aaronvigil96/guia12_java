package servicio;

import entidad.HotelCinco;
import entidad.HotelCuatro;
import enumeracion.GimnasioEnum;
import java.util.Scanner;

public class HotelServicio {
    
    Scanner entrada = new Scanner(System.in);
    String[] nombres = {"La posta", "El rejunte", "El Buen Pollo", "Pimienta", "Asadazo"};
    String[] direcciones = {"Paso N°120", "Las Heras N°666", "Ferrari N°120", "La Espadaña N°180", "Dota N°530"};
    String[] localidades = {"Brandsen", "Alejandro Korn", "San Vicente", "La Plata", "Constitución"};
    String[] gerentes = {"Pablo", "Malcom", "Aaron", "Cloe", "Milagros"};
    
    public HotelCuatro crearHotelCuatro(){
        HotelCuatro hotel = new HotelCuatro();
        hotel.setDireccion(direcciones[(int) Math.round(Math.random() * 4)]);
        hotel.setNombre(nombres[(int) Math.round(Math.random() * 4)]);
        hotel.setLocalidad(localidades[(int) Math.round(Math.random() * 4)]);
        hotel.setGerente(gerentes[(int) Math.round(Math.random() * 4)]);
        hotel.setCantidadHabitacion((int) Math.round(Math.random() * 4));
        hotel.setCantidadCama((int) Math.round(Math.random() * 4));
        hotel.setCantidadPiso((int) Math.round(Math.random() * 8));
        hotel.setGimnasio(GimnasioEnum.values()[(int)Math.round(Math.random() * 1)]);
        hotel.setNombreRestaurant("La posta");
        hotel.setCapacidadRestaurant((int) Math.round(Math.random() * 10));
        return hotel;
    }
    
    public HotelCinco crearHotelCinco(){
        HotelCinco hotel = new HotelCinco();
        hotel.setDireccion(direcciones[(int) Math.round(Math.random() * 4)]);
        hotel.setNombre(nombres[(int) Math.round(Math.random() * 4)]);
        hotel.setLocalidad(localidades[(int) Math.round(Math.random() * 4)]);
        hotel.setGerente(gerentes[(int) Math.round(Math.random() * 4)]);
        hotel.setCantidadHabitacion((int) Math.round(Math.random() * 4));
        hotel.setCantidadCama((int) Math.round(Math.random() * 4));
        hotel.setCantidadPiso((int) Math.round(Math.random() * 8));
        hotel.setGimnasio(GimnasioEnum.values()[(int)Math.round(Math.random() * 1)]);
        hotel.setNombreRestaurant("La posta");
        hotel.setCapacidadRestaurant((int) Math.round(Math.random() * 10));
        hotel.setCantidadSalon((int) Math.round(Math.random() * 4));
        hotel.setCantidadSuit((int) Math.round(Math.random() * 4));
        hotel.setCantidadLimusina((int) Math.round(Math.random() * 4));
        return hotel;
    }
}
