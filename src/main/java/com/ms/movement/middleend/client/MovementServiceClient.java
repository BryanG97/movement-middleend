package com.ms.movement.middleend.client;

import com.ms.movement.middleend.domain.Movement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient( name = "movement-service")
public interface MovementServiceClient {

    @PostMapping("/api/v1/movements")
    ResponseEntity<Movement> createMovement(@RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
                                            @RequestHeader(value = "x-sw-client-request-Type", required = true) String xSwClientRequestType,
                                            @RequestBody Movement movement);

    @GetMapping("/api/v1/movements/{id}")
    ResponseEntity<List<Movement>> getMovements(@RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
                                                @RequestHeader(value = "x-sw-client-request-Type", required = true) String xSwClientRequestType,
                                                @PathVariable String id);

}
