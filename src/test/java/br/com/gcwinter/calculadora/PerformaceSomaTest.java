package br.com.gcwinter.calculadora;

import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

class PerformaceSomaTest {

    private SomaService somaService = new SomaServiceImpl();
    private SomaService somaServiceRecursivo = new SomaServiceRecursivoImpl();
    private SomaService somaServiceStream = new SomaServiceStreamImpl();

    private StopWatch stopWatch = new StopWatch();

    @Test
    void testarPerformaceSoma() {
        List<Integer> valores = IntStream.range(0, 9_999_999).boxed().toList();
        stopWatch.start();
        somaService.soma(valores);
        stopWatch.stop();
        assertThat(stopWatch.getTotalTimeMillis()).isBetween(0L, 1000L);
    }

    @Test
    void testarPerformaceSomaRecursivo() {
        List<Integer> valores = IntStream.range(0, 6000).boxed().toList();
        stopWatch.start();
        somaServiceRecursivo.soma(valores);
        stopWatch.stop();
        assertThat(stopWatch.getTotalTimeMillis()).isBetween(0L, 1000L);
    }

    @Test
    void testarPerformaceSomaStream() {
        List<Integer> valores = IntStream.range(0, 9_999_999).boxed().toList();
        stopWatch.start();
        somaServiceStream.soma(valores);
        stopWatch.stop();
        assertThat(stopWatch.getTotalTimeMillis()).isBetween(0L, 1000L);

    }
}
