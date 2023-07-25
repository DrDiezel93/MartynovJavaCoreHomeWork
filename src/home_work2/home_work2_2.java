package home_work2;

public class home_work2_2 {

    public static void main(String[] args) {
        String str = "Murmansk";
        String rts = caesar(str, 1, true);
        System.out.println(rts);
        String str2 = caesar(rts, 1, false);
        System.out.println(str2);
    }

    private static String caesar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty()) //поверка на наличия слова для шифрования
            return null;

        final int len = in.length(); // задается длина слова
        char[] out = new char[len]; // создается массив символов длиной как слово
        for (int i = 0; i < len; ++i) { // проходим по каждому символу
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key)); // тернарный оператор
        }
        /*
        если encrypt = true, сдвиг символа вправо (шифрование в данном примере)
        если encrypt = false, сдвиг символа влево (расшифровка в данном примере)
        и наоборот...
         */
        return new String(out); // собираем массив символов в строку
    }

}
