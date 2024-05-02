package lesson_6;

public class Person {
    private String surname;
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Person(String surname, String name, String position, String email, String phone, double salary, int age) {
        this.surname = surname;
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void printInformationAboutPerson(Person person){
        System.out.println(person);
    }
}
