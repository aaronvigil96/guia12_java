package entidad;

public class Lavadora extends Electrodomestico{
    //Atributos
    protected int carga;

    
    //Constructores
    public Lavadora() {
    }
    public Lavadora(int carga, String color, char consumoEnergetico, int peso) {
        crearLavadora(carga, color, consumoEnergetico, peso);
    }

    //Métodos
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public void crearLavadora(int carga, String color,char consumoEnergetico, int peso){
        crearElectrodomestico(color, consumoEnergetico, peso);
        this.carga = carga;
        precioFinal();
    }
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.carga > 30){
            setPrecio(getPrecio() + 500);
        }
        
    }
    @Override
    public String toString() {
        return "Lavadora: " + this.color + " " + this.consumoEnergetico + " " + this.peso + " " + this.carga + " precio final: " + this.precio;
    }
}
