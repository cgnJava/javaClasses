package com.cognitran.classes.topic6;

import java.io.File;
import java.io.FilenameFilter;

public class DirList
{
    public static void main(String[] args)
    {
        File path = new File(".");
        String[] list = path.list(new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name)
            {
                return !name.startsWith(".");
            }
        });
        for (String file : list)
        {
            System.out.println(file);
        }
    }
}
