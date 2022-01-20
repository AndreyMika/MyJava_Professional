/*
Создать 2 произвольных класса с полями и методами. Создать два потока.
*/
package task08;

public class Main {
    public static void main(String[] args) {
       OtherClass1 oc1 = new OtherClass1(1);
       OtherClass2 oc2 = new OtherClass2(2);

       oc1.start();
       oc2.start();
    }
}
