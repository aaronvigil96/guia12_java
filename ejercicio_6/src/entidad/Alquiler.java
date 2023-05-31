package entidad;

import java.time.LocalDate;

public class Alquiler {
    //Atributos
    private String nombre;
    private long documento;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private int posicionAmarre;
    private Barco barco;

    //Constructores
    public Alquiler() {
    }
    public Alquiler(String nombre, long documento, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getDocumento() {
        return documento;
    }
    public void setDocumento(long documento) {
        this.documento = documento;
    }
    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }
    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }
    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }
    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }
    public int getPosicionAmarre() {
        return posicionAmarre;
    }
    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }
    public Barco getBarco() {
        return barco;
    }
    public void setBarco(Barco barco) {
        this.barco = barco;
    }
}
