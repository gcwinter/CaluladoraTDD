package br.com.gcwinter.calculadora.performace;

import br.com.gcwinter.calculadora.services.FatorialService;
import br.com.gcwinter.calculadora.services.impl.FatorialServiceImpl;
import br.com.gcwinter.calculadora.services.impl.FatorialServiceRecursivoImpl;
import br.com.gcwinter.calculadora.services.impl.FatorialServiceStreamImpl;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import static org.assertj.core.api.Assertions.assertThat;

class PerformaceFatorialTest {

    private FatorialService fatorialService = new FatorialServiceImpl();
    private FatorialService fatorialServiceRecursivo = new FatorialServiceRecursivoImpl();
    private FatorialService fatorialServiceStream = new FatorialServiceStreamImpl();
    private StopWatch stopWatch = new StopWatch();

    @Test
    void testarPerformace() {

        stopWatch.start();
        fatorialService.fatorial(99_999_999);
        stopWatch.stop();
        assertThat(stopWatch.getTotalTimeMillis()).isBetween(0L, 10000L);
    }

    @Test
    void testarPerformaceRecursivo() {

        stopWatch.start();
        fatorialServiceRecursivo.fatorial(9_999);
        stopWatch.stop();
        assertThat(stopWatch.getTotalTimeMillis()).isBetween(0L, 10000L);
    }

    @Test
    void testarPerformaceStream() {

        stopWatch.start();
        fatorialServiceStream.fatorial(5_999_999);
        stopWatch.stop();
        assertThat(stopWatch.getTotalTimeMillis()).isBetween(0L, 1000L);

    }
}
