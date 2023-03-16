package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.FatorialService;
import br.com.gcwinter.calculadora.services.impl.FatorialServiceRecursivoImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatorialServiceRecursivoImplTest {
    private final FatorialService fatorialService;

    FatorialServiceRecursivoImplTest() {
        this.fatorialService = new FatorialServiceRecursivoImpl();
    }

    @Test
    void testaFatorialDeZero() {

        assertEquals(1, fatorialService.fatorial(0));
    }

    @Test
    void testaFatorialDeUm() {
        assertEquals(1, fatorialService.fatorial(1));
    }

    @Test
    void testaFatorialDeDois() {

        assertEquals(2, fatorialService.fatorial(2));
    }

    @Test
    void testaFatorialDeTres() {

        assertEquals(6, fatorialService.fatorial(3));
    }

    @Test
    void testaFatorialDeSete() {

        assertEquals(5040, fatorialService.fatorial(7));
    }
}