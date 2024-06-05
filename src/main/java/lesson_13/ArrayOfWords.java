package lesson_13;

import java.util.*;

public class ArrayOfWords {
    public static void main(String[] args) {
        String[] arrayOfFruits = {"lime", "strawberry", "apple", "Apple", "pear", "mango", "banana",
                "cherry", "kiwi", "banana", "orange", "peach", "pineapple", "coconut", "grape"};
        //вывести список уникальных слов:
        Set<String> listOfUniqueNamesOfFruits = new LinkedHashSet<>();
        Collections.addAll(listOfUniqueNamesOfFruits, arrayOfFruits);
        System.out.println(listOfUniqueNamesOfFruits);
        //вывести список всех слов:
        List<String> listOfAllFruits = new ArrayList<>();
        Collections.addAll(listOfAllFruits, arrayOfFruits);
        System.out.println(listOfAllFruits);
        //посчитать сколько раз встречается каждое слово:
        for (int i = 0; i < listOfAllFruits.size(); i++) {
            System.out.println(listOfAllFruits.get(i) + " is repeated "
                    + Collections.frequency(listOfAllFruits, listOfAllFruits.get(i)) + " times");
        }
    }
}
