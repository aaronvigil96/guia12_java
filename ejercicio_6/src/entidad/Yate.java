package entidad;

public class Yate extends BarcoConMotor {
    //Atributos
    private int camarotes;

    //Constructores
    public Yate() {
    }
    public Yate(int camarotes, int caballosDeFuerza, long matricula, double eslora, int anio) {
        super(caballosDeFuerza, matricula, eslora, anio);
        this.camarotes = camarotes;
    }

    //Métodos
    public int getCamarotes() {
        return camarotes;
    }
    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public double modulo() {
        return (this.eslora * 10) + getCamarotes() + getCaballosDeFuerza();
    }
}
