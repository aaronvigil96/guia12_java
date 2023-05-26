package entidad;

public class Lavadora extends Electrodomestico{
    protected int carga;

    public Lavadora(int carga, String color, char consumoEnergetico, int peso) {
        crearLavadora(carga, color, consumoEnergetico, peso);
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
        return "Lavadora: " + this.color + " " + this.consumoEnergetico + " " + this.peso + " " + this.precio + " " + this.carga;
    }
}
