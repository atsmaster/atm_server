package com.han.atm.config.cache;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CacheService {

    private String BINANCE_FUTURE_LISTEN_KEY = "";
    @Cacheable(cacheNames = "binanceStore")
    public String getBinaceFutureListenKey() {
        return BINANCE_FUTURE_LISTEN_KEY;
    }

    @CachePut(cacheNames = "binanceStore")
    public void setBinaceFutureListenKey(String value) {
        BINANCE_FUTURE_LISTEN_KEY = value;
    }
}
