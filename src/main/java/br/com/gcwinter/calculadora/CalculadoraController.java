package br.com.gcwinter.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalculadoraController {
    private final SomaService somaService;
    private final FatorialService fatorialService;
    private final FibonacciService fibonacciService;
    private final CalculoMalucoService calculoMalucoService;

    public CalculadoraController(SomaService somaService, FatorialService fatorialService, FibonacciService fibonacciService, CalculoMalucoService calculoMalucoService) {
        this.somaService = somaService;
        this.fatorialService = fatorialService;
        this.fibonacciService = fibonacciService;
        this.calculoMalucoService = calculoMalucoService;
    }

    @GetMapping("/soma/{a}/{b}")
    public Integer soma(@PathVariable int a, @PathVariable int b) {
        return somaService.soma(List.of(a, b));

    }

    @GetMapping("/fatorial/{a}")
    public int fatorial(@PathVariable int a) {
        return fatorialService.fatorial(a);

    }

    @GetMapping("/fibonacci/{a}")
    public String fibonacci(@PathVariable int a) {
        return fibonacciService.fibonacci(a);

    }

    @GetMapping("/calculo-maluco/{numero}")
    public int getFatorialSomaAlgarismosFibonacciSomaFibonacci(@PathVariable int numero) {

        return calculoMalucoService.get(numero);


    }

    //TODO criar um metodo que dado um valor inicial e uma taxa de juros ao ano calcule o valor final.
}
