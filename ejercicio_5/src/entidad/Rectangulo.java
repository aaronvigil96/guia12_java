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

public class Rectangulo implements calculosFormas{
    private int base;
    private int altura;

    public Rectangulo() {
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        System.out.println("Rectangulo...");
        System.out.println("El area es: " + (this.base * this.altura));
        System.out.println("El perimetro es: " + ((this.base + altura) * 2));
    }
}
