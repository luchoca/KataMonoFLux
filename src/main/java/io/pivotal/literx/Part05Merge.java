package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Learn how to merge flux.
 *
 * @author Sebastien Deleuze
 */
public class Part05Merge {

//========================================================================================

    // TODO Merge flux1 and flux2 values with interleave
    Flux<User> mergeFluxWithInterleave(Flux<User> flux1, Flux<User> flux2) {
        Flux<User> fluxMerge = Flux.merge(flux1, flux2);
        System.out.println(fluxMerge);
        return fluxMerge;
    }

//========================================================================================

    // TODO Merge flux1 and flux2 values with no interleave (flux1 values and then flux2 values)
    Flux<User> mergeFluxWithNoInterleave(Flux<User> flux1, Flux<User> flux2) {

        Flux<User> fluxMergeSequential = Flux.mergeSequential(flux1, flux2);
        System.out.println(fluxMergeSequential);

        return fluxMergeSequential;
    }

//========================================================================================

    // TODO Create a Flux containing the value of mono1 then the value of mono2
    Flux<User> createFluxFromMultipleMono(Mono<User> mono1, Mono<User> mono2) {

        Flux<User> mergeFLux = Flux.mergeSequential(mono1, mono2);
        return mergeFLux;
    }

}
