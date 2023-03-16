package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.SomaService;
import br.com.gcwinter.calculadora.services.impl.SomaServiceStreamImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SomaServiceStreamImplTest {
    private final SomaService somaService;

    SomaServiceStreamImplTest() {

        this.somaService = new SomaServiceStreamImpl();
    }

    @Test
    void testarSomaZero() {


        assertEquals(0, somaService.soma(List.of(0, 0, 0, 0)));

    }

    @Test
    void testarSomaTres() {


        assertEquals(3, somaService.soma(List.of(1, 2, 0, 0)));
    }

}