package com.example.geladeria.service;

import com.example.geladeria.model.Food;
import com.example.geladeria.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    //listar todos os dados que tem no banco de dados
    public List<Food> getAll() {return foodRepository.findAll();}
    //criar no banco de dados
    public Food save(Food food){return foodRepository.save(food);};
    //Deletar um item no banco de dados
    public void delete(long id){foodRepository.deleteById(id);};
}
