package com.dio.desafiosintermediarios;

import java.util.Scanner;

/**
 *
 * @author Jhansen Barreto
 */
public class Desafio5 {

    /**
     * DESAFIO - Taxa de Imposto de Renda:
     *
     * Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar
     * seus impostos, pois sabem que nele não existem políticos corruptos e os
     * recursos arrecadados são utilizados em benefício da população, sem
     * qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.
     *
     * Você terá o desafio de ler um valor com duas casas decimais, equivalente
     * ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor
     * que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
     *
     * https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1051_pt.png
     *
     * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
     * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$
     * 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a
     * taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$
     * 80.36 no total. O valor deve ser impresso com duas casas decimais.
     *
     * ENTRADA:
     *
     * A entrada contém apenas um valor de ponto flutuante, com duas casas
     * decimais.
     *
     * SAÍDA:
     *
     * Imprima o texto "R$" seguido de um espaço e do valor total devido de
     * Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for
     * menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();

        double imposto = 0.0;
        double diferenca;

        if (renda > 4500) {
            imposto = ((1000 * 0.08) + (1500 * 0.18));
            diferenca = (renda - 4500);
            imposto += (diferenca * 0.28);

        } else if (renda > 3000) {
            imposto = (1000 * 0.08);
            diferenca = (renda - 3000);
            imposto += (diferenca * 0.18);

        } else if (renda > 2000) {
            diferenca = (renda - 2000);
            imposto = (diferenca * 0.08);
        }

        System.out.println((imposto == 0.0 ? "Isento" : "R$ " + String.format("%.2f", imposto)));
    }
}
