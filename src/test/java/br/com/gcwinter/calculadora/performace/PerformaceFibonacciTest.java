package br.com.gcwinter.calculadora.performace;

import br.com.gcwinter.calculadora.services.FibonacciService;
import br.com.gcwinter.calculadora.services.impl.FibonacciServiceImpl;
import br.com.gcwinter.calculadora.services.impl.FibonacciServiceRecursivoImpl;
import br.com.gcwinter.calculadora.services.impl.FibonacciServiceStreamImpl;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import static org.assertj.core.api.Assertions.assertThat;

class PerformaceFibonacciTest {
    private FibonacciService fibonacciService = new FibonacciServiceImpl();
    private FibonacciService fibonacciServiceRecursivo = new FibonacciServiceRecursivoImpl();

    private FibonacciService fibonacciServiceStream = new FibonacciServiceStreamImpl();
    private StopWatch stopWatch = new StopWatch();

    @Test
    void testarPerformace() {

        stopWatch.start();
        fibonacciService.fibonacci(9_999);
        stopWatch.stop();
        assertThat(stopWatch.getTotalTimeMillis()).isBetween(0L, 10000L);
    }

    @Test
    void testarPerformaceRecursivo() {

        stopWatch.start();
        fibonacciServiceRecursivo.fibonacci(9_999);
        stopWatch.stop();
        assertThat(stopWatch.getTotalTimeMillis()).isBetween(0L, 10000L);
    }

    @Test
    void testarPerformaceStream() {

        stopWatch.start();
        fibonacciServiceStream.fibonacci(999_999);
        stopWatch.stop();
        assertThat(stopWatch.getTotalTimeMillis()).isBetween(0L, 1000L);

    }
}
