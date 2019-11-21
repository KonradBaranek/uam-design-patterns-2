package com.uam.decorator.fastfood;

public class ProductWithExtraMeat implements Product{

    private final double extraCost;

    private final Product product;

    public ProductWithExtraMeat(Product product) {
        this.extraCost = 2.5;
        this.product = product;
    }

    public void describe() {
        System.out.println(" [extra meat] + "+extraCost);
        product.describe();
    }

    @Override
    public double getCost() {
        return product.getCost() + extraCost;
    }
}