package ex2.app;

import ex2.models.Figura;
import ex2.models.Kolo;
import ex2.models.Kwadrat;

import java.util.Arrays;
import java.util.List;

public class Ex2Runner {

    public static void main(String[] args) {
        List<Figura> figury = Arrays.asList(Figura.stworzKwadrat(10), Figura.stworzKolo(20), Figura.stworzProstokat(10, 20));
        for (Figura f : figury) {
            System.out.println(f);
        }


        najwiekszePole(figury);
        najwiekszeObwod(figury);
        System.out.println(figury.contains(new Kwadrat(10)));


    }

    static void najwiekszePole(List<Figura> figury) {
        if (!figury.isEmpty()) {
            Figura najwiekszePole = figury.get(1);
            for (Figura f : figury) {
                if (f != null && najwiekszePole.obliczPole() < f.obliczPole()) {
                    najwiekszePole = f;

                }


            }
            System.out.println("Figura z najwiekszym polem to: " + najwiekszePole);
        } else {
            System.out.println("Lista jest pusta i nie ma figury z najwiekszym polem");
        }
    }

    static void najwiekszeObwod(List<Figura> figury) {
        if (!figury.isEmpty()) {
            Figura najwiekszyObwod = figury.get(1);
            for (Figura f : figury) {
                if (f != null && najwiekszyObwod.obliczObwod() < f.obliczObwod()) {
                    najwiekszyObwod = f;

                }


            }
            System.out.println("Figura z najwiekszym obwodem to: " + najwiekszyObwod);
        } else {
            System.out.println("Lista jest pusta i nie ma figury z najwiekszym obwodem");
        }
    }

}

