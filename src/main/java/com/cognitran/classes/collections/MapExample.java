package com.cognitran.classes.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample
{
    public static void main(String[] args)
    {
        List<City> cities = Arrays.asList(
                        new City(1, "Warszawa"),
                        new City(2, "Szczecin"));

        List<Person> users = Arrays.asList(
                        new Person(1, "Leszek", "Opania", 1),
                        new Person(2, "Lukasz", "Piepior", 2));

        Map<Integer, String> cityMap = new HashMap<>();
        for (City city : cities)
        {
            cityMap.put(city.getId(), city.getName());
        }
        for (Person user : users)
        {
            user.setCityName(cityMap.get(user.getCityId()));
        }

        System.out.println(users.get(0).getCityName());
        System.out.println(users.get(1).getCityName());
    }
}
