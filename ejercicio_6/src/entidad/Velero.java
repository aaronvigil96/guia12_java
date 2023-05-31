package entidad;

public class Velero extends Barco{
    //Atributos
    private int mastiles;

    //Constructores
    public Velero() {
    }
    public Velero(int mastiles, long matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    //Métodos
    public int getMastiles() {
        return mastiles;
    }
    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public double modulo() {
        return (this.eslora * 10) + getMastiles();
    }
}
