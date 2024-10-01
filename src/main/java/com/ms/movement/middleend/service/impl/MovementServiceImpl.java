package com.ms.movement.middleend.service.impl;

import com.ms.movement.middleend.client.MovementServiceClient;
import com.ms.movement.middleend.domain.Movement;
import com.ms.movement.middleend.service.IMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovementServiceImpl implements IMovementService {

    private final MovementServiceClient movementServiceClient;

    @Override
    public Movement createMovement(Movement movement) {
        return movementServiceClient.createMovement("asd","asd",movement).getBody();
    }

    @Override
    public Movement movementById(Integer id) {
        return movementServiceClient.movementById(id,"asd","asd").getBody();
    }
}
