package com.mrp_engine.controller;

import com.mrp_engine.entity.BomLink;
import com.mrp_engine.repository.BomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/bom")
@RequiredArgsConstructor
public class BomController {
    private final BomRepository bomRepository;

    @PostMapping
    public BomLink createBom(@RequestBody BomLink bomLink){
        return bomRepository.save(bomLink);
    }

    @GetMapping
    public List<BomLink> getAllBomLink(){
        return bomRepository.findAll();
    }

    @GetMapping("/{id}")
    public BomLink getBomById(@PathVariable Long id){
        return bomRepository.findById(id).orElseThrow(() -> new RuntimeException("BOM Not Found"));
    }

    @DeleteMapping("/{id}")
    public String deleteBom(@PathVariable Long id){
        bomRepository.deleteById(id);
        return "BOM Deleted Successfully";


    }
}
