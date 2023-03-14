package br.com.gcwinter.calculadora;

import org.springframework.stereotype.Service;

@Service
public class FibonacciServiceImpl implements FibonacciService {
    @Override
    public String fibonacci(int numero) {

        String fibonacci = "1";
        int numeroAnterios = 0, numeroAtual = 1;

        for (int i = 1; i <= numero; i++) {
            int numeroSeguinte = numeroAnterios + numeroAtual;
            fibonacci = fibonacci + "," + numeroSeguinte;
            numeroAnterios = numeroAtual;
            numeroAtual = numeroSeguinte;
        }
        return fibonacci;    }
}
