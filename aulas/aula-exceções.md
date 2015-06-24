# Exceções

Uma exceção é um evento que ocorre quando ocorre algum problema.
A exceção carrega consigo informações importantes sobre este
problema, como:

* Qual é o problema;
* Onde aconteceu o problema;
* Porque o problema aconteceu (se possível).

## Motivação

Frequentemente um desenvolvedor depara-se com a necessidade de
fazer certas verificações, como:

* Se antes de ler um arquivo, o mesmo existe;
* Se uma conexão com um banco de dados remoto está aberta;
* Se uma conexão com à Internet foi aberta;
* Se um determinado parâmetro não é nulo (null);
* Se uma determinada string não é vazia.

## Tipos de Exceções

Em Java existem três tipos de exceções:

* Erro (classe Error)
* Falha (classe RuntimeException)
* Exceção de Contingência (classe Exception)

O propósito destes tipos é lidar com diferentes formas que o
desenvolvedor deve lidar com elas.

Todas estas classes são filhas de Throwable.


# Exceções Mais Comuns

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
