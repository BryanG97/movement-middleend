package com.ms.movement.middleend.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class Movement {
    private Integer id;
    private String typeMovement ;
    private BigDecimal amount;
    private Integer accountId;
    private OffsetDateTime createdDate;
    private OffsetDateTime modifiedDate;
    private  Boolean deleted = false;
}
