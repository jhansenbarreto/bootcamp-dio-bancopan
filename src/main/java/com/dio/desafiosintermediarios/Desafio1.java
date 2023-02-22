package com.dio.desafiosintermediarios;

import java.util.Scanner;

/**
 *
 * @author Jhansen Barreto
 */
public class Desafio1 {

    /**
     * DESAFIO - Animal:
     *
     * Neste problema, você deverá ler 3 palavras que definem o tipo de animal
     * possível segundo o esquema abaixo, da esquerda para a direita. Em seguida
     * conclua qual dos animais seguintes foi escolhido, através das três
     * palavras fornecidas.
     *
     * https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1049_b.png
     *
     * ENTRADA:
     *
     * A entrada contém 3 palavras, uma em cada linha, necessárias para
     * identificar o animal segundo a figura acima, com todas as letras
     * minúsculas.
     *
     * SAÍDA:
     *
     * Imprima o nome do animal correspondente à entrada fornecida.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine().toLowerCase();
        AN2 = sc.nextLine().toLowerCase();
        AN3 = sc.nextLine().toLowerCase();

        if (AN1.equals("vertebrado")) {

            if (AN2.equals("ave")) {

                if (AN3.equals("carnivoro")) {
                    System.out.println("aguia");

                } else if (AN3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (AN2.equals("mamifero")) {

                if (AN3.equals("onivoro")) {
                    System.out.println("homem");

                } else if (AN3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (AN1.equals("invertebrado")) {

            if (AN2.equals("inseto")) {

                if (AN3.equals("hematofago")) {
                    System.out.println("pulga");

                } else if (AN3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (AN2.equals("anelideo")) {

                if (AN3.equals("hematofago")) {
                    System.out.println("sanguessuga");

                } else if (AN3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
