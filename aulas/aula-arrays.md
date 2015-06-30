# 1. Arrays

Neste capítulo vamos estudar o conceito de *array* que é um importante conceito
de como armazenar elementos de um mesmo tipo.


## 1.1 Motivação

Observe o código abaixo:

```java
public class CalculaMediaDaTurma {
  public static void main(String[] args) {
    double media, nota1, nota2;

    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1a nota"));
    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2a nota"));
    media = (nota1 + nota2) / 2;

    JOptionPane.showMessageDialog(null, "Média: " + media);
  }
}
```
Não é difícil perceber o que o programa acima faz. Basicamente ele calcula a
média aritmética de duas notas. Agora imagine que você queria calcular a média
de 5 notas. Uma possível modificação a ser feita seria:

```java
public class CalculaMediaDaTurma {
  public static void main(String[] args) {
    double media, nota1, nota2, nota3, nota4, nota5;

    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1a nota"));
    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2a nota"));
    nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3a nota"));
    nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4a nota"));
    nota5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 5a nota"));
    media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

    JOptionPane.showMessageDialog(null, "Média: " + media);
  }
}
```
Começou a perceber a dificuldade? E se fossem 10 notas? E se fossem 100? E se
fossem 1.000.000? Seria bem difícil escrever esse programa, não é mesmo? E onde
está a dificuldade? Vejamos:

* Ter que declarar 10, 100, 1.000.000 variáveis (nota1, nota2, ....);
* Ter que escrever 10, 100, 1.000.000 de instruções do tipo `Double.parseDouble(JOptionPane.showInputDialog("Digite a Nº nota"));`;
* Ter que escrever a instrução de calcular a média, somando todas as notas
`(nota1 + nota2 + ...)`.

A esta altura você deve estar se perguntando: será que não existe uma maneira
mais simples de se fazer isso? E há! Para isso, utilizaremos um recurso chamado
**array**.


## 1.2 Definição

> Um array é um conjunto de elementos de um mesmo tipo cuja quantidade de
elementos é fixa.

Observações:

* Os itens que são armazenados em um array são chamados *elementos*;
* A quantidade máxima de elementos que podem ser armazenados neste conjunto
é fixa e deve ser estabelecida na criação deste conjunto;
* Cada elemento é acessado *individualmente* no conjunto por meio de um número
chamado *índice* (ou, em inglês, *index*).


## 1.3 Sintaxe

```java
Tipo[] identificador = new Tipo[TAMANHO];
```

ou

```java
Tipo[] identificador;
identificador = new Tipo[TAMANHO];
```

Em que:

* `Tipo[]`: está declarado que será criado um conjunto de elementos de um
determinado Tipo de dado (ex.: `int`, `double`, `boolean`, `String`, etc);
* `identificador`: indica qual será o *"nome"* deste conjunto (ex.: `notas`,
`nomes`, `letras`, `idades`, etc);
* `TAMANHO`: indica a quantidade de elementos máximo que pode ser colocada neste
conjunto.


## 1.4 Exemplos

1. Para criar um conjunto de 10 notas:

```java
double[] notas = new double[10];
```
Em que:

        * Os elementos (as notas) que serão armazenados neste conjunto são todos
        do tipo `double`;
        * O conjunto chama-se `notas`;
        * A quantidade máxima de elementos possíveis de serem armazenados é 10; 

2. Para criar um conjunto de 15 nomes:

```java
String[] nomes = new String[15];
```
Em que:

* Os elementos (os nomes) que serão armazenados neste conjunto são todos do
tipo `String`;
* O conjunto chama-se `nomes`;
* A quantidade máxima de elementos possíveis de serem armazenados é 15;


3. Para criar um conjunto de 5 idades:

```java
int[] idades = new int[5];
```
Em que:

* Os elementos (as idades) que serão armazenados neste conjunto são todos do
tipo `int`;
* O conjunto chama-se `idades`;
* A quantidade máxima de elementos possíveis de serem armazenados é 5;


## 1.5 Exercícios

1. Desenvolva um programa que solicite que o usuário informe 10 números
inserido-os em um array. A seguir, mostre na tela a soma dos números que foram
informados.

2. Desenvolva um programa que solicite que o usuário informe 10 números
inserido-os em um array. A seguir, mostre na tela a média dos números que foram
informados.

3. Desenvolva um programa que solicite que o usuário informe 10 números
inteiros, inserido-os em um array. A seguir, mostre na tela o maior e menor
número que foram informados.

4. Desenvolva um programa que solicite que o usuário informe 10 números
inserido-os em um array. A seguir, mostre na tela os números em ordem inversa da
qual foram informados.

5. Desenvolva um programa que solicite que o usuário informe uma palavra e, a
seguir, mostre na tela quantas consoantes há nesta palavra.

6. Desenvolva um programa que solicite que o usuário informe uma palavra e, a
seguir, mostre na tela quantas vogais há nesta palavra.

7. Segundo a Wikipedia, um palíndromo é uma palavra ou frase que tenha a
propriedade de poder ser lida tanto da direita para a esquerda como da esquerda
para a direita. Como exemplos, temos as palavras ARARA, OVO, RADAR e SOCOS. De
posse desta informação, desenvolva um programa que solicite que o usuário
informe uma palavra e informe se esta palavra forma ou não um palíndromo.

8. Imagine uma biblioteca qualquer. Nesta biblioteca há o acervo, que é composto
de vários módulos. Um módulo é composto por várias estantes. Estas estantes, por
sua vez, possuem várias prateleiras na qual são colocados os livros. Frequente
um bibliotecário precisa localizar, por meio do título do livro, em qual módulo,
estante e prateleira está este livro no acervo. Assim, assumindo que nesta
biblioteca existem 5 módulos, que cada módulo possui 3 estantes e cada estante
possui 10 prateleiras, utilize os seus conhecimentos de arrays
multidimensionais, para implementar um programa de computador que: a) informe um
menu no qual o usuário deverá informar o módulo, a estante, a prateleira e o
título do livro a ser guardado neste local no acervo; b) informado um título de
um livro qualquer, o programa retorne em qual módulo, estante e prateleira
aquele livro se encontra.
