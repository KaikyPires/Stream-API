package Testes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

      
      Consumer<Integer> imprimirNumeroPar = numero -> {
        if (numero % 2 == 0) {
          System.out.println(numero);
        }
      };
  
      // Usar o Consumer para imprimir números pares no Stream
      // Exemplo1
      //numeros.stream().forEach(imprimirNumeroPar);
      numeros.stream().forEach(n -> {
        if (n % 2 == 0) {
          System.out.println(n);
        }
      }
      );
    }
}

