package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.SomaService;

import java.util.List;


public class SomaServiceImpl implements SomaService {


    @Override
    public int soma(List<Integer> valores) {
        int somatoria = 0;
        for (int i = 0; i < valores.size(); i++) {
            somatoria += valores.get(i);

        }

        return somatoria;
    }
}
