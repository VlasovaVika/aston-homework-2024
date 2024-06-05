package lesson_13;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("11-22-33", "Ivanov");
        phoneBook.put("14-23-37", "Ivanov");
        phoneBook.put("11-31-54", "Petrov");
        phoneBook.put("17-55-33", "Sidorov");
        phoneBook.put("67-22-38", "Kaspersky");
        System.out.println(SearchMethod.searchPersonWithSurname(phoneBook,"Ivanov"));
    }
}
