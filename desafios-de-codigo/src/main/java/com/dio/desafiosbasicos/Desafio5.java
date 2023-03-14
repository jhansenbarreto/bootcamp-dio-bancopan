package com.dio.desafiosbasicos;

import java.util.Scanner;

/**
 *
 * @author Jhansen Barreto
 */
public class Desafio5 {

    /**
     * DESAFIO - Fibonacci Fácil:
     *
     * A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como
     * série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros,
     * é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro
     * N (N < 46) e mostre os N primeiros números dessa série.
     *
     * ENTRADA:
     *
     * O arquivo de entrada contém um valor inteiro N (0 < N < 46).
     *
     * SAÍDA:
     *
     * Os valores devem ser mostrados na mesma linha, separados por um espaço em
     * branco. Não deve haver espaço após o último valor.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int anterior = 0, atual = 1;

        if (N > 0) {
            System.out.print(anterior);

            if (N > 1) {
                System.out.print(" " + atual);

                for (int i = 2; i < N; i++) {
                    atual = atual + anterior;
                    anterior = atual - anterior;

                    System.out.print(" " + atual);
                }
            }
        }
    }
}
