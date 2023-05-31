package entidad;

import interfaz.calcularModulo;

public class Barco implements calcularModulo{
    //Atributos
    protected long matricula;
    protected double eslora;
    protected int anio;
    
    //Constructores
    public Barco() {
    }
    public Barco(long matricula, double eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }
    
    //Métodos
    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public double getEslora() {
        return eslora;
    }
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        if(anio > 1800 && anio <= 2023){
            this.anio = anio;
        }
    }

    @Override
    public double modulo() {
        return this.eslora * 10;
    }
}
