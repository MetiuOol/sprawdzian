package pl.kurs.ex1.app;

import pl.kurs.ex1.models.Employee;
import pl.kurs.ex1.models.Person;
import pl.kurs.ex1.models.Sex;
import pl.kurs.ex1.models.Student;

public class Ex1Runner {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mateusz", "Wasinski", "87051508614", "Olesno", "boss", 25000.0);
        Employee e2 = new Employee("Jan", "Blukot", "92042701835", "Sowczyce", "waiter", 5000.0);
        Employee e3 = new Employee("Karolina", "Bator", "77013102123", "Opole", "manager", 8500.0);
        Employee e4 = new Employee("Malwina", "Kowalska", "90122701747", "Wroclaw", "programmer", 38500.0);
        Employee e5 = null;

        Student s1 = new Student("Jolanta", "Panek", "05273106146", "Lomnica", "pierwsza", 700.0);
        Student s2 = new Student("Patryk", "Sobota", "01221401256", "Brzeg", "druga", 0);
        Student s3 = new Student("Michal", "Nowak", "03241406176", "Nysa", "trzecia", 1500.0);
        Student s4 = new Student("Agata", "Lica", "02263006226", "Dobrodzien", "pierwsza", 2500);
        Person[] people = new Person[]{e1, e2, e3, e4, s1, s2, s3, s4, e5};
        System.out.println(e1.getSex());
        highestIncome(people);
        femaleCounter(people);


    }

    static void highestIncome(Person... people) {
        if (people.length != 0) {
            Person personWithHighestIncome = people[0];
            for (Person person : people) {
                if (person != null && personWithHighestIncome.getIncome() < person.getIncome()) {
                    personWithHighestIncome = person;

                }
            }
            System.out.println("Osoba z najwiekszym dochodem to " + personWithHighestIncome.toString() + " z dochodem w wysokosci " + personWithHighestIncome.getIncome() + " zlotych.");
        }

    }

    static void femaleCounter(Person... people) {
        int counter = 0;
        for (Person person : people) {
            if (person != null && person.getSex().equals(Sex.KOBIETA)) {
                counter++;
            }
        }
        System.out.println("W tablicy sa " + counter + " kobiety.");
    }


}
