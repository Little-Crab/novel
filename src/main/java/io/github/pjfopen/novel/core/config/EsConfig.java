package io.github.pjfopen.novel.core.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.client.RestClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * className: EsConfig
 * description:  elasticsearch 相关配置
 *
 * @author pjf
 * date: 2022/6/2
 **/
@Configuration
@ConditionalOnProperty(prefix = "spring.elasticsearch", name = "enable", havingValue = "true")
@RequiredArgsConstructor
public class EsConfig {

    @Bean
    public ElasticsearchClient elasticsearchClient(RestClient restClient) {

        // Create the transport with a Jackson mapper
        ElasticsearchTransport transport = new RestClientTransport(
                restClient, new JacksonJsonpMapper());

        // And create the API client
        return new ElasticsearchClient(transport);
    }
}