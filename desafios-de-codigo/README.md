<p align="center">
  <img width="150px" src="https://user-images.githubusercontent.com/13790608/230697094-3c4f6836-bbcd-42fb-b770-f6698fb4cf7e.png">
</p>
<h1 align=center>Desafios de Código (Básicos)</h1>

## 1️⃣ - Fábrica de Carros

O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). O gerente de uma loja de carros gostaria de um programa para calcular o preço de um carro novo para os clientes. Você receberá o custo de fábrica e as porcentagens referentes ao distribuidor e os impostos e deverá escrever programa para ler esses valores e imprimir o valor final do carro.

**Entrada**</br>
Você recebera três valores inteiros que representam o custo de fábrica, as porcentagens do distribuidor e os impostos.

**Saída**</br>
Como saída, teremos o valor final do preço de um carro novo.

**Exemplos:**
|Entrada            |Saída|Entrada            |Saída|
|-------------------|-----|-------------------|-----|
|20000</br>28</br>45|34600|30000</br>10</br>10|36000|

Veja a solução do *Desafio 1* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosbasicos/Desafio1.java>aqui</a>.

## 2️⃣ - Imprimindo Positivos e Média

Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

**Entrada**</br>
A entrada contém 6 números que podem ser valores inteiros (int) ou de ponto flutuante (float ou double). Pelo menos um destes números será positivo.

**Saída**</br>
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.

|Exemplo de Entrada                    |Exemplo de Saída           |
|--------------------------------------|---------------------------|
|7</br>-5</br>6</br>-3.4</br>4.6</br>12|4 valores positivos</br>7.4|

Veja a solução do *Desafio 2* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosbasicos/Desafio2.java>aqui</a>.

## 3️⃣ - Soma de H com N Termos

Neste desafio, faça um programa que calcule o valor de H com N termos. 

Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 

**Entrada**</br>
A entrada consiste em um número inteiro positivo. 

**Saída**</br>
Na saída será impresso o valor que representa a soma dos termos.

|Entrada|Saída|
|-------|-----|
|4      |2    |
|8      |3    |
|3      |2    |

Veja a solução do *Desafio 3* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosbasicos/Desafio3.java>aqui</a>.

## 4️⃣ - Dragão!

Daenerys é a khaleesi dos Dothraki. Juntamente com Drogon, eles vão atrás do Tyrion, para tentar dominar Westeros. Ela possui, além do seu dragãozinho, um rastreador que mede o nível de energia de qualquer ser vivo. Todos os seres com o nível menor ou igual a 8000, ela considera como se fosse um inseto. Quando passa deste valor, que foi o caso do Drogon, ela se espanta e grita “Mais de 8000”. Baseado nisso, utilize a mesma tecnologia e analise o nível de energia dos seres vivos.

**Entrada**</br>
A primeira linha contém um número inteiro C relativo ao número de casos de teste. Em seguida, haverá C linhas, com um número inteiro N (100 <= N <= 100000) relativo ao nível de energia de um ser vivo.

**Saída**</br>
Para cada valor lido, imprima o texto correspondente.

|Exemplo de Entrada        |Exemplo de Saída                     |
|--------------------------|-------------------------------------|
|3</br>8001</br>100</br>200|Mais de 8000!</br>Inseto!</br>Inseto!|

Veja a solução do *Desafio 4* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosbasicos/Desafio4.java>aqui</a>.

## 5️⃣ - Fibonacci Fácil

A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

**Entrada**</br>
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

**Saída**</br>
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor.

|Exemplo de Entrada|Exemplo de Saída|
|------------------|----------------|
|5                 |0 1 1 2 3       |

Veja a solução do *Desafio 5* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosbasicos/Desafio5.java>aqui</a>.

<h1 align=center>Desafios de Código (Intermediários)</h1>

## 1️⃣ - Animal

Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita. Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

<img width="400px" align="right" src="https://user-images.githubusercontent.com/13790608/230700086-43601eb7-ad47-4b16-9451-8912043274cc.png">

**Entrada**</br>
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

**Saída**</br>
Imprima o nome do animal correspondente à entrada fornecida.

|Exemplo de Entrada                   |Exemplo de Saída |
|-------------------------------------|-----------------|
|vertebrado</br>mamifero</br>onivoro  |homem            |
|vertebrado</br>ave</br>carnivoro     |aguia            |
|invertebrado</br>anelideo</br>onivoro|minhoca          |

Veja a solução do *Desafio 1* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosintermediarios/Desafio1.java>aqui</a>.

## 2️⃣ - Quitanda do Seu Zé

Seu Zé está vendendo frutas com a seguinte tabela de preços:

|       |Até 5 kg      |Acima de 5kg  |
|-------|--------------|--------------|
|Morango|R$ 2,50 por Kg|R$ 2,20 por Kg|
|Maçã   |R$ 1,80 por Kg|R$ 1,50 por Kg|

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

**Entrada**</br>
Como entrada, você recebera a quantidade em kg de morangos e a quantidade em kg de maçãs.

**Saída**</br>
Será o valor a ser pago pelo cliente, conforme a tabela de preços da quintanda do seu Zé.

**Exemplos:**
|Entrada|Saída|Entrada|Saída|Entrada|Saída|
|-------|-----|-------|-----|-------|-----|
|3</br>2|11.1 |1</br>1|4.3  |5</br>5|19.35|

Veja a solução do *Desafio 2* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosintermediarios/Desafio2.java>aqui</a>.

## 3️⃣ - Triângulo

Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:

**Perimetro = XX.X**

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:

**Area = XX.X**

Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2

**Entrada**</br>
A entrada contém três valores reais.

**Saída**</br>
O resultado deve ser apresentado com uma casa decimal.

**Exemplos:**
|Entrada            |Saída           |
|-------------------|----------------|
|6.0</br>4.0</br>2.0|Area = 10.0     |
|6.0</br>4.0</br>2.1|Perimetro = 12.1|

Veja a solução do *Desafio 3* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosintermediarios/Desafio3.java>aqui</a>.

## 4️⃣ - Conta Espaços e Vogais

Jorginho é professor do primário de uma determinada escola. Ele tem 100000 alunos e precisa criar um programa que verifica quantos espaços em branco e quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!

**Entrada**</br>
A entrada será uma frase no formato de string. 

**Saída**</br>
A saída deverá retornar quantos espaços em branco e quantas vogais existem na determinada string, conforme exemplo abaixo:

|Entrada                       |Saída                          |
|------------------------------|-------------------------------|
|“Amo a DIO”                   |Espacos em branco: 2 Vogais: 5 |
|“Esse desafio foi facil”      |Espacos em branco: 3 Vogais: 10|
|“Navegar nas aguas do teu mar”|Espacos em branco: 5 Vogais: 11|

Veja a solução do *Desafio 4* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosintermediarios/Desafio4.java>aqui</a>.

## 5️⃣ - Taxa de Imposto de Renda

Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.

Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

<img width="400px" src="https://user-images.githubusercontent.com/13790608/230701523-55a262c9-cb17-4bd9-b3d6-2e0495851eaa.png">

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

**Entrada**</br>
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

**Saída**</br>
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".

**Exemplos**</br>
|Entrada|Saída    |
|-------|---------|
|3002.00|R$ 80.36 |
|1701.12|Isento   |
|4520.00|R$ 355.60|

Veja a solução do *Desafio 5* <a href=https://github.com/jhansenbarreto/bootcamp-dio-bancopan/blob/master/desafios-de-codigo/src/main/java/com/dio/desafiosintermediarios/Desafio5.java>aqui</a>.

## :construction_worker: Autor

| :technologist: Desenvolvedor |:globe_with_meridians: Links Úteis|
|-----------------------------:|----------------------------------|
|<p align="center"><img src="https://avatars.githubusercontent.com/u/13790608?v=4" width=115></br><sub>Jhansen Barreto</sub></p>|<ul><li><a href="https://github.com/jhansenbarreto?tab=repositories">GitHub</a></li><li><a href="https://br.linkedin.com/in/jhansen-c-barreto">LinkedIn</a></li><li><a href="https://www.instagram.com/jhansenbarreto/">Instagram</a></li></ul>|
