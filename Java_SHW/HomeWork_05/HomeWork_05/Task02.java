package HomeWork_05;
/*Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        HashMap<String, String> db = new HashMap<>();
        HashMap<String, Integer> res = new HashMap<>();
        List<String> ll = new ArrayList<>(
                Arrays.asList("Иван", "Анна", "Светлана", "Кристина", "Пётр", "Павел", "Мария"));
        db.put("Иванов", "Иван");
        db.put("Петрова", "Светлана");
        db.put("Белова", "Кристина");
        db.put("Мусина", "Анна");
        db.put("Крутова", "Анна");
        db.put("Юрин", "Иван");
        db.put("Лыков", "Пётр");
        db.put("Чернов", "Павел");
        db.put("Чернышов", "Пётр");
        db.put("Федорова", "Мария");
        db.put("Светлова", "Мария");
        db.put("Савина", "Мария");
        db.put("Рыкова ", "Мария");
        db.put("Лугова ", "Марина");
        db.put("Владимирова ", "Анна");
        db.put("Мечников", "Иван");
        db.put("Петин", "Пётр");
        db.put("Ежов", "Иван");

        for (String item_1 : ll) {
            int count = 0;
            for (var item_2 : db.entrySet()) {
                if (item_2.getValue().equals(item_1)) {
                    count++;
                    res.put(item_2.getValue(), count);
                }
            }
        }
        for (var item : res.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
            // Сортировка по популярности:
        }
        ArrayList<Integer> pop_name = new ArrayList<>(res.values());
        pop_name.sort(Comparator.reverseOrder());
        System.out.println("Список по популярности имён: ");
        for (Integer item : pop_name) {
            System.out.println(item);
        }
        // Сортировка с помощью LinkedHashMap:
        Map<String, Integer> res_pop = new HashMap<>();
        for (var item : res.entrySet()) {
            res_pop.put(item.getKey(), item.getValue());
        }
        res_pop = sortByValues(res_pop);
        System.out.println("Sorted map by values: " + res_pop);
        for (var item : res_pop.entrySet()) {
            System.out.println("Имя: " + item.getKey() + "  " + "встречается у:  " + item.getValue());
        }
    }

    public static <K, V extends Comparable> Map<K, V> sortByValues(Map<K, V> map) {
        // создаем список записей карты и сортируем их по значениям
        List<Map.Entry<K, V>> mappings = new ArrayList<>(map.entrySet());
        Collections.sort(mappings, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        // создаем пустой `LinkedHashMap` с порядком вставки`
        Map<K, V> linkedHashMap = new LinkedHashMap<>();

        // для каждой записи карты в отсортированном списке вставляем пару ключ-значение
        // в `LinkedHashMap`
        for (Map.Entry<K, V> entry : mappings) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
