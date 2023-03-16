package br.com.gcwinter.calculadora.services.impl;

import br.com.gcwinter.calculadora.services.SomaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomaServiceStreamImpl implements SomaService {

    @Override
    public int soma(List<Integer> valores) {
        return valores.stream().mapToInt(Integer::intValue).sum();

    }
}
