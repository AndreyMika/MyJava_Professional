/*
Дописать логику, чтобы метод compareTo() осуществил поиск по
скорости(если же скорость у 2-х объектов равна, то ищем по цене) -> цене - > моделе -> цвету машины.
*/
package task01;

//import java.util.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        List<Car> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);

        Collections.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
