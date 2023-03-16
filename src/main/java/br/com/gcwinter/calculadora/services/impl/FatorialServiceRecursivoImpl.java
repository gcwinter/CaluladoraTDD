package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.FatorialService;

public class FatorialServiceRecursivoImpl implements FatorialService {


    @Override
    public int fatorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }
}
