package br.com.gcwinter.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoViniTest {
    private final CalculoVini calculoVini;

    CalculoViniTest() {
        SomaService somaService = new SomaServiceImpl();
        FatorialService fatorialService = new FatorialRecursivoServiceImpl();
        FibonacciService fibonacciService = new FibonacciServiceImpl();
        this.calculoVini = new CalculoVini(somaService, fatorialService, fibonacciService);
    }

    @Test
    void testaCalculoComtres() {
        //TODO  dado o fatorial entre 0 e 10, soma de cada um dos numeros do fatorial, fibonacci da soma dos algarismos do fatorial.
        assertEquals(33, calculoVini.metodo(3));
    }

    @Test
    void testaCalculoComOnze() {

        assertEquals(-1, calculoVini.metodo(11));
    }

    @Test
    void testaCalculoComMenosUm() {

        assertEquals(-1, calculoVini.metodo(-1));
    }


}