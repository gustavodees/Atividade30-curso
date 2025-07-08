package principal;


import model.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura do retangulo:");
        retangulo.setAltura(input.nextDouble());
        System.out.println("Digite a largura do retangulo:");
        retangulo.setLargura(input.nextDouble());

        System.out.println("AREA = " + retangulo.getArea() + "\n" +
                            "PERIMETER = " + retangulo.getPerimetro() + "\n"
                            +"DIAGONAL = " + retangulo.getDiagonal());


    }
}