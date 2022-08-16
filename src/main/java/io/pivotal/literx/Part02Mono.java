package io.pivotal.literx;

import reactor.core.publisher.Mono;

/**
 * Learn how to create Mono instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html">Mono Javadoc</a>
 */
public class Part02Mono {

//========================================================================================

    // TODO Return an empty Mono
    Mono<String> emptyMono() {
        Mono<String> emptyMono = Mono.empty();
        return emptyMono;
    }

//========================================================================================

    // TODO Return a Mono that never emits any signal
    Mono<String> monoWithNoSignal() {

        Mono<String> neverMono = Mono.never();

        return neverMono;
    }

//========================================================================================

    // TODO Return a Mono that contains a "foo" value
    Mono<String> fooMono() {

        Mono<String> justMono = Mono.just("foo");
        return justMono;
    }

//========================================================================================

    // TODO Create a Mono that emits an IllegalStateException
    Mono<String> errorMono() {
//        Mono<String> errorMono = Mono.error(new IllegalStateException("ERROR PAPAAAA"));
        Mono<String> errorMono = Mono.error(IllegalStateException::new);

        return errorMono;
    }

}
