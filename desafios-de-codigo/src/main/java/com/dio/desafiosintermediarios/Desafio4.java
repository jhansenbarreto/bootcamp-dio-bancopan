package com.dio.desafiosintermediarios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jhansen Barreto
 */
public class Desafio4 {

    /**
     * DESAFIO - Conta Espaços e Vogais:
     *
     * Jorginho é professor do primário de uma determinada escola. Ele tem
     * 100000 alunos e precisa criar um programa que verifica quantos espaços em
     * branco e quantas vogais existem em uma determinada string de entrada que
     * os alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa
     * antes que o tempo para entrega-la no fim do semestre acabe!
     *
     * ENTRADA:
     *
     * A entrada será uma frase no formato de string.
     *
     * SAÍDA:
     *
     * A saída deverá retornar quantos espaços em branco e quantas vogais
     * existem na determinada string, conforme exemplo abaixo:
     *
     * “Amo a DIO” -> Espacos em branco: 2 Vogais: 5
     * “Esse desafio foi facil” -> Espacos em branco: 3 Vogais: 10
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strSplit = str.split(" ");
        Character[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        var vogais = Arrays.asList(arrVogais);

        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {
            var letras = item.toCharArray();
            for (char x : letras) {
                if (vogais.contains(Character.toLowerCase(x))) {
                    quantVogais++;
                }
            }
        }

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
