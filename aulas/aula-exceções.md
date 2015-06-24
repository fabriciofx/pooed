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

De acordo com [3] temos:

> Uma exceção é um evento que ocorre durante a execução de
um programa, interrompendo o fluxo normal de excecução das
instruções.


## 1.3 Casos de Uso

Observe os seguintes exemplos:

```java
public class TesteExcecao1 {
  public static void main(String[] args) {
    // Cria uma representação de um arquivo texto
    File arquivo = new File("texto.txt");
    // Lê todas as linhas de texto do arquivo e armazena na
    // coleção linhas
    List<String> linhas = Files.readAllLines(arquivo.toPath(), "UTF-8");
    ...
  }
}
```
E se na linha `File arquivo = new File("texto.txt");` o arquivo
texto.txt não existisse? Ou se ele estivesse localizado em
um lugar diferente do esperado?


A exceção carrega consigo informações importantes sobre este
problema, como:

* Qual é o problema;
* Onde aconteceu o problema;
* Por que o problema aconteceu (se possível).

## 1.4 Sintaxe

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


## 1.5 Tipos de Exceções

Em Java existem três tipos de exceções:

* Erro (classe Error)
* Falha (classe RuntimeException)
* Exceção de Contingência (classe Exception)

O propósito destes tipos é lidar com diferentes formas que o
desenvolvedor deve lidar com elas.

Todas estas classes são filhas de Throwable.


## 1.6 Exceções Mais Comuns

Existem diversas exceções já implementadas na plataforma Java.
Entre as mais comuns, temos:

| Exceção | Quando Utilizar |
|---------|-----------------|
| NullPointerException | O valor de um parâmetro é nulo, quando não deveria ser |
| IllegalArgumentException | O valor de um parâmetro não nulo é inapropriado |
| IllegalStateException | O estado do objeto é inapropriado para a invocação do método |
| IndexOutOfBoundsException | O valor do índice do parâmetro está fora do intervalo |
| ConcurrentModificationException | A modificação concorrente de um objeto foi detectada onde é proibida |
| UnsupportedOperationException | O objeto não suporta a invocação do método |

Vamos ilustrar a utilização destas exceções.


### Exceção Verificada (Checked Exception)

É uma condição tão importante que o programador não deve se
esquivar de tratá-la imediatamente. Este tipo de situação existe
quando o programa tem que interagir com o ambiente em que
executa, por exemplo com o sistema de arquivos ou a rede.


## 1.7 IllegalArgumentException vs NullPointerException

Uma dúvida que aparece com frequência é qual exceção utilizar
para verificar se um determinado parâmetro passado a um
método é nulo ou não. Acompanhe o exemplo abaixo:

```java
public class Pessoa {
  private final String nome;
  private final LocalDate nascimento;

  public Pessoa(final String nome, final LocalDate nascimento) {
    this.nome = nome;
    this.nascimento = nascimento;
  }

  // Outros métodos
}
```
Neste exemplo, temos uma classe que representa uma `Pessoa` e,
obrigatoriamente, esta pessoa deve possuir um nome e uma data
de nascimento. A questão é: quem garante que o parâmetro `nome`
ou o parâmetro `nascimento` são válidos? Assim, a instrução
```java
Pessoa ana = new Pessoa(null, null);
```
é perfeitamente válida.



## Referências

[1] Sergio Taborda. Exceções: conceitos https://sergiotaborda.wordpress.com/desenvolvimento-de-software/java/trabalhando-com-excecoes-conceitos/
[2] Sergio Taborda. Exceções: Boas Práticas, Más Práticas https://sergiotaborda.wordpress.com/desenvolvimento-de-software/java/excecoes-boas-praticas-mas-praticas/
[3] What is a Exception? https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html
