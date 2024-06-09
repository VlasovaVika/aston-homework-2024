package lesson_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private String phone;
    private String surname;
    private Map<String, String> phoneBook = new HashMap<>();

    public void addPhoneAndSurname(Map<String, String> phoneBook, String phone, String surname) {
        phoneBook.put(phone, surname);
    }

    public List<String> getPhones(Map<String, String> phoneBook, String surname) {
        List<String> phones = new ArrayList<>();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(surname)) {
                phones.add(entry.getKey());
            }
        }
        return phones;
    }
}
