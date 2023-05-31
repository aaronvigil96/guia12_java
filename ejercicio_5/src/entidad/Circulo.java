/*
    Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
    geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
    dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
    dos métodos para calcular el área, el perímetro y el valor de PI como constante.
    Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
    calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
    resultado final.
    Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
*/

package entidad;

import interfaz.calculosFormas;

public class Circulo implements calculosFormas{
    private int radio;
    private int diametro;

    public Circulo() {
    }

    public Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    
    @Override
    public void area() {
        System.out.println("Circulo...");
        System.out.println("El area es: " + (PI * (this.radio * this.radio)));
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro es: " + (PI * this.diametro));
    }
}
