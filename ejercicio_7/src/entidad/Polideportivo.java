package entidad;

import enumeracion.InstalacionEnumeracion;

public class Polideportivo extends Edificio{
    protected String nombre;
    protected InstalacionEnumeracion instalacion;

    public Polideportivo() {
        super();
    }
    public Polideportivo(String nombre, InstalacionEnumeracion instalacion, float ancho, float largo, float alto) {
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public InstalacionEnumeracion getInstalacion() {
        return instalacion;
    }
    public void setInstalacion(InstalacionEnumeracion instalacion) {
        this.instalacion = instalacion;
    }

    @Override
    public int calcularVolumen() {
        return this.altura * this.ancho * this.largo;
    }
    @Override
    public int calcularSuperficie() {
        return this.largo * this.ancho;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", instalacion=" + instalacion +'}';
    }
    
}
