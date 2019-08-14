package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String[]> list = new HashMap<>();
        list.put("Тепло", new String[]{"Лео", "не холодно", "жар", "горячо"});
        list.put("Дом", new String[]{"Хата", "Убежище", "зона комфорта",});
            System.out.println("Введите слово");
            String w = scanner.nextLine();
            Set<Map.Entry<String, String[]>> entries = list.entrySet();
            for (Map.Entry<String, String[]> e : entries) {
                if (w.equals(e.getKey())) {
                    List<String> synonim = Arrays.asList(list.get(w));
                    Collections.shuffle(synonim);

                    System.out.println("___________________________");
                    System.out.println("Синоним к слову " + w + ":");
                    for (String s1 : synonim) {
                        System.out.println(s1);

                    }
                }
            }
            for (Map.Entry<String, String[]> entry : entries) {
                for (String s : entry.getValue()) {
                    if (w.equals(s)) {
                        System.out.println("___________________________");
                        System.out.println("Синоноим к слову " + w + ":");
                        System.out.println(entry.getKey());
                        for (String t : entry.getValue()) {
                            System.out.println(t);
                        }
                    }
                }
            }
            Map<String, String[]> stringMap = new HashMap<>();
            for (Map.Entry<String, String[]> entry : entries) {
                String key = entry.getKey();
                String[] value = entry.getValue();
                for (int i = 0; i < value.length; i++) {
                    String synonymous = value[i];
                    String[] value2 = new String[value.length];
                    for (int i2 = 0; i2 < value.length; i2++) {
                        String valueor = value[i2];
                        if (valueor.equals(synonymous)) {
                            value2[i2] = key;
                        } else {
                            value2[i2] = valueor;
                        }
                    }
                    stringMap.put(synonymous, value2);
                }

            }


    }
}
