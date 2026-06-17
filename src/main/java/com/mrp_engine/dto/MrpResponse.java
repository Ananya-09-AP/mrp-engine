package com.mrp_engine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MrpResponse {
    private String itemName;
    private Integer requiredQuantity;
    private Integer availableStock;
    private Integer netRequirement;
}
