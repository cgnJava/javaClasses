package com.cognitran.classes.topic1;

public class StringConcatenationExample
{
    public static void main(String[] args)
    {
        int tenMilions = 10_000_000;
        String[] array = {"Ala", " ma", " kota"};
        //-----------------------------------------------------------
        long time = System.currentTimeMillis();
        for (int i = 0; i < tenMilions; i++)
        {
            String result = "";
            for (String element : array)
            {
                result += element;
            }
        }
        System.out.println(System.currentTimeMillis() - time);

        //-----------------------------------------------------------
        time = System.currentTimeMillis();
        for (int i = 0; i < tenMilions; i++)
        {
            StringBuilder builder = new StringBuilder();
            for (String element : array)
            {
                builder.append(element);
            }
            String result = builder.toString();
        }
        System.out.println(System.currentTimeMillis() - time);

        //-----------------------------------------------------------
        time = System.currentTimeMillis();
        for (int i = 0; i < tenMilions; i++)
        {
            String x = " ma";
            String sql = "ala " + x + "kota";
        }
        System.out.println(System.currentTimeMillis() - time);
        //-----------------------------------------------------------

        String x = " ma";
        String result = "ala" + x + " kota"; //to zostanie zamienione na: new StringBuilder("ala").append(x).append(" kota");
        System.out.println(result);
    }
}
