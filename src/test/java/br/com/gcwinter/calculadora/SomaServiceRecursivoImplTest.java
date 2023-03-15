package br.com.gcwinter.calculadora;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SomaServiceRecursivoImplTest {
    private final SomaService somaService;

    SomaServiceRecursivoImplTest() {

        this.somaService = new SomaServiceRecursivoImpl();
    }

    @Test
    void testarSomaZero() {


        assertEquals(0, somaService.soma(List.of(0, 0, 0, 0)));

    }

    @Test
    void testarSomaTres() {


        assertEquals(3, somaService.soma(List.of(1, 2, 0, 0)));
    }
    @Test
    void testarSomaQuatro() {


        assertEquals(10, somaService.soma(List.of(0, 1, 2, 3,4)));
    }

}