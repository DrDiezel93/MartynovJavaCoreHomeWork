package ru.gb.home_work1;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileWrite {

    public static void FileWriter(String str){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try(FileWriter writer = new FileWriter("HomeWork1.txt", true))
        {
            writer.write(formatter.format(date) + " -> " + str);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
