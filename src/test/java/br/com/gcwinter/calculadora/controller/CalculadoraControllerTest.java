package br.com.gcwinter.calculadora.controller;

import br.com.gcwinter.calculadora.controller.CalculadoraController;
import br.com.gcwinter.calculadora.services.*;
import br.com.gcwinter.calculadora.services.impl.CalculoMalucoServiceImpl;
import br.com.gcwinter.calculadora.services.impl.FatorialServiceRecursivoImpl;
import br.com.gcwinter.calculadora.services.impl.FibonacciServiceImpl;
import br.com.gcwinter.calculadora.services.impl.SomaServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraControllerTest {


    private final CalculadoraController controller;

    CalculadoraControllerTest() {
        SomaService somaService = new SomaServiceImpl();
        FatorialService fatorialService = new FatorialServiceRecursivoImpl();
        FibonacciService fibonacciService = new FibonacciServiceImpl();
        CalculoMalucoService calculoMalucoService = new CalculoMalucoServiceImpl(somaService,fatorialService,fibonacciService);
        this.controller = new CalculadoraController(somaService, fatorialService, fibonacciService, calculoMalucoService);
    }


    @Test
    void testaSoma() {
        assertEquals(3, controller.soma(1, 2));
        assertEquals(5, controller.soma(2, 3));
        assertEquals(510, controller.soma(255, 255));
    }

    @Test
    void testaFatorialDeZero() {

        assertEquals(1, controller.fatorial(0));
    }

    @Test
    void testaFatorialDeUm() {
        assertEquals(1, controller.fatorial(1));
    }

    @Test
    void testaFatorialDeDois() {

        assertEquals(2, controller.fatorial(2));
    }

    @Test
    void testaFatorialDeTres() {

        assertEquals(6, controller.fatorial(3));
    }

    @Test
    void testaFatorialDeSete() {

        assertEquals(5040, controller.fatorial(7));
    }

    @Test
    void testafibonacciDeZero() {

        assertEquals("1", controller.fibonacci(0));
    }

    @Test
    void testafibonacciDeUm() {

        assertEquals("1,1", controller.fibonacci(1));
    }

    @Test
    void testafibonacciDeDois() {

        assertEquals("1,1,2", controller.fibonacci(2));
    }

    @Test
    void testafibonacciDeSeis() {
        assertEquals("1,1,2,3,5,8,13", controller.fibonacci(6));
    }

    @Test
    void testafibonacciDeNove() {
        assertEquals("1,1,2,3,5,8,13,21,34,55", controller.fibonacci(9));
    }

    @Test
    void testaCalculoComZero() {
        assertEquals(2, controller.getFatorialSomaAlgarismosFibonacciSomaFibonacci(0));
    }

    @Test
    void testaCalculoComtres() {
        //TODO  dado o fatorial entre 0 e 10, soma de cada um dos numeros do fatorial, fibonacci da soma dos algarismos do fatorial.
        assertEquals(33, controller.getFatorialSomaAlgarismosFibonacciSomaFibonacci(3));
    }
    @Test
    void testaCalculoComOnze() {

        assertEquals(-1, controller.getFatorialSomaAlgarismosFibonacciSomaFibonacci(11));
    }
    @Test
    void testaCalculoComMenosUm() {

        assertEquals(-1, controller.getFatorialSomaAlgarismosFibonacciSomaFibonacci(-1));
    }



}