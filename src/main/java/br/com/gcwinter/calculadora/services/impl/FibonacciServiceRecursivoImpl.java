package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.FibonacciService;

import java.util.HashMap;
import java.util.Map;

public class FibonacciServiceRecursivoImpl implements FibonacciService {

    private final Map<Integer, Integer> cache = new HashMap<>();

    @Override
    public String fibonacci(int numero) {
        String fibonacci = "1";
        for (int i = 1; i <= numero; i++) {
            fibonacci = fibonacci + "," + fibonacciRecursivo(i);
        }

        return fibonacci;
    }

    private int fibonacciRecursivo(int numero) {

        if (cache.containsKey(numero)) {
            return cache.get(numero);
        }
        if (numero <= 1) {
            return 1;
        }
        int fibonacciPosicaoAnterior = fibonacciRecursivo(numero - 1);
        int fibonacciDeDuasPosicoesAtras = fibonacciRecursivo(numero - 2);
        int soma = fibonacciDeDuasPosicoesAtras + fibonacciPosicaoAnterior;

        cache.put(numero, soma);
        return soma;
    }


}
