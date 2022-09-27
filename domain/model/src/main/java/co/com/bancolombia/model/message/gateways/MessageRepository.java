package co.com.bancolombia.model.message.gateways;

import reactor.core.publisher.Mono;

public interface MessageRepository {

    Mono<Long> publish(String destination, String message);
}
