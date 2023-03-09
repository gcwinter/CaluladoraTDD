package br.com.gcwinter.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/soma/{a}/{b}")
    public Integer soma(@PathVariable int a, @PathVariable int b) {
        return a + b;

    }

    @GetMapping("/fatorial/{a}")
    public int fatorial(@PathVariable int a) {

        int multiplicacao = 1;

        for (int i = 0; i < a; i++) {
            multiplicacao = multiplicacao * (a - i);
        }

        return multiplicacao;
    }

    @GetMapping("/fibonacci/{a}")
    public String fibonacci(@PathVariable int a) {

        String fibonacci = "1";
        int numeroAnterios = 0, numeroAtual = 1;

        for (int i = 1; i <= a; i++) {
            int numeroSeguinte = numeroAnterios + numeroAtual;
            fibonacci = fibonacci + "," + numeroSeguinte;
            numeroAnterios = numeroAtual;
            numeroAtual = numeroSeguinte;
        }
        return fibonacci;

    }


}
