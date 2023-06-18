package com.han.atm.config;

import com.binance.connector.futures.client.impl.UMFuturesClientImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileReader;
import java.io.IOException;

@Configuration
public class BinanceConfig {


    @Value("${binance.future.api-key-path}")
    private String apiKeyPath;

    @Bean
    public UMFuturesClientImpl uMFuturesClientImpl() throws IOException {
        try(FileReader fileReader = new FileReader(apiKeyPath)){

        }
        UMFuturesClientImpl client = new UMFuturesClientImpl();

        return client;
    }

}
