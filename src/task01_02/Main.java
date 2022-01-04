/*
Вывод на экран элементов List:
Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator
*/
package task01_02;

import java.io.*;
import java.util.*;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> al = new ArrayList<>();

        //Enter data
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream outputStream = System.out;
        Writer outputStreamReader = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamReader);

        while (al.size() < 10) {
            bufferedWriter.write("Enter:");
            bufferedWriter.flush();

            String textFromUser = null;
            try {
                textFromUser = bufferedReader.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Error in enter!!!");
                exit(0);
            }
            al.add(textFromUser);
        }

        bufferedReader.close();

        //--------------------------------------------------------

        //Show list
        ListIterator<String> listIterator = al.listIterator();

        while (listIterator.hasNext()) {
            String temp = listIterator.next();
            System.out.println(temp);
        }

    }
}
