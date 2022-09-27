package co.com.bancolombia.redis.template;

import co.com.bancolombia.model.message.gateways.MessageRepository;
import co.com.bancolombia.redis.template.helper.ReactiveTemplateAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.stereotype.Component;

@Component
public class ReactiveRedisTemplateAdapter extends ReactiveTemplateAdapterOperations<String, String, String>
        implements MessageRepository
{
    public ReactiveRedisTemplateAdapter(ReactiveRedisConnectionFactory connectionFactory, ObjectMapper mapper) {
        super(connectionFactory, mapper, d -> mapper.map(d, String.class));
    }
}
