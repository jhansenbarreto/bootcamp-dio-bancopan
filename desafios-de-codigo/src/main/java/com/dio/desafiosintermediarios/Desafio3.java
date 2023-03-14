package com.dio.desafiosintermediarios;

import java.util.Scanner;

/**
 *
 * @author Jhansen Barreto
 */
public class Desafio3 {

    /**
     * DESAFIO - Triângulo:
     *
     * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um
     * triângulo. Em caso positivo, calcule o perímetro do triângulo (soma de
     * todos os lados) e apresente a mensagem:
     *
     * Perimetro = XX.X
     *
     * Em caso negativo, calcule a área do trapézio que tem A e B como base e C
     * como altura, mostrando a mensagem:
     *
     * Area = XX.X
     *
     * Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2
     *
     * ENTRADA:
     *
     * A entrada contém três valores reais.
     *
     * SAÍDA:
     *
     * O resultado deve ser apresentado com uma casa decimal.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        if ((A < (B + C)) && (B < (A + C)) && (C < (A + B))) {
            System.out.println("Perimetro = " + String.format("%.1f", (A + B + C)));
        } else {
            System.out.println("Area = " + String.format("%.1f", (((A + B) * C) / 2)));
        }
    }
}
