# Stream-API

A Stream API em Java é uma poderosa ferramenta introduzida no Java 8 que permite processar coleções de forma funcional e declarativa. Este documento fornece uma visão geral dos conceitos-chave da Stream API e inclui exemplos comuns.

## O Que é a Stream API?

A Stream API é uma forma de realizar operações sobre coleções de dados (como listas, conjuntos, etc.) de maneira mais concisa e legível, usando uma abordagem funcional.

## Características Principais

1. **Operações Declarativas**: Em vez de usar loops explícitos (for, while), você declara o que quer fazer com os dados.

    ```java
    List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
    nomes.stream()
         .filter(nome -> nome.startsWith("A"))
         .forEach(System.out::println);
    ```

2. **Operações de Pipeline**: As operações são encadeadas, criando um pipeline de processamento.
   - **Intermediárias**: Transformam o stream em outro stream. Ex: `filter`, `map`, `sorted`.
   - **Terminais**: Produzem um resultado ou efeito colateral. Ex: `forEach`, `collect`, `sum`.

3. **Lazy Evaluation**: As operações intermediárias são executadas apenas quando uma operação terminal é invocada.

4. **Imutabilidade**: Streams não alteram a coleção original; eles processam dados e retornam novos resultados.

## Exemplos Comuns

### Filtragem

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> pares = numeros.stream()
                             .filter(n -> n % 2 == 0)
                             .collect(Collectors.toList());
```
## Mapeamento
```java
List<String> palavras = Arrays.asList("a", "bb", "ccc");
List<Integer> comprimentos = palavras.stream()
                                     .map(String::length)
                                     .collect(Collectors.toList());
```


# Interfaces Funcionais em Java
## Supplier
Supplier é uma interface funcional que não recebe argumentos e fornece um resultado.

```java

import java.util.function.Supplier;

Supplier<Double> randomNumberSupplier = Math::random;
double randomValue = randomNumberSupplier.get();
```
## Consumer
Consumer é uma interface funcional que recebe um argumento e não retorna nada.

```java

import java.util.function.Consumer;

Consumer<String> printString = System.out::println;
printString.accept("Hello, Consumer!");
```
## Function
Function é uma interface funcional que recebe um argumento e produz um resultado.
```java

import java.util.function.Function;

Function<String, Integer> stringLength = String::length;
int length = stringLength.apply("Hello, Function!");
```
## Predicate
Predicate é uma interface funcional que recebe um argumento e retorna um valor booleano.

```java

import java.util.function.Predicate;

Predicate<Integer> isEven = num -> num % 2 == 0;
boolean result = isEven.test(4); // true
```
