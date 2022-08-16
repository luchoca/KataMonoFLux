package io.pivotal.literx;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

    // TODO Return an empty Flux
    Flux<String> emptyFlux() {
        Flux<String> empty = Flux.empty();
        return empty;
    }

//========================================================================================

    // TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
    Flux<String> fooBarFluxFromValues() {
        Flux<String> fromValues = Flux.just("foo", "bar");
        return fromValues;
    }

//========================================================================================

    // TODO Create a Flux from a List that contains 2 values "foo" and "bar"
    Flux<String> fooBarFluxFromList() {
        List<String> lista = Arrays.asList("foo", "bar");
        Flux<String> stringFlux = Flux.fromIterable(lista);
        return stringFlux;
    }

//========================================================================================

    // TODO Create a Flux that emits an IllegalStateException
    Flux<String> errorFlux() {

        Flux<String> errorFlux = Flux.error(new IllegalStateException("ERROR PAPA"));
        return errorFlux;
    }

//========================================================================================

    // TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
    Flux<Long> counter() {

        Flux<Long> rangeFlux = Flux.interval(Duration.ofMillis(100)).take(10);
        return rangeFlux;
    }

}
