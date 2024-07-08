package Exercicios;

import java.util.*;
import java.util.stream.*;

public class DesafiosStreamAPI {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 1 - Mostre a lista na ordem numérica
        System.out.println("Desafio 1: " + numeros.stream().sorted().collect(Collectors.toList()));

        // Desafio 2 - Imprima a soma dos números pares da lista
        int somaPares = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Desafio 2: " + somaPares);

        // Desafio 3 - Verifique se todos os números da lista são positivos
        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println("Desafio 3: " + todosPositivos);

        // Desafio 4 - Remova todos os valores ímpares
        List<Integer> apenasPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Desafio 4: " + apenasPares);

        // Desafio 5 - Calcule a média dos números maiores que 5
        double media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Desafio 5: " + media);

        // Desafio 6 - Verificar se a lista contém algum número maior que 10
        boolean contemMaiorQueDez = numeros.stream().anyMatch(n -> n > 10);
        System.out.println("Desafio 6: " + contemMaiorQueDez);

        // Desafio 7 - Encontrar o segundo número maior da lista
        int segundoMaior = numeros.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println("Desafio 7: " + segundoMaior);

        // Desafio 8 - Somar os dígitos de todos os números da lista
        int somaDigitos = numeros.stream().mapToInt(n -> String.valueOf(n).chars().map(Character::getNumericValue).sum()).sum();
        System.out.println("Desafio 8: " + somaDigitos);

        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)
        boolean todosDistintos = numeros.stream().distinct().count() == numeros.size();
        System.out.println("Desafio 9: " + todosDistintos);

        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5
        List<Integer> imparesMultiplos = numeros.stream().filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)).collect(Collectors.toList());
        System.out.println("Desafio 10: " + imparesMultiplos);

        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista
        int somaQuadrados = numeros.stream().mapToInt(n -> n * n).sum();
        System.out.println("Desafio 11: " + somaQuadrados);

        // Desafio 12 - Encontre o produto de todos os números da lista
        int produto = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Desafio 12: " + produto);

        // Desafio 13 - Filtrar os números que estão dentro de um intervalo
        List<Integer> numerosNoIntervalo = numeros.stream().filter(n -> n >= 5 && n <= 10).collect(Collectors.toList());
        System.out.println("Desafio 13: " + numerosNoIntervalo);

        // Desafio 14 - Encontre o maior número primo da lista
        int maiorPrimo = numeros.stream().filter(DesafiosStreamAPI::ehPrimo).max(Integer::compareTo).orElse(0);
        System.out.println("Desafio 14: " + maiorPrimo);

        // Desafio 15 - Verifique se a lista contém pelo menos um número negativo
        boolean contemNegativo = numeros.stream().anyMatch(n -> n < 0);
        System.out.println("Desafio 15: " + contemNegativo);

        // Desafio 16 - Agrupe os números em pares e ímpares
        Map<Boolean, List<Integer>> paresEImpares = numeros.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Desafio 16 - Pares: " + paresEImpares.get(true));
        System.out.println("Desafio 16 - Ímpares: " + paresEImpares.get(false));

        // Desafio 17 - Filtrar os números primos da lista
        List<Integer> primos = numeros.stream().filter(DesafiosStreamAPI::ehPrimo).collect(Collectors.toList());
        System.out.println("Desafio 17: " + primos);

        // Desafio 18 - Verifique se todos os números da lista são iguais
        boolean todosIguais = numeros.stream().distinct().count() == 1;
        System.out.println("Desafio 18: " + todosIguais);

        // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5
        int somaDivisiveis = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Desafio 19: " + somaDivisiveis);
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}

