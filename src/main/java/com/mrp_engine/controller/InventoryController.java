package com.mrp_engine.controller;

import com.mrp_engine.entity.InventoryStatus;
import com.mrp_engine.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryRepository inventoryRepository;

    @PostMapping
    public InventoryStatus createInventory(@RequestBody InventoryStatus inventory){
        return inventoryRepository.save(inventory);
    }

    @GetMapping
    public List<InventoryStatus> getAllInventory(){
        return inventoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public InventoryStatus getInventoryById(@PathVariable Long id){
        return inventoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Inventory Not Found"));
    }

    @DeleteMapping("/{id}")
    public String deleteInventory(@PathVariable Long id){
        inventoryRepository.deleteById(id);
        return "Inventory Deleted Successfully";
    }
}
