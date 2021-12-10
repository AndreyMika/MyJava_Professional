package task01;

public class Animal implements Comparable<Object> {
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    // поиск по: скорости (если же скорость у 2-х объектов равна, то ищем по цене) -> цене - > вес -> тип.
    @Override
    public int compareTo(Object o) {
        int reference_value = this.speed - ((Animal) o).speed;

        if (reference_value == 0) {
            reference_value = this.price - ((Animal) o).price;
            if (reference_value == 0) {
                reference_value = this.weight - ((Animal) o).weight;
                if (reference_value == 0) {
                    reference_value = this.breed.compareTo(((Animal) o).breed);
                }
            }
        }
        return reference_value;
    }

}
