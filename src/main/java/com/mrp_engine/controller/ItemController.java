package com.mrp_engine.controller;

import com.mrp_engine.entity.Item;
import com.mrp_engine.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor

public class ItemController {
    private final ItemService itemService;

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.save(item);
    }


    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable Long id) {
        itemService.delete(id);
        return "Item Deleted Successfully";
    }

    @GetMapping
    public List<Item> getAllItems(){
        return itemService.findAll();
    }

    @GetMapping("/{id}")
    public Item getItemId(@PathVariable Long id){
        return itemService.findById(id);
    }
}