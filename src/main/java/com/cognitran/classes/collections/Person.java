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

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id == null)
        {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "ID: " + id
                + ", firstname: " + firstName
                + ", LastName: " + lastName
                + ", cityId: " + cityId;
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
