package company;

import java.util.*;

public class Convertor {

    private final static LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    private static HashMap<String, Integer> RomeNumbers = new HashMap<String, Integer>();


    static {
        RomeNumbers.put("I", 1);
        RomeNumbers.put("II", 2);
        RomeNumbers.put("III", 3);
        RomeNumbers.put("IV", 4);
        RomeNumbers.put("V", 5);
        RomeNumbers.put("VI", 6);
        RomeNumbers.put("VII", 7);
        RomeNumbers.put("VIII", 8);
        RomeNumbers.put("IX", 9);
        RomeNumbers.put("X", 10);
    }


    public static String ArabicToRoman(int number) {

        String inRome = "";

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (number >= entry.getKey()) {
                inRome += entry.getValue();
                number -= entry.getKey();
            }

        }
        return inRome;
    }


    public static int RomanToArabic(String num) {
        return RomeNumbers.get(num);
    }


}