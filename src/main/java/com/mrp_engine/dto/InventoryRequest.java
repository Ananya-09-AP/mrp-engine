package com.mrp_engine.dto;

import lombok.Data;

@Data
public class InventoryRequest {
    private Long itemId;
    private Integer onHandQuantity;
}
