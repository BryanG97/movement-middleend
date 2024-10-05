package com.ms.movement.middleend.service.impl;

import com.ms.movement.middleend.client.MovementServiceClient;
import com.ms.movement.middleend.domain.Movement;
import com.ms.movement.middleend.service.IMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovementServiceImpl implements IMovementService {

    private final MovementServiceClient movementServiceClient;

    @Override
    public Movement createMovement(Movement movement) {
        return movementServiceClient.createMovement("asd","asd",movement).getBody();
    }

    @Override
    public List<Movement> getMovements(String id) {
        return movementServiceClient
                .getMovements("asd","asd", id).getBody();
    }
}
