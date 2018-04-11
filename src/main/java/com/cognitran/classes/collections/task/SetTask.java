package com.cognitran.classes.collections.task;

import java.util.Arrays;
import java.util.List;

public class SetTask
{
    /**
     * Zwróć pierszy duplikat z tablicy używając HashSet, jeżeli nie ma duplikatu wzróć null
     */
    public String returnFirstDuplicate(String... array)
    {
        return null;
    }

    /**
     * Zwróć ostatni duplikat z tablicy używając HashSet, jeżeli nie ma duplikatu wzróć null
     */
    public String returnLastDuplicate(String... array)
    {
        return null;
    }

    /**
     * Policz ile różnych elementów znajduje się w tablicy przekazanej w parametrze (użyj java.util.HashSet)
     */
    public int countDistinct(Object... array)
    {
        return 0;
    }

    /**
     * Zaimplementuj odpowiednio metody hashCode() i equals() w klasie Wife.
     */
    public Wife findWifeByPesel(String pesel)
    {
        List<Wife> wifeList = Arrays.asList(
                        newWife("123", "Iwona", "Mazur", "Mazurska 12"),
                        newWife("124", "Halina", "Giewont", "Obotrycka 12"),
                        newWife("125", "Grażyna", "Witek", "Gryfitów 3"));

        Wife temp = new Wife();
        temp.setPesel(pesel);
        int indexOf = wifeList.indexOf(temp);
        if (indexOf != -1)
        {
            return wifeList.get(indexOf);
        }
        return null;
    }

    private Wife newWife(String pesel, String firstName, String surname, String address)
    {
        Wife wife = new Wife();
        wife.setPesel(pesel);
        wife.setFirstName(firstName);
        wife.setSurname(surname);
        wife.setAddress(address);
        return wife;
    }
}
