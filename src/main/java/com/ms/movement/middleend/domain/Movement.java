package com.ms.movement.middleend.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class Movement {

    private Integer id;

    private String typeMovement ;

    private Double amount;

    private Integer accountId;

}
