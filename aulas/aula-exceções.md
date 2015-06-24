# 1. Exceções

Neste capítulo vamos estudar o conceito de **exceção**, que é
uma importante ferramenta das linguagens de programação para o
tratamento de erros em um programa de computador.

## 1.1 Motivação

Frequentemente um desenvolvedor depara-se com a necessidade de
fazer certas verificações, como:

* Se antes de ler um arquivo, o mesmo existe;
* Se uma conexão com um banco de dados remoto está aberta;
* Se uma conexão com à Internet foi aberta;
* Se um determinado parâmetro não é nulo (null);
* Se uma determinada string não é vazia.

## 1.2 Definição

De acordo com [3] uma exceção pode ser definida como:

> Uma exceção é um evento que ocorre durante a execução de
um programa que interrompe o fluxo normal de excecução das
instruções deste programa.

A exceção carrega consigo informações importantes sobre este
problema, como:

* Qual é o problema;
* Onde aconteceu o problema;
* Por que o problema aconteceu (se possível).

## 1.3 Sintaxe

```java
try {
  Instrução1;
  Instrução2;
  ...
  InstruçãoN;
} catch (TipoDeExceção1 nome1) {
  Instrução1;
  Instrução2;
  ...
  InstruçãoN;  
} catch (TipoDeExceção2 nome2) {
  Instrução1;
  Instrução2;
  ...
  InstruçãoN;
}
.
.
.
} catch (TipoDeExceçãoN nomeN) {
  Instrução1;
  Instrução2;
  ...
  InstruçãoN;
} finally {
  Instrução1;
  Instrução2;
  ...
  InstruçãoN;
}
```

Observações:

1. Só há apenas UM `try`;
2. É possível ter quantos ```catch()```;
3. Só é possível ter UM ```finally```.


## Tipos de Exceções

Em Java existem três tipos de exceções:

* Erro (classe Error)
* Falha (classe RuntimeException)
* Exceção de Contingência (classe Exception)

O propósito destes tipos é lidar com diferentes formas que o
desenvolvedor deve lidar com elas.

Todas estas classes são filhas de Throwable.


## Exceções Mais Comuns

Existem diversas exceções já implementadas na plataforma Java.
Entre as mais comuns, temos:

|Exceção | Tipo | Utilização |
|--------|------|------------|
|IllegalArgumentException | RuntimeException | Quando algum argumento inválido é passado para um método |
|NullPointerException | RuntimeException | Quando algum argumento em um método é nulo (null) |


### Exceção Verificada (Checked Exception)

É uma condição tão importante que o programador não deve se
esquivar de tratá-la imediatamente. Este tipo de situação existe
quando o programa tem que interagir com o ambiente em que
executa, por exemplo com o sistema de arquivos ou a rede.


## Referências

[1] Sergio Taborda. Exceções: conceitos https://sergiotaborda.wordpress.com/desenvolvimento-de-software/java/trabalhando-com-excecoes-conceitos/
[2] Sergio Taborda. Exceções: Boas Práticas, Más Práticas https://sergiotaborda.wordpress.com/desenvolvimento-de-software/java/excecoes-boas-praticas-mas-praticas/
[3] What is a Exception? https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html
