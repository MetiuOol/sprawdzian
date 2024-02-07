package pl.kurs.ex1.models;


public class Student extends Person {

    private String group;
    private double scholarship;

    public Student(String name, String secondName, String personalIdentificationNumber, String city, String group, double scholarship) {
        super(name, secondName, personalIdentificationNumber, city);
        this.group = group;
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }
}
