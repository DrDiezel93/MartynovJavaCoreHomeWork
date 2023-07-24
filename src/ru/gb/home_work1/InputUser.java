package ru.gb.home_work1;

import java.util.Scanner;

public class InputUser {
    public static String inputUserStr(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        String str = in.nextLine();
        in.close();
        return str;
    }
}
