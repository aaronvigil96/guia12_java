package entidad;

public class EdificioDeOficinas extends Edificio{
    private int cantidadOficinas;
    private int personasPorOficina;
    private int cantidadPisos;

    public EdificioDeOficinas() {
    }
    public EdificioDeOficinas(int cantidadOficinas, int personasPorOficina, int cantidadPisos, float ancho, float largo, float alto) {
        this.cantidadOficinas = cantidadOficinas;
        this.personasPorOficina = personasPorOficina;
        this.cantidadPisos = cantidadPisos;
    }

    public int getCantidadOficinas() {
        return cantidadOficinas;
    }
    public void setCantidadOficinas(int cantidadOficinas) {
        this.cantidadOficinas = cantidadOficinas;
    }
    public int getPersonasPorOficina() {
        return personasPorOficina;
    }
    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }
    public int getCantidadPisos() {
        return cantidadPisos;
    }
    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
    public void cantidadDePersonas(){
        System.out.println("La cantidad de personas que entran en el edificio son: " + this.personasPorOficina * this.cantidadOficinas * this.cantidadPisos);
        System.out.println("La cantidad de personas que entran por oficina son: " + this.personasPorOficina);
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
        return "EdificioDeOficinas{" + "cantidadOficinas=" + cantidadOficinas + ", personasPorOficina=" + personasPorOficina + ", cantidadPisos=" + cantidadPisos + '}';
    }
    
}
