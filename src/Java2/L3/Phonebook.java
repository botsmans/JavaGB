package Java2.L3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, ArrayList<Integer>> phonebookMap = new HashMap<>();

    public void add(String secondName, Integer telephoneNumber) {

        if (phonebookMap.get(secondName) == null) {
            phonebookMap.put(secondName, new ArrayList<Integer>());
            phonebookMap.get(secondName).add(telephoneNumber);
        } else {
            phonebookMap.get(secondName).add(telephoneNumber);
        }
    }

    public void get(String secondName){
        System.out.println(phonebookMap.get(secondName));
    }

}

