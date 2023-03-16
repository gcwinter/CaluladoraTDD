package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.CalculoMalucoService;
import br.com.gcwinter.calculadora.services.FatorialService;
import br.com.gcwinter.calculadora.services.FibonacciService;
import br.com.gcwinter.calculadora.services.SomaService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CalculoMalucoServiceImpl implements CalculoMalucoService {
    private final SomaService somaService;
    private final FatorialService fatorialService;
    private final FibonacciService fibonacciService;

    public CalculoMalucoServiceImpl(SomaService somaService, FatorialService fatorialService, FibonacciService fibonacciService) {
        this.somaService = somaService;
        this.fatorialService = fatorialService;
        this.fibonacciService = fibonacciService;
    }

    @Override
    public int get(int numero) {


        // dado o fatorial entre 0 e 10, soma de cada um dos algarismos do fatorial e gerar o fibonacci e somar o fibonacci.
        if (numero < 0 || numero > 10) {
            return -1;
        } else {
            int numeroFatorial = fatorialService.fatorial(numero);
            String[] arrayDeString = String.valueOf(numeroFatorial).split("");
            List<Integer> numerosSeparados = Arrays.stream(arrayDeString).mapToInt(i -> Integer.valueOf(i)).boxed().toList();
            int somaDoFatorial = somaService.soma(numerosSeparados);
            String fibonacci = fibonacciService.fibonacci(somaDoFatorial);
            List<Integer> numerosDeFibonacci = Arrays.stream(fibonacci.split(",")).mapToInt(i -> Integer.valueOf(i)).boxed().toList();
            return somaService.soma(numerosDeFibonacci);
        }
    }


}
