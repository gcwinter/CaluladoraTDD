package br.com.gcwinter.calculadora;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SomaServiceImplTest {

    private final SomaService somaService;

    SomaServiceImplTest() {

        this.somaService = new SomaServiceImpl();
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