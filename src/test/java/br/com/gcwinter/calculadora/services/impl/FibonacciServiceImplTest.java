package br.com.gcwinter.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciServiceImplTest {

    private final FibonacciService fibonacciService;


    FibonacciServiceImplTest() {
        this.fibonacciService = new FibonacciServiceImpl();
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
    @Test
    void testafibonacciDeVinteECinco() {

        assertEquals("1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393", fibonacciService.fibonacci(25));
    }

}