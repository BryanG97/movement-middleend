package com.msf.movement_middleend.controller;

import com.msf.movement_middleend.domain.Movement;
import com.msf.movement_middleend.service.IMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movement")
@RequiredArgsConstructor
public class MovementController {

    private final IMovementService iMovementService;

    @PostMapping()
    @CrossOrigin
    public ResponseEntity<Movement> createMovement(@RequestBody Movement movement) {
        return new ResponseEntity<>(iMovementService.createMovement(movement), HttpStatus.CREATED);
    }

    @GetMapping()
    @CrossOrigin
    public ResponseEntity<Movement> movementById(@PathVariable  Integer id) {
        return new ResponseEntity<>(iMovementService.movementById(id), HttpStatus.CREATED);
    }

}
