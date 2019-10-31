import school.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Teacher pier = new Teacher("Pier", "Donini", "PDO");
        Teacher marc = new Teacher("Marc", "Dikötter", "MDK");

        Student john    = new Student("John", "Lennon", 1234);
        Student paul    = new Student("Paul", "Mc Cartney", 2341);
        Student ringo   = new Student("Ringo", "Starr", 3412);
        Student george  = new Student("George", "Harisson", 4321);
        Student roger   = new Student("Roger", "Waters", 1324);
        Student david   = new Student("David", "Gilmour", 4312);

        Group il61 = new Group(6, "IL", 1, john, paul, ringo, george);
        Group ts61 = new Group(6, "TS", 1, roger, david);

        Lesson poo1 = new Lesson(pier, "POO1", 2, 3, 90, "G02");
        Lesson pls  = new Lesson(marc, "PLP", 3, 3, 135, "H01");

        il61.definirLecon(poo1,pls);
        ts61.definirLecon(poo1);

        Person[] persons = {pier, marc, john, paul, ringo, george, roger, david};

        System.out.println("-- Membres de l'école --");
        for(Person p : persons){
            System.out.println(p);
        }

        System.out.println("\n"+il61.horaire());


    }
}
