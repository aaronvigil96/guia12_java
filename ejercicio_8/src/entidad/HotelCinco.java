package entidad;

import enumeracion.GimnasioEnum;

public class HotelCinco extends HotelCuatro{
    private int cantidadSalon;
    private int cantidadSuit;
    private int cantidadLimusina;

    public HotelCinco() {
    }

    public void setCantidadSalon(int cantidadSalon) {
        this.cantidadSalon = cantidadSalon;
    }
    public void setCantidadSuit(int cantidadSuit) {
        this.cantidadSuit = cantidadSuit;
    }
    public void setCantidadLimusina(int cantidadLimusina) {
        this.cantidadLimusina = cantidadLimusina;
    }
    
    @Override
    public String toString() {
        return "HotelCinco{" + "nombre: " + this.nombre + ", direccion: " + this.direccion + ", localidad: " + this.localidad + ", gerente: " + this.gerente + ", cantidad habitaciones: " + this.cantidadHabitacion + ", cantidad de camas: " + this.cantidadCama + ", cantidad de pisos: " + this.cantidadPiso + ", precio habitacion: " + this.precioHabitacion + ", gimansio tipo: " + this.gimnasio + ", nombre del restaurant: " + this.nombreRestaurant + ", capacidad del restaurant: " + this.capacidadRestaurant + ", cantidad de salones: " + this.cantidadSalon + ", cantidad de suit: " + this.cantidadSuit + ", cantidad de limusinas: " + this.cantidadLimusina +'}';
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
        precio = precio + (15 * this.cantidadLimusina);
        return precio;
    }
}
