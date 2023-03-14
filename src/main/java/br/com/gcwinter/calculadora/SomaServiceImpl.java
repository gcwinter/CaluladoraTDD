package br.com.gcwinter.calculadora;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
