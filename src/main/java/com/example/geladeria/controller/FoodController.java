package com.example.geladeria.controller;

import com.example.geladeria.model.Food;
import com.example.geladeria.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/food")
public class FoodController {
    //injecao de dependencia
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    //@Autowired
    private final FoodService foodService;

    @GetMapping
    public List<Food> getAll() {return foodService.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food){return foodService.save(food);}
}
