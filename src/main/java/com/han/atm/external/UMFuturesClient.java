package com.han.atm.external;

import com.binance.connector.futures.client.impl.UMFuturesClientImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UMFuturesClient {

    private final UMFuturesClientImpl client;

    public UMFuturesClientImpl getClient() {
        return client;
    }
}
