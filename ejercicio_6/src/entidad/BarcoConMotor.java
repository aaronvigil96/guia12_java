package entidad;

public class BarcoConMotor extends Barco{
    //Atributos
    protected int caballosDeFuerza;

    //Constructores
    public BarcoConMotor() {
    }
    public BarcoConMotor(int caballosDeFuerza, long matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.caballosDeFuerza = caballosDeFuerza;
    }
    
    //Métodos
    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }
    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }
    
    @Override
    public double modulo() {
        return (this.eslora * 10) + getCaballosDeFuerza();
    }
}
