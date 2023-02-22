package com.dio.desafiosbasicos;

import java.util.Scanner;

/**
 *
 * @author Jhansen Barreto
 */
public class Desafio3 {

    /**
     * DESAFIO - Soma de H com N Termos:
     *
     * Neste desafio, faça um programa que calcule o valor de H com N termos.
     *
     * Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
     *
     * ENTRADA:
     *
     * A entrada consiste em um número inteiro positivo.
     *
     * SAÍDA:
     *
     * Na saída será impresso o valor que representa a soma dos termos.
     *
     * @param args
     */
    public static void main(String[] args) {

        double h = 0;

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h += (1d / i);
        }

        System.out.println(Math.round(h));
    }
}
