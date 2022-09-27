package co.com.bancolombia.api;

import co.com.bancolombia.usecase.publishmessage.PublishMessageUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private final PublishMessageUseCase publishMessageUseCase;

    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {
        return ServerResponse.ok().body(publishMessageUseCase.publish("Hello"), Long.class);
    }
}
