package entidad;

public abstract class Edificio {
    protected int altura;
    protected int largo;
    protected int ancho;

    public Edificio() {
    }
    public Edificio(int altura, int largo, int ancho) {
        this.altura = altura;
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public abstract int calcularVolumen();
    public abstract int calcularSuperficie();
}
