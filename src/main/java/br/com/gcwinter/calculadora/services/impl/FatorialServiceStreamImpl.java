package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.FatorialService;

import java.util.stream.IntStream;

public class FatorialServiceStreamImpl implements FatorialService {
    @Override
    public int fatorial(int numero) {

        return IntStream
                 .range(1, numero + 1)
                 .reduce(1, (a, b) -> a*b);


    }
}
