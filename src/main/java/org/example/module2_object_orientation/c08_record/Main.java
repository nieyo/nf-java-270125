package org.example.module2_object_orientation.c08_record;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Owner sega = new Owner("SEGA", 72, "Sumitomo Fudosan Osaki Garden Tower");

        Species hedgehog = new Species("hedgehog", 50.7); // Hedgehog
        Species dog = new Species("dog", 500.45);  // Dog
        Species monkey = new Species("monkey", 300.02); // Monkey

        Animal a1 = new Animal(1, "sonic", hedgehog, 16, sega);
        Animal a2 = new Animal(2, "Einstein", dog, 9, new Owner("Dr. Emmett Brown", 65, "1646 Riverside Drive"));
        Animal a3 = new Animal(2, "Abu", monkey, 5, new Owner("Aladdin", 10, "The Streets of Agrabah") );

        System.out.println(a1.equals(a1));
        System.out.println(a1.equals(a2));
        System.out.println(a1.toString());
        System.out.println(a2.toString());


        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);

        Zoo zoo = new Zoo(animalList);
        System.out.println(zoo.getFoodRequirement());

    }
}
