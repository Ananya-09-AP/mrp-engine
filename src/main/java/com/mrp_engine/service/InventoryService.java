package com.mrp_engine.service;

import com.mrp_engine.entity.InventoryStatus;
import com.mrp_engine.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryStatus save(
            InventoryStatus inventoryStatus){

        return inventoryRepository.save(inventoryStatus);
    }

    public List<InventoryStatus> findAll(){
        return inventoryRepository.findAll();
    }

    public InventoryStatus findById(Long id){
        return inventoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Inventory Not Found"));
    }

    public void delete(Long id){
        inventoryRepository.deleteById(id);
    }

}
