package Calculadora_IMC;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora_IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double talla, peso;
        System.out.println("\t\tCALCULADORA DE IMC");
        System.out.print("\nIngrese su talla en (cm): ");
        talla = sc.nextDouble();
        System.out.print("Ingrese su peso (kg): ");
        peso = sc.nextDouble();
        double imc = (talla/peso*peso);
        System.out.println("\nSu IMC es: " +df.format(imc));

    }
}
