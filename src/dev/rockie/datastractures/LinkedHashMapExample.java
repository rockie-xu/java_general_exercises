package dev.rockie.datastractures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f, true);
        phonebook.put("Kevin", 123456);
        phonebook.put("Jill", 78901);
        phonebook.put("Brenda", 123123);
        phonebook.put("Gary", 456456);
        System.out.println("Kevin phone number: " + phonebook.get("Kevin"));

        System.out.println("List of the contacts in the phonebook");

        for(Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
