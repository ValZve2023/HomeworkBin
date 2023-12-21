package ru.skypro.HomeworkBin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.HomeworkBin.service.StoreService;

import java.util.List;

@RequestMapping(value = "order")
@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("add")
    public List<Integer> add(@RequestParam("goods") List<Integer> goods) {
        return storeService.add(goods);
    }
    @GetMapping("get")
    public List<Integer> get() {
        return storeService.get();
    }
}