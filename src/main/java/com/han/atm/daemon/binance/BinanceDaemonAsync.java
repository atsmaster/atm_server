package com.han.atm.daemon.binance;

import com.binance.connector.futures.client.impl.UMFuturesClientImpl;
import com.binance.connector.futures.client.impl.UMWebsocketClientImpl;
import com.han.atm.config.cache.CacheService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BinanceDaemonAsync {
    private static final Logger logger = LoggerFactory.getLogger(BinanceDaemonAsync.class);

    private final UMFuturesClientImpl client;

    private final CacheService cacheService;
    @Async("binanceAsyncExecutor")
    public void refreshListenKey() {
        logger.info("Daemon 실행 : refreshListenKey");
        while(true) {
            try {
                Thread.sleep(3000000l); // 50분
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            client.userData().extendListenKey();
            logger.info("Binance Refesh ListenKey");
        }
    }

    @Async("binanceAsyncExecutor")
    public void saveOrderStream() {
        logger.info("Daemon 실행 : saveOrderStream");
        UMWebsocketClientImpl client = new UMWebsocketClientImpl();
        client.listenUserStream(cacheService.getBinaceFutureListenKey(), ((event) -> {
            logger.info(event);
        }));

        while (true){}
    }
}
