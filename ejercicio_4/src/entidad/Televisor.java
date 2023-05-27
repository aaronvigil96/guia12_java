package entidad;

public class Televisor extends Electrodomestico{
    
    //Atributos
    protected float pulgadas;
    protected boolean sintonizador;
    
    //Constructores
    public Televisor() {
    }

    public Televisor(float pulgadas, boolean sintonizador, String color, char consumoEnergetico, int peso) {
        crearTelevisor(pulgadas, sintonizador, color, consumoEnergetico, peso);
        
    }
    
    //Métodos
    public float getPulgadas() {
        return pulgadas;
    }
    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }
    public boolean isSintonizador() {
        return sintonizador;
    }
    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    public void crearTelevisor(float pulgadas, boolean sintonizador, String color, char consumoEnergetico, int peso){
        crearElectrodomestico(color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
        precioFinal();
    }
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.pulgadas > 40 && this.sintonizador == true){
            setPrecio((getPrecio() + (getPrecio() * 30) / 100) + 500);
        }else if(this.pulgadas > 40){
            setPrecio(getPrecio() + (getPrecio() * 30) / 100);
        }else if(this.sintonizador == true){
            setPrecio(getPrecio() + 500);
        }
    }

    @Override
    public String toString() {
        return "Televisor: " + this.color + " " + this.consumoEnergetico + " " + this.peso + " " + this.pulgadas + " " + this.sintonizador + " precion final: " + this.precio;
    }
    
}
