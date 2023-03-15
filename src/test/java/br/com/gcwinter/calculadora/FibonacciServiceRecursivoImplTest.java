package br.com.gcwinter.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciServiceRecursivoImplTest {

    private final FibonacciService fibonacciService;


    FibonacciServiceRecursivoImplTest() {
        this.fibonacciService = new FibonacciServiceRecursivoImpl();
    }

    @Test
    void testafibonacciDeZero() {

        assertEquals("1", fibonacciService.fibonacci(0));
    }

    @Test
    void testafibonacciDeUm() {

        assertEquals("1,1", fibonacciService.fibonacci(1));
    }

    @Test
    void testafibonacciDeDois() {

        assertEquals("1,1,2", fibonacciService.fibonacci(2));
    }

    @Test
    void testafibonacciDeSeis() {

        assertEquals("1,1,2,3,5,8,13", fibonacciService.fibonacci(6));
    }

    @Test
    void testafibonacciDeNove() {

        assertEquals("1,1,2,3,5,8,13,21,34,55", fibonacciService.fibonacci(9));
    }
}