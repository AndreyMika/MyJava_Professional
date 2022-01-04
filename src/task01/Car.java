package task01;

public class Car implements Comparable<Object> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // поиск по: скорости (если же скорость у 2-х объектов равна, то ищем по цене) -> цене - > моделе -> цвету машины.
    @Override
    public int compareTo(Object o) {
        int reference_value = this.speed - ((Car) o).speed;

        if (reference_value == 0) {
            reference_value = this.price - ((Car) o).price;
            if (reference_value == 0) {
                reference_value = this.model.compareTo(((Car) o).model);
                if (reference_value == 0) {
                    reference_value = this.color.compareTo(((Car) o).color);
                }
            }
        }
        return reference_value;
    }

}
