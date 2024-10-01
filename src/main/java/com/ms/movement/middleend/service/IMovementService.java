package com.ms.movement.middleend.service;

import com.ms.movement.middleend.domain.Movement;

public interface IMovementService {
    Movement createMovement(Movement movement);
    Movement movementById(Integer id);
}
