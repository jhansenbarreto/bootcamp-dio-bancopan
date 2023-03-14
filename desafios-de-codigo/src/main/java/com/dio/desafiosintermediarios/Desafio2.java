package com.dio.desafiosintermediarios;

import java.util.Scanner;

/**
 *
 * @author Jhansen Barreto
 */
public class Desafio2 {

    /**
     * DESAFIO - Quitanda do Seu Zé:
     *
     * Seu Zé está vendendo frutas com a seguinte tabela de preços:
     *
     * Exemplo:
     *
     * Morango - Até 5 Kg: R$ 2,50 por Kg | Acima de 5 Kg: R$ 2,20 por Kg
     * Maçã - Até 5 Kg: R$ 1,80 por Kg | Acima de 5 Kg: R$ 1,50 por Kg
     *
     * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
     * ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
     * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a
     * quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo
     * cliente.
     *
     * ENTRADA:
     *
     * Como entrada, você recebera a quantidade em kg de morangos e a quantidade
     * em kg de maçãs.
     *
     * SAÍDA:
     *
     * Será o valor a ser pago pelo cliente, conforme a tabela de preços da
     * quintanda do seu Zé.
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int morangos = input.nextInt();
        int macas = input.nextInt();

        double valorMorangos = (morangos > 5 ? (morangos * 2.2) : (morangos * 2.5));
        double valorMacas = (macas > 5 ? (macas * 1.5) : (macas * 1.8));

        double total = (valorMorangos + valorMacas);

        if ((morangos + macas) > 8 || total > 25) {
            total = (total - (total * 0.1));
        }

        System.out.println(total);
    }
}
