package lesson_13;

import java.util.HashMap;
import java.util.Map;

public class MainForPhoneBook {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        Map<String, String> newPhoneBook = new HashMap<>();
        pb.addPhoneAndSurname(newPhoneBook, "11-22-33", "Ivanov");
        pb.addPhoneAndSurname(newPhoneBook, "14-23-37", "Ivanov");
        pb.addPhoneAndSurname(newPhoneBook, "11-31-54", "Petrov");
        pb.addPhoneAndSurname(newPhoneBook, "17-55-33", "Sidorov");
        pb.addPhoneAndSurname(newPhoneBook, "67-22-38", "Kaspersky");
        System.out.println(pb.getPhones(newPhoneBook, "Ivanov"));
    }
}
