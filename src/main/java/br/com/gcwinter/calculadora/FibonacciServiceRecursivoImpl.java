package br.com.gcwinter.calculadora;

public class FibonacciServiceRecursivoImpl implements FibonacciService {


    @Override
    public String fibonacci(int numero) {
        String fibonacci = "1";
        for (int i = 1; i <= numero; i++) {
            fibonacci = fibonacci + "," + fibonacciRecursivo(i);
        }

        return fibonacci;
    }

    private int fibonacciRecursivo(int numero) {

        if (numero <= 1) {
            return 1;
        }
        int fibonacciPosicaoAnterior = fibonacciRecursivo(numero - 1);
        int fibonacciDeDuasPosicoesAtras = fibonacciRecursivo(numero - 2);

        return fibonacciDeDuasPosicoesAtras + fibonacciPosicaoAnterior;
    }


}
