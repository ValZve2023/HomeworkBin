package ru.skypro.HomeworkBin.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.HomeworkBin.service.ShoppingCart;
import ru.skypro.HomeworkBin.service.StoreService;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService {
    private final ShoppingCart shoppingCart;

    public StoreServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Integer> add(List<Integer> goods) {
        return shoppingCart.add(goods);
    }

    @Override
    public List<Integer> get() {
        return shoppingCart.get();
    }
}
