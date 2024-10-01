package com.ms.movement.middleend.controller;

import com.ms.movement.middleend.domain.Movement;
import com.ms.movement.middleend.service.IMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movements")
@RequiredArgsConstructor
public class MovementController {
    private final IMovementService iMovementService;

    @PostMapping()
    @CrossOrigin
    public ResponseEntity<Movement> createMovement(@RequestBody Movement movement) {
        return new ResponseEntity<>(iMovementService.createMovement(movement), HttpStatus.CREATED);
    }

    @GetMapping
    @CrossOrigin
    public ResponseEntity<Movement> getMovements(
            @RequestParam Integer accountId) {

        Movement movements = iMovementService.movementById(accountId);
        if (movements == null ) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(movements, HttpStatus.OK);
    }


}
