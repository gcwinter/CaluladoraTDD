package br.com.gcwinter.calculadora;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class CalculoVini {
    private final SomaService somaService;
    private final FatorialService fatorialService;
    private final FibonacciService fibonacciService;

    public CalculoVini(SomaService somaService, FatorialService fatorialService, FibonacciService fibonacciService) {
        this.somaService = somaService;
        this.fatorialService = fatorialService;
        this.fibonacciService = fibonacciService;
    }

    public int metodo(int numero) {

        if (numero < 0 || numero > 10) {
            return -1;
        } else {
            int numeroFatorial = fatorialService.fatorial(numero);
            List<Integer> numerosSeparados = Arrays.stream(String.valueOf(numeroFatorial).split("")).mapToInt(i -> Integer.valueOf(i)).boxed().toList();
            int somaDoFatorial = somaService.soma(numerosSeparados);
            String fibonacci = fibonacciService.fibonacci(somaDoFatorial);
            List<Integer> numerosDeFibonacci = Arrays.stream(fibonacci.split(",")).mapToInt(i -> Integer.valueOf(i)).boxed().toList();
            return somaService.soma(numerosDeFibonacci);
        }
    }

}
