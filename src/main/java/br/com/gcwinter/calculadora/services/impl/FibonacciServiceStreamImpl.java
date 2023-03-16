package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.FibonacciService;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciServiceStreamImpl implements FibonacciService {
    @Override
    public String fibonacci(int numero) {


        return fibonacciStream(numero+1).map(String::valueOf).collect(Collectors.joining(","));
    }

    private Stream<Integer> fibonacciStream(int n) {
        return Stream.generate(new Supplier<Integer>() {
            int numeroAnterios = 0;
            int numeroAtual = 1;

            public Integer get() {
                int numeroSeguinte = numeroAnterios;
                numeroAnterios = numeroAtual;
                numeroAtual = numeroSeguinte + numeroAtual;
                return numeroAnterios;
            }
        }).limit(n);
    }
}
