package com.cognitran.classes.collections;

public class City
{
    private Integer id;
    private String name;
    
    public City()
    {
        super();
    }

    public City(int id, String name)
    {
        this.id = Integer.valueOf(id);
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
