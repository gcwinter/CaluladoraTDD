package br.com.gcwinter.calculadora;

public class FatorialRecursivoServiceImpl implements FatorialService {
    @Override
    public int fatorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }
}
