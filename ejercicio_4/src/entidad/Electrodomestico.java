package entidad;

public abstract class Electrodomestico {
    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico(){
        
    }
    public Electrodomestico(String color, char consumoEnergetico, int peso){
        crearElectrodomestico(color, consumoEnergetico, peso);
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void comprobarColor(String color){
        color = color.toLowerCase();
        String[] colores = {"blanco","negro","azul","rojo","gris"};
        boolean bandera = false;
        for (int i = 0; i < colores.length - 1; i++) {
            if(colores[i].equals(color)){
                this.color = color;
                bandera = true;
                break;
            }
        }
        if(!bandera){
            this.color = colores[0];
        }
    }
    
    public void comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        char[] letras = {'A','B','C','D','E','F'};
        boolean bandera = false;
        for (int i = 0; i < letras.length - 1; i++) {
            if(letras[i] == letra){
                this.consumoEnergetico = letra;
                bandera = true;
                break;
            }
        }
        if(!bandera){
            this.consumoEnergetico = letras[5];
        }
    }
    
    public void crearElectrodomestico(String color, char letra, int peso){
        this.precio = 1000;
        comprobarColor(color);
        comprobarConsumoEnergetico(letra);
        this.peso = peso;
    }
    
    public void precioFinal(){
        switch(this.consumoEnergetico){
            case 'A':{
                setPrecio(getPrecio() + 1000);
                break;
            }
            case 'B': {
                setPrecio(getPrecio() + 800);
                break;
            }
            case 'C': {
                setPrecio(getPrecio() + 600);
                break;
            }
            case 'D': {
                setPrecio(getPrecio() + 500);
                break;
            }
            case 'E': {
                setPrecio(getPrecio() + 300);
                break;
            }
            case 'F': {
                setPrecio(getPrecio() + 100);
                break;
            }
        }
        if(this.peso > 0 && this.peso < 20){
            setPrecio(getPrecio() + 100);
        }else if(this.peso > 19 && this.peso < 50){
            setPrecio(getPrecio() + 500);
        }else if(this.peso > 49 && this.peso < 80){
            setPrecio(getPrecio() + 800);
        }else if(this.peso > 79){
            setPrecio(getPrecio() + 1000);
        }
    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
}
