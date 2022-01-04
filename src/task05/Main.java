/*
Создайте 2 класса, Animal и Cat.
В классе Animal инициализируйте 3 поля различных модификаторов.
В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое каждого из полей.
 */
package task05;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Cat cat = new Cat("Mammals", 4, "Tom", "Tomas");
        //cat.animal
    }
}
