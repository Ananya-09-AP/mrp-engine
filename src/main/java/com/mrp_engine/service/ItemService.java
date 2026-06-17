package com.mrp_engine.service;

import com.mrp_engine.entity.Item;
import com.mrp_engine.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public Item save(Item item){
        return itemRepository.save(item);
    }

    public List<Item> findAll(){
        return itemRepository.findAll();
    }

    public Item findById(Long id){
        return itemRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Item Not Found"));
    }

    public void delete(Long id){
        itemRepository.deleteById(id);
    }
}
