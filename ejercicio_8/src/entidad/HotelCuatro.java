package entidad;

import enumeracion.GimnasioEnum;
import interfaz.HotelInterfaz;

public class HotelCuatro extends Hotel implements HotelInterfaz{
    protected GimnasioEnum gimnasio;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    public HotelCuatro() {
    }

    public void setGimnasio(GimnasioEnum gimnasio) {
        this.gimnasio = gimnasio;
    }
    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }
    public void setCapacidadRestaurant(int capacidadRestaunrat) {
        this.capacidadRestaurant = capacidadRestaunrat;
    }

    @Override
    public String toString() {
        return "HotelCuatro{" + "nombre: " + this.nombre + ", direccion: " + this.direccion + ", localidad: " + this.localidad + ", gerente: " + this.gerente + ", cantidad habitaciones: " + this.cantidadHabitacion + ", cantidad de camas: " + this.cantidadCama + ", cantidad de pisos: " + this.cantidadPiso + ", precio habitacion: " + this.precioHabitacion + ", gimansio tipo: " + this.gimnasio + ", nombre del restaurant: " + this.nombreRestaurant + ", capacidad del restaurant: " + this.capacidadRestaurant +'}';
    }

    @Override
    public int calcularPrecio() {
        int precio = this.precioHabitacion + (1 * this.cantidadHabitacion);
        if(this.capacidadRestaurant < 30){
            precio = precio + 10;
        }else if(this.capacidadRestaurant >= 30 && this.capacidadRestaurant <= 50){
            precio = precio + 30;
        }else if(this.capacidadRestaurant > 50){
            precio = precio + 50;
        }
        if(GimnasioEnum.A == this.gimnasio){
            precio = precio + 50;
        }else if(GimnasioEnum.B == this.gimnasio){
            precio = precio + 30;
        }
        return precio;
    }
}
