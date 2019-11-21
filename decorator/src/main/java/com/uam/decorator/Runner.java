package com.uam.decorator;

import com.uam.decorator.fastfood.Cheeseburger;
import com.uam.decorator.fastfood.Product;
import com.uam.decorator.fastfood.ProductWithExtraCheese;
import com.uam.decorator.fastfood.ProductWithExtraMeat;

public class Runner {

    public static void main(String[] args) {
        Product p1 = new Cheeseburger();
        Product p2 = new ProductWithExtraMeat(p1);
        Product p3 = new ProductWithExtraCheese(p2);
        Product p4 = new ProductWithExtraCheese(p3);
        System.out.println( p4.getCost());
        p4.describe();
    }
}
