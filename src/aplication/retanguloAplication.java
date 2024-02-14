package aplication;

import java.util.Scanner;
import entities.Retangulo;
public class retanguloAplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo valor = new Retangulo();
        System.out.println("Digite a altura e a largura");
        valor.altura = sc.nextDouble();
        valor.largura = sc.nextDouble();
        System.out.println("AREA: "+valor.area() );
        System.out.println("PERIMETRO: "+valor.perimetro() );
        System.out.println("DIAGONAL: "+valor.diagonal() );

        sc.close();
    }
}

