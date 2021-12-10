/*
В папке с примерами, ex_004_comparable.
Дописать логику, чтобы метод compareTo() осуществил
поиск по: скорости (если же скорость у 2-х объектов равна, то ищем по цене) -> цене - > вес -> тип.
*/
package task01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 17, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);
        Animal bird0 = new Animal("Penguin", 15, 8, 50000);

        Animal[] listAnimal = {cat, dog, bird, bird0};

        Arrays.sort(listAnimal);

        for (Animal indicator : listAnimal) {
            System.out.println(indicator);
        }
    }
}
