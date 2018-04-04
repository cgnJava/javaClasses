package com.cognitran.classes.collections;

public class Person
{
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer cityId;

    private String cityName;

    public Person()
    {
        super();
    }

    public Person(int id, String firstName, String lastName, int cityId)
    {
        this.id = Integer.valueOf(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.cityId = Integer.valueOf(cityId);
    }

    @Override
    public int hashCode()
    {
        return id == null ? 0 : id.hashCode();
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Integer getCityId()
    {
        return cityId;
    }

    public void setCityId(Integer cityId)
    {
        this.cityId = cityId;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }
}
