package lesson_6;

public class CreateArrayOfPersons {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov", "Ivan", "Engineer", "text@mail.ru",
                "899007654", 300.60, 30);
        persArray[1] = new Person("Smirnov", "Fedor", "Doctor", "test2@mail.ru",
                "890898080", 400.5, 32);
        persArray[2] = new Person("Fedorova", "Anna", "Teacher", "anna@gmail.ru",
                "787079090", 343.0, 28);
        persArray[3] = new Person("Petrov", "Petr", "Chemist", "test3@tut.by",
                "890899990", 342.3, 26);
        persArray[4] = new Person("Abramovich", "Kate", "Biologist", "tets5@mail.ru",
                "8908778900", 234.7, 27);
        //распечатываем массив пользователей:
        for (Person person : persArray) {
            System.out.println(person);
        }
        //создаем и распечатывыем одного пользователя:
        Person person1 = new Person("Ivanova", "Anna", "Scientist", "test@edu.by",
                "21799800099", 463.5, 32);
        Person.printInformationAboutPerson(person1);
    }
}
