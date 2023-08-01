package home_work5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork5_2 {
    public static void main(String[] args) throws IOException {
        int[] ar2 = {0,1,2,3,0,1,2,3,0};
        FileOutputStream fos = new FileOutputStream("TestFile.txt");
        for (int i: ar2){
            fos.write(i);
        }
        fos.flush();
        fos.close();

        int[] arrTest = loadFieldFromFile("TestFile.txt");
        printGameField(arrTest);
    }

    public static int[] loadFieldFromFile(String file) throws IOException {
        int[] field = new int[9];
        try (FileInputStream inputStream = new FileInputStream(file)) {
            for (int i = 0; i < field.length; i++) {
                int value = inputStream.read();
                field[i] = value;
            }
        }
        return field;
    }

    public static void printGameField(int[] field) {
        char[] symbols = {' ', 'x', 'o', '.'};
        for (int i = 0; i < field.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(symbols[field[i]]);
            System.out.print(' ');
        }
    }
}
