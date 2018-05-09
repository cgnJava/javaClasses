package com.cognitran.classes.topic5.exception;

import java.util.Date;

public class Product
{
    private String name;
    private double price;
    private ProductType category;
    private Date since;

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

    public Date getSince()
    {
        return since;
    }

    public void setSince(Date since)
    {
        this.since = since;
    }
}
