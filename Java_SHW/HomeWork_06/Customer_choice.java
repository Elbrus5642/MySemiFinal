package HomeWork_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Customer_choice {

    static Map<String, String> customer_choice() {
        HashMap<String, String> db = new HashMap<>();
        Scanner iScan = new Scanner(System.in);
        Integer count = 1;
        /* Выбор модели по 4 параметрам: DDR, HDD, OS и Color */
        while (count <= 4) {
            System.out.println("Сделайте выбор по параметрам: " + "\n");
            System.out.printf("DDR - %s , HDD - %s, OS - %s, Color -%s \n", 1, 2, 3, 4);
            count++;
            String choice = iScan.next();
            // System.out.println(choice);
            switch (choice) {
                case "1":
                    System.out.println("Input DDR: 8GB / 16GB / 32GB / 64GB / 128GB  : ");
                    String DDR_volume = iScan.next();
                    db.put("DDR", DDR_volume);
                    System.out.printf("Покупатель выбрал DDR: %s\n", db.get("DDR"));
                    // System.out.printf("Параметр DDR выбран!");
                    break;
                case "2":
                    System.out.println("Input HDD:  128 GB/ 256GB / 512GB / 1024GB/ 2048GB  : ");
                    String HDD_volume = iScan.next();
                    db.put("HDD", HDD_volume);
                    System.out.printf("Покупатель выбрал HDD: %s \n", db.get("HDD"));
                    // System.out.println("Параметр HDD выбран!");
                    break;
                case "3":
                    System.out.println("Input OS: Windows, Linux, Android, iOS");
                    String OS_ver = iScan.next();
                    db.put("OS", OS_ver);
                    System.out.printf("Покупатель выбрал OS: %s \n", db.get("OS"));
                    // System.out.println("Параметр OS выбран!");
                    break;
                case "4":
                    System.out.println("Input Color: Black, Red, Blue, Grey, Silver ");
                    String color = iScan.next();
                    db.put("Color", color);
                    System.out.printf("Покупатель выбрал Color: %s \n", db.get("Color"));
                    // System.out.println("Параметр Color выбран!");
                    break;
                default:
                    for (var item : db.entrySet()) {
                        System.out.printf(item.getKey(), item.getValue());
                    }
                    break;
            }
        }
        System.out.printf("Параметры выбора определены: %s, %s, %s, %s", db.get("DDR"), db.get("HDD"), db.get("OS"),
                db.get("Color"));
        iScan.close();
        return db;
    }

    public static void main(String[] args) {
        // БД моделей, note_Brand - ID модели для последующей фильтрации
        Laptop nt_1 = new Laptop("Toshiba", "8", "128", "Windows", "Red");
        Laptop nt_2 = new Laptop("Asus", "16", "256", "Linux", "Blue");
        Laptop nt_3 = new Laptop("Lenovo", "32", "512", "Android", "Black");
        Laptop nt_4 = new Laptop("MacAir", "64", "1024", "iOS", "Silver");
        Laptop nt_5 = new Laptop("Dell", "128", "2048", "Windows", "Grey");

        System.out.println(nt_1.customer_hello());
        HashSet<Laptop> set = new HashSet<>(Arrays.asList(nt_1, nt_2, nt_3, nt_4, nt_5));
        System.out.printf("Выбор возможен из: %d", set.size());
        System.out.println("\n");
        for (Laptop item : set) {
            System.out.println(item);
        }
        // Выбор параметров модели:
        Map<String, String> custom_nt = customer_choice();
        System.out.println("\n Переходим к сравнению параметров!");
        for (var param : custom_nt.entrySet()) {
            System.out.println(param);
        }
        // Фильтр для выбора подходящей модели
        TreeMap<String, Integer> tMap_nt = new TreeMap<>(); // Коллекция моделей (брендов) с баллами
        ArrayList<Integer> arr_1 = new ArrayList<>(); // Массив баллов: +1 при совпадении параметра выбора и модели в БД
        for (Laptop nt_b : set) {
            int grade = 0;
            if (Integer.parseInt(nt_b.getDDR()) > Integer.parseInt(custom_nt.get("DDR"))) {
                grade++;
            }
            if (Integer.parseInt(nt_b.getHDD()) > Integer.parseInt(custom_nt.get("HDD"))) {
                grade++;
            }
            if (nt_b.getOS().equals(custom_nt.get("OS"))) {
                grade++;
            }
            if (nt_b.getColor().equals(custom_nt.get("Color"))) {
                grade++;
            }
            // печать счётчика баллов
            arr_1.add(grade);
            //System.out.println(arr_1.toString());
            tMap_nt.put(nt_b.getBrand(), grade);
            //System.out.println(tMap_nt);
        }
        // ArrayList<Integer> arr_1 = new ArrayList<>(Arrays.asList(3, 3, 1, 0, 0));
        // TreeMap<String, Integer> tMap_nt = new TreeMap<>();
        // tMap_nt.put("Toshiba", 3);
        // tMap_nt.put("Asus", 3);
        // tMap_nt.put("TLenovo", 1);
        // tMap_nt.put("MacAir", 0);
        // tMap_nt.put("Dell", 0);
        // System.out.println(arr_1);
        // System.out.println(tMap_nt);
        // System.out.println(Collections.max(arr_1, null));
        ArrayList<String> check = new ArrayList<>();
        
            for (var item : tMap_nt.entrySet()) {
                if (Collections.max(arr_1, null).equals(item.getValue())) {
                    System.out.println("Выбранным параметрам подходит: " + item.getKey());
                    check.add(item.getKey());
                    }
                    
                }
            for (Laptop nt_b : set) {
                for (int ind = 0; ind < check.size(); ind++) {
                    if (nt_b.getBrand().equals(check.get(ind))) {
                        System.out.println(nt_b);
                    }
                }
                
            } 
        
        if (check.size() > 1) {
            for (int index = 0; index < check.size(); index++) {
                System.out.printf("\nУточните параметры выбора: DDR, HDD, OS  и Color для: %s", check.get(index));
            }
        }
    }
}


