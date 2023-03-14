package com.dio.desafiosintermediarios;

import java.util.HashMap;
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

        HashMap<String, String> animais = new HashMap<>();

        animais.put("vertebrado ave carnivoro", "aguia");
        animais.put("vertebrado ave onivoro", "pomba");

        animais.put("vertebrado mamifero onivoro", "homem");
        animais.put("vertebrado mamifero herbivoro", "vaca");

        animais.put("invertebrado inseto hematofago", "pulga");
        animais.put("invertebrado inseto herbivoro", "lagarta");

        animais.put("invertebrado anelideo hematofago", "sanguessuga");
        animais.put("invertebrado anelideo onivoro", "minhoca");

        System.out.println(animais.get(AN1 + " " + AN2 + " " + AN3));
    }
}
