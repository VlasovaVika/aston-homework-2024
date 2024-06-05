package lesson_13;

import java.util.HashMap;
import java.util.Map;

public class SearchMethod {
    public static Map<String, String> searchPersonWithSurname(Map<String, String> phoneBook, String surname) {
        Map<String, String> listOfPersonWithSurname = new HashMap<>();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(surname)) {
                listOfPersonWithSurname.put(entry.getKey(), entry.getValue());
            }
        }
        return listOfPersonWithSurname;
    }
}
