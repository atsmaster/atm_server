package com.han.atm.stream;

import com.binance.connector.futures.client.impl.UMWebsocketClientImpl;
import org.junit.jupiter.api.Test;

public class SimpleStreamTest {
    @Test
    void getOrderStream() throws InterruptedException {
        UMWebsocketClientImpl client = new UMWebsocketClientImpl();
        client.allForceOrderStream(((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
        Thread.sleep(1000000);
    }


    @Test
    void getStreamListenUser() throws InterruptedException {
        UMWebsocketClientImpl client = new UMWebsocketClientImpl();
        client.listenUserStream("", ((event) -> {
            System.out.println(event);
//            client.closeAllConnections();
        }));
        Thread.sleep(10000000);
    }
}
