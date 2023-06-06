package entidad;

public abstract class Hotel extends Alojamiento{
    protected int cantidadHabitacion;
    protected int cantidadCama;
    protected int cantidadPiso;
    protected int precioHabitacion = 50;

    public Hotel() {
    }

    public void setCantidadHabitacion(int cantidadHabitacion) {
        this.cantidadHabitacion = cantidadHabitacion;
    }
    public void setCantidadCama(int cantidadCama) {
        this.cantidadCama = cantidadCama;
    }
    public void setCantidadPiso(int cantidadPiso) {
        this.cantidadPiso = cantidadPiso;
    }
}
