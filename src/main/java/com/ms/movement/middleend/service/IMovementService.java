package com.ms.movement.middleend.service;

import com.ms.movement.middleend.domain.Movement;

import java.util.List;

public interface IMovementService {

    Movement createMovement(Movement movement);

    List<Movement> getMovements(String id);
}
