package com.msf.movement_middleend.service.impl;

import com.msf.movement_middleend.client.MovementServiceClient;
import com.msf.movement_middleend.domain.Movement;
import com.msf.movement_middleend.service.IMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovementServiceImpl implements IMovementService {

    private final MovementServiceClient movementServiceClient;


    @Override
    public Movement createMovement(Movement movement) {
        return movementServiceClient
                .createMovement("asd","asd", movement).getBody();
    }

    @Override
    public Movement movementById(Integer id) {
        return movementServiceClient
                .movementById("asd","asd", id).getBody();
    }
}
