/*
Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
1. Создать список строк.
2. Ввести строки с клавиатуры и добавить их в список.
3. Вводить с клавиатуры строки, пока пользователь не введёт строку "end". "end" не учитывать.
4. Вывести строки на экран, каждую с новой строки.
*/
package task02;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String value = "";
            while (!value.equals("end")) {
                System.out.println("Enter data: ");
                value = reader.readLine();
                myList.add(value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            for (String tmp : myList) {
                writer.write(tmp + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
