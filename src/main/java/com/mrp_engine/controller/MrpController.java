package com.mrp_engine.controller;

import com.mrp_engine.service.MrpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.mrp_engine.service.MrpService;
import java.util.Map;

@RestController
@RequestMapping("/api/mrp")

public class MrpController {
    private final MrpService mrpService;

    public MrpController(MrpService mrpService) {
        this.mrpService = mrpService;
    }

    @GetMapping("/explode")
    public Map<String,Integer> explodeBom(
            @RequestParam Long productId,
            @RequestParam Integer quantity){

        return mrpService.explodeBom(
                productId,
                quantity
        );
    }
}
