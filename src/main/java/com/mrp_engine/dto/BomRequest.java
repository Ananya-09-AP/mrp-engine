package com.mrp_engine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class BomRequest {
    private Long parentItemId;
    private Long childItemId;
    private Integer quantityRequired;
}
