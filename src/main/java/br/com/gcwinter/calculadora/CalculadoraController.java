package br.com.gcwinter.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CalculadoraController {
    private final SomaService somaService;
    private final FatorialService fatorialService;
    private final FibonacciService fibonacciService;
    private final CalculoVini calculoVini;

    public CalculadoraController(SomaService somaService, FatorialService fatorialService, FibonacciService fibonacciService, CalculoVini calculoVini) {
        this.somaService = somaService;
        this.fatorialService = fatorialService;
        this.fibonacciService = fibonacciService;
        this.calculoVini = calculoVini;
    }

    @GetMapping("/soma/{a}/{b}")
    public Integer soma(@PathVariable int a, @PathVariable int b) {
        return somaService.soma(List.of(a, b));
        //TODO fazer a soma utilizando STREAM.
    }

    @GetMapping("/fatorial/{a}")
    public int fatorial(@PathVariable int a) {
        return fatorialService.fatorial(a);
        //TODO fazer utilizando STREAM.
    }

    @GetMapping("/fibonacci/{a}")
    public String fibonacci(@PathVariable int a) {
        return fibonacciService.fibonacci(a);
        //TODO fazer utilziando STREAM
    }

    public int metodo(int numero) {
        //TODO  dado o fatorial entre 0 e 10, soma de cada um dos numeros do fatorial, fibonacci da soma dos algarismos do fatorial.
        return calculoVini.metodo(numero);
        //TODO nome bonito para o metodo e classe e adicionar um endpoint e criar interface.

    }

    //TODO metodo novo que compara a performace entre a soma usando for e a soma utilizando stream.

    void metodo1() {
        int tempoInicial = (int) System.currentTimeMillis();
        FatorialService a = new FatorialServiceImpl();
        a.fatorial(50);
        int tempoFinal = (int) System.currentTimeMillis();
        int tempoFinalA = tempoFinal - tempoInicial;
        System.out.println(tempoFinalA);

        FatorialService b = new FatorialRecursivoServiceImpl();


    }
//TODO criar um metodo que dado um valor inicial e uma taxa de juros ao ano calcule o valor final.
}
