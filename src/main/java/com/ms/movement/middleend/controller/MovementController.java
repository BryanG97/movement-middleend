package com.ms.movement.middleend.controller;

import com.ms.movement.middleend.domain.Movement;
import com.ms.movement.middleend.service.IMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<List<Movement>> getMovements(@PathVariable String id) {
        List<Movement> accountsMovements = iMovementService.getMovements(id);
        if (accountsMovements == null ) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(accountsMovements, HttpStatus.OK);
    }


}
