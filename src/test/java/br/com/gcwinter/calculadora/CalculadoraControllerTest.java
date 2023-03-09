package br.com.gcwinter.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraControllerTest {
    @Test
    void testaSoma() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals(3, controller.soma(1, 2));
        assertEquals(5, controller.soma(2, 3));
        assertEquals(510, controller.soma(255, 255));

    }

    @Test
    void testaFatorialDeZero() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals(1, controller.fatorial(0));
    }

    @Test
    void testaFatorialDeUm() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals(1, controller.fatorial(1));
    }

    @Test
    void testaFatorialDeDois() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals(2, controller.fatorial(2));
    }

    @Test
    void testaFatorialDeTres() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals(6, controller.fatorial(3));
    }

    @Test
    void testaFatorialDeSete() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals(5040, controller.fatorial(7));
    }

    @Test
    void testafibonacciDeZero() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals("1", controller.fibonacci(0));
    }

    @Test
    void testafibonacciDeUm() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals("1,1", controller.fibonacci(1));
    }

    @Test
    void testafibonacciDeDois() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals("1,1,2", controller.fibonacci(2));
    }
    @Test
    void testafibonacciDeSeis() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals("1,1,2,3,5,8,13", controller.fibonacci(6));
    }
    @Test
    void testafibonacciDeNove() {
        CalculadoraController controller = new CalculadoraController();
        assertEquals("1,1,2,3,5,8,13,21,34,55", controller.fibonacci(9));
    }


}