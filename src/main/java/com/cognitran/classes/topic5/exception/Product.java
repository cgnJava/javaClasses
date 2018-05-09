package com.cognitran.classes.topic5.exception;

public class Product
{
    private String name;
    private double price;
    private ProductType category;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public ProductType getCategory()
    {
        return category;
    }

    public void setCategory(ProductType category)
    {
        this.category = category;
    }
}
