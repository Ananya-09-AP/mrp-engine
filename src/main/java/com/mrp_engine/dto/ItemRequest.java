package com.mrp_engine.dto;

import com.mrp_engine.entity.ItemType;
import lombok.Data;

@Data
public class ItemRequest {
    private String name;
    private ItemType type;
}
