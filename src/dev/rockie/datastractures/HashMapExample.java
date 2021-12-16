package dev.rockie.datastractures;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 123456);
        phonebook.put("Jill", 78901);
        phonebook.put("Brenda", 123123);

        // HashMaps do not allow to have a double entries with the same key

        if(phonebook.containsKey("Brenda")) {
            phonebook.remove("Brenda");
        }

//        phonebook.clear();

        System.out.println(phonebook);
    }
}
