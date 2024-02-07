package pl.kurs.ex1.models;

public class Employee extends Person {

    private String workplace;
    private double salary;

    public Employee(String name, String secondName, String personalIdentificationNumber, String city, String workplace, double salary) {
        super(name, secondName, personalIdentificationNumber, city);
        this.workplace = workplace;
        this.salary = salary;
    }

    @Override
    public double getIncome() {
        return salary;
    }
}
