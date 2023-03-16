package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.*;
import br.com.gcwinter.calculadora.services.impl.CalculoMalucoServiceImpl;
import br.com.gcwinter.calculadora.services.impl.FatorialServiceRecursivoImpl;
import br.com.gcwinter.calculadora.services.impl.FibonacciServiceImpl;
import br.com.gcwinter.calculadora.services.impl.SomaServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculoMalucoServiceImplTest {
    private final CalculoMalucoServiceImpl calculoMalucoServiceImpl;

    CalculoMalucoServiceImplTest() {
        SomaService somaService = new SomaServiceImpl();
        FatorialService fatorialService = new FatorialServiceRecursivoImpl();
        FibonacciService fibonacciService = new FibonacciServiceImpl();
        this.calculoMalucoServiceImpl = new CalculoMalucoServiceImpl(somaService, fatorialService, fibonacciService);
    }

    @Test
    void testaCalculoComtres() {
        //TODO  dado o fatorial entre 0 e 10, soma de cada um dos numeros do fatorial, fibonacci da soma dos algarismos do fatorial.
        assertEquals(33, calculoMalucoServiceImpl.get(3));
    }

    @Test
    void testaCalculoComOnze() {

        assertEquals(-1, calculoMalucoServiceImpl.get(11));
    }

    @Test
    void testaCalculoComMenosUm() {

        assertEquals(-1, calculoMalucoServiceImpl.get(-1));
    }


}