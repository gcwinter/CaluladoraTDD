package br.com.gcwinter.calculadora;

import java.util.List;

public class SomaServiceRecursivoImpl implements SomaService {
    @Override
    public int soma(List<Integer> valores) {
        if (valores.isEmpty()) {
            return 0;
        }
        Integer primeiroValor = valores.get(0);
        List<Integer> listaSemOPrimeiroValor = valores.subList(1, valores.size());
        Integer proximoValor = soma(listaSemOPrimeiroValor);
        return primeiroValor + proximoValor;
    }
}
