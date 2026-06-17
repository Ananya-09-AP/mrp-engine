package com.mrp_engine.dto;

import com.mrp_engine.entity.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ItemResponse {
    private Long id;
    private String name;
    private ItemType type;
}
