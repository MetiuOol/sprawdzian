package ex2.models;


import ex2.sevices.Ksztalt;


public abstract class Figura implements Ksztalt {

    private static int counter = 0;
    private int numerFigury;

    protected Figura() {
        this.numerFigury = ++counter;
    }


    public static Kolo stworzKolo(int srednica) {
        return new Kolo((srednica / 2));
    }

    public static Kwadrat stworzKwadrat(int bok) {
        return new Kwadrat(bok);

    }
    public static Prostokat stworzProstokat(int bokA, int bokB) {
        return new Prostokat(bokA, bokB);

    }


    @Override
    public String toString() {
        return "Figura nr " + numerFigury  + ":";
    }
}
