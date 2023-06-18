package com.han.atm.batter;

import com.binance.connector.futures.client.impl.UMFuturesClientImpl;
import com.han.atm.batter.dto.BatterGroupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/batter")
@RequiredArgsConstructor
public class BatterController {

    private final BatterService batterService;

//    private final UMFuturesClient uMFuturesClient;

    private final UMFuturesClientImpl uMFuturesClientImpl;

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
        uMFuturesClientImpl.account().newOrder(null);
        return null;
    }
}
