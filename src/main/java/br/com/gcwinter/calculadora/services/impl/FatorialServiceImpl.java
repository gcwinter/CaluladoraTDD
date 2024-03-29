package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.FatorialService;
import org.springframework.stereotype.Service;

@Service
public class FatorialServiceImpl implements FatorialService {
    @Override
    public int fatorial(int numero) {
        int multiplicacao = 1;

        for (int i = 0; i < numero; i++) {
            multiplicacao = multiplicacao * (numero - i);
        }

        return multiplicacao;
    }
}
