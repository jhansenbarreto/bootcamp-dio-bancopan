package com.dio.desafiosbasicos;

import java.util.Scanner;

/**
 *
 * @author Jhansen Barreto
 */
public class Desafio2 {

    /**
     * DESAFIO - Imprimindo Positivos e Média:
     *
     * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram
     * positivos. Na próxima linha, deve-se mostrar a média de todos os valores
     * positivos digitados, com um dígito após o ponto decimal.
     *
     * ENTRADA:
     *
     * A entrada contém 6 números que podem ser valores inteiros ( int ) ou de
     * ponto flutuante ( float ou double ). Pelo menos um destes números será
     * positivo.
     *
     * SAÍDA:
     *
     * O primeiro valor de saída é a quantidade de valores positivos. A próxima
     * linha deve mostrar a média dos valores positivos digitados.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double media = 0;
        double x;
        double totalPositivos = 0;

        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if (x >= 0) {
                cont++;
                totalPositivos += x;
            }
        }

        media = (totalPositivos / cont);

        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
