package com.han.atm.batter;

import com.binance.connector.futures.client.impl.UMFuturesClientImpl;
import com.han.atm.batter.dto.BatterGroupDto;
import com.han.atm.config.cache.CacheService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/batter")
@RequiredArgsConstructor
public class BatterController {

    private final BatterService batterService;

    private final UMFuturesClientImpl client;

    private final CacheService cacheService;
    private static final Logger logger = LoggerFactory.getLogger(BatterController.class);
    @GetMapping("/group")
    public ResponseEntity<BatterGroupDto> findBatterGroup(@RequestBody BatterGroupDto request) {
        return ResponseEntity.ok().body(batterService.findBatterGroup(request));
    }

    @PostMapping("/group")
    public ResponseEntity<BatterGroupDto> createBatterGroup(@RequestBody BatterGroupDto request) {
        batterService.createBatterGroup(request);
        return null;
    }

    @GetMapping("/clientTest")
    public ResponseEntity<BatterGroupDto> clientTest(@RequestParam String testval) {

        String aa = cacheService.getBinaceFutureListenKey();

//        String result = client.userData().createListenKey();
//        logger.info(result);
        return null;
    }
}
