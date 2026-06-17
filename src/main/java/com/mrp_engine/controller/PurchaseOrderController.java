package com.mrp_engine.controller;

import com.mrp_engine.entity.PurchaseOrder;
import com.mrp_engine.repository.PurchaseOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchase-orders")
@RequiredArgsConstructor
public class PurchaseOrderController {
    private final PurchaseOrderRepository purchaseOrderRepository;

    @PostMapping
    public PurchaseOrder create(@RequestBody PurchaseOrder purchaseOrder){
        return purchaseOrderRepository.save(purchaseOrder);
    }

    @GetMapping
    public List<PurchaseOrder> getAll(){
        return purchaseOrderRepository.findAll();
    }

    @GetMapping("/{id}")
    public PurchaseOrder getById(@PathVariable Long id){
        return purchaseOrderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Purchase Order Not Found"));
    }
}
