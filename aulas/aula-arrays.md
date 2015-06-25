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
Começou a perceber a dificuldade? E se fossem 10 notas? E se fossem 100? E
se fossem 1.000.000? Seria bem difícil escrever esse programa, não é mesmo?
E onde está a dificuldade? Vejamos:

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
* A quantidade de máxima de elementos que podem ser armazenados neste conjunto
é fixa e deve ser estabelecida na criação deste conjunto;
* Cada elemento é acessado no conjunto por meio de um número chamado *índice*.


## 1.3 Sintaxe

```java
Tipo[][]...[] identificador = new Tipo[TAM1][TAM2]...[TAMN];
```

ou

```java
Tipo[][]...[] identificador;
identificador = new Tipo[TAM1][TAM2]...[TAMN];
```

## 1.4 Exemplos

1. Para criar um conjunto de 10 notas:

```java
double[] notas = new double[10];
```
Em que:

* Os elementos (as notas) que serão armazenados neste conjunto são todos do
tipo `double`;
* O conjunto chama-se `notas`;
* A quantidade de elementos possíveis de serem armazenados é 10;


2. Para criar um conjunto de 15 nomes:

```java
String[] nomes = new String[15];
```
Em que:

* Os elementos (os nomes) que serão armazenados neste conjunto são todos do
tipo `String`;
* O conjunto chama-se `nomes`;
* A quantidade de elementos possíveis de serem armazenados é 15;


3. Para criar um conjunto de 5 idades:

```java
int[] idades = new int[5];
```
Em que:

* Os elementos (as idades) que serão armazenados neste conjunto são todos do
tipo `int`;
* O conjunto chama-se `idades`;
* A quantidade de elementos possíveis de serem armazenados é 5;
