package br.com.gcwinter.calculadora;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class FatorialServiceStreamImpl implements FatorialService{
    @Override
    public int fatorial(int numero) {
        //TODO inicia
        //TODO 1 2 3 4 5 ( 6 )
        //TODO acumulador = 1, primeiro elemento * segundo elemento

        return IntStream
                 .range(1, numero + 1)
                 .reduce(1, (a, b) -> a*b);


    }
}
