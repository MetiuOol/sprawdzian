package pl.kurs.ex1.models;

public enum Sex {

    MEZCZYZNA("Mezczyzna"),
    KOBIETA("Kobieta");

    private final String description;

    Sex(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Sex{'" +
                  description + '\'' +
                '}';
    }
}
