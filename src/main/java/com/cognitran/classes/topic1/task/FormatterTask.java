package com.cognitran.classes.topic1.task;

public class FormatterTask
{
    /**
     * Napisz funkcję, która uzupełni liczbę zerami na początku w taki sposób aby długość zwracanego napisu była 10.
     * @param number
     * @return
     */
    public String format(int number)
    {
        StringBuilder builder = new StringBuilder();
        int x = 10 - ("" + number).length();
        for (int i = 0; i < x; i++)
        {
            builder.append('0');
        }
        builder.append(number);
        return builder.toString();
    }

    public String formatSolution2(int number)
    {
        StringBuilder builder = new StringBuilder();
        int x = 1;
        double num = number;
        while (num / 10 > 1.0)
        {
            num = num / 10;
            x++;
        }
        x = 10 - x;
        for (int i = 0; i < x; i++)
        {
            builder.append('0');
        }
        builder.append(number);
        return builder.toString();
    }

    /**
     * Złe bo długie.
     */
    public String formatSolution3(int number)
    {
        int x = ("" + number).length();
        switch (x)
        {
            case 9: return "0" + number;
            case 8: return "00" + number;
            case 7: return "000" + number;
            case 6: return "0000" + number;
            case 5: return "00000" + number;
            case 4: return "000000" + number;
            case 3: return "0000000" + number;
            case 2: return "00000000" + number;
            case 1: return "000000000" + number;
        }
        return "" + number;
    }
}
