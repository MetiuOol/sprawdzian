package pl.kurs.ex1.models;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String personalIdentificationNumber;
    private String city;


    public Person(String firstName, String lastName, String personalIdentificationNumber, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalIdentificationNumber = personalIdentificationNumber;
        this.city = city;
    }



    public abstract double getIncome();

    public Sex getSex(){
        Sex sex;
        if (personalIdentificationNumber.charAt(9) % 2 != 0) {
            sex = Sex.MEZCZYZNA;
        } else {
           sex = Sex.KOBIETA;
        }
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalIdentificationNumber='" + personalIdentificationNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
