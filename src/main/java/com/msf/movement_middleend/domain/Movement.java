package com.msf.movement_middleend.domain;

import lombok.Data;

@Data
public class Movement {

    private Integer id;

    private String typeMovement;

    private Double amount;

    private Integer accountId;

}
