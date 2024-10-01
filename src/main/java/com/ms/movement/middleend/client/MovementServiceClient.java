package com.ms.movement.middleend.client;

import com.ms.movement.middleend.domain.Movement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient( name = "movement-service")
public interface MovementServiceClient {

    @PostMapping("/api/v1/movements")
    ResponseEntity<Movement> createMovement(@RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
                                            @RequestHeader(value = "x-sw-client-user-agent", required = true) String xSwClientUserAgent,
                                            @RequestBody Movement movement);

    @GetMapping("/api/v1/movements")
    ResponseEntity<Movement> movementById(@RequestParam Integer accountId,
                                          @RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
                                          @RequestHeader(value = "x-sw-client-user-agent", required = true) String xSwClientUserAgent
                                          );

}
