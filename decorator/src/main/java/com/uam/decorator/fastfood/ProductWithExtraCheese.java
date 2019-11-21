package com.uam.decorator.fastfood;

public class ProductWithExtraCheese implements Product {

    private final double extraCost;

    private final Product product;

    public ProductWithExtraCheese(Product product) {
        this.extraCost = 0.5;
        this.product = product;
    }

    public void describe() {
        System.out.println(" [extra cheese] + " + extraCost);
        product.describe();
    }

    @Override
    public double getCost() {
        return product.getCost() + extraCost;
    }
}