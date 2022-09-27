package co.com.bancolombia.usecase.publishmessage;

import co.com.bancolombia.model.message.gateways.MessageRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class PublishMessageUseCase {

    public static final String CHANNEL = "MY_CHANNEL";
    private final MessageRepository messageRepository;

    public Mono<Long> publish(String message) {
        return messageRepository.publish(CHANNEL, message);
    }
}
