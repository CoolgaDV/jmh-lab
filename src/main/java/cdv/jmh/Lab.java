package cdv.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

/**
 * Utility class for micro benchmarking
 *
 * @author Dmitry Coolga
 *         20.12.2015
 */
public class Lab {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(Lab.class.getSimpleName())
                .threads(1)
                .warmupIterations(10)
                .measurementIterations(10)
                .timeUnit(TimeUnit.NANOSECONDS)
                .mode(Mode.AverageTime)
                .forks(1)
                .build();
        new Runner(opt).run();
    }

    /**
     * Sample no operation method benchmark
     */
    @Benchmark
    public void nop() {
    }

}
