package com.han.atm.daemon.binance;

import com.binance.connector.futures.client.impl.UMFuturesClientImpl;
import com.google.gson.Gson;
import com.han.atm.config.cache.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Component
@RequiredArgsConstructor
public class BinanceDaemonRunner {
    private final CacheService cacheService;

    private final UMFuturesClientImpl client;

    private final BinanceDaemonAsync binanceDaemonAsync;

    @PostConstruct
    private void initialize() {
        initializeListenKey();
        asyncDaemonStart();
    }

    private void initializeListenKey() {
        Gson gson = new Gson();
        HashMap response = gson.fromJson(client.userData().createListenKey(), HashMap.class);
        String listenKey =  response.get("listenKey").toString();
        cacheService.setBinaceFutureListenKey(listenKey);
    }
    private void asyncDaemonStart(){
        binanceDaemonAsync.refreshListenKey();
        binanceDaemonAsync.saveOrderStream();
    }

}
