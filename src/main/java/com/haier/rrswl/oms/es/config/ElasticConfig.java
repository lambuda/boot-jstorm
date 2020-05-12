package com.haier.rrswl.oms.es.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.impl.nio.reactor.IOReactorConfig;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: es配置
 * @author: 01437768
 * @create: 2020/05/09 10:23
 */
@Slf4j
@Configuration
public class ElasticConfig {


    @Value("${es.host}")
    private String esHost;
    @Value("${es.port}")
    private Integer esPort;
    @Value("${es.scheme}")
    private String esScheme;

    @Bean
    public RestHighLevelClient init() {
        RestClientBuilder restClientBuilder = RestClient.builder(new HttpHost(esHost, esPort, esScheme))
                .setRequestConfigCallback(requestConfigBuilder -> {
                    return requestConfigBuilder.setConnectTimeout(5000) // 连接超时（默认为1秒）
                            .setSocketTimeout(60000);// 套接字超时（默认为30秒）
                })
                // .setMaxRetryTimeoutMillis(60000)//调整最大重试超时时间（默认为30秒）
                .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
                    @Override
                    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
                        return httpClientBuilder
                                .setDefaultIOReactorConfig(IOReactorConfig.custom().setIoThreadCount(1).build());// 线程数
                    }
                });
        RestHighLevelClient client = new RestHighLevelClient(restClientBuilder);

        log.info("ElasticSearch 初始化完成!");
        return client;
    }
}
