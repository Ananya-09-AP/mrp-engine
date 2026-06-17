package com.mrp_engine.service;

import com.mrp_engine.entity.BomLink;
import com.mrp_engine.repository.BomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BomService {
    private final BomRepository bomRepository;

    public BomLink save(BomLink bomLink){
        return bomRepository.save(bomLink);
    }

    public List<BomLink> findAll(){
        return bomRepository.findAll();
    }

    public BomLink findById(Long id){
        return bomRepository.findById(id).orElseThrow(() -> new RuntimeException("BOM Not Found"));
    }

    public void delete(Long id){
        bomRepository.deleteById(id);
    }
}
