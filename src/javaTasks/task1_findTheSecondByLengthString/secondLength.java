package javaTasks.task1_findTheSecondByLengthString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by BloodyPoSTaL on 11.07.2017.
 */
public class secondLength {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();

        for (int i=0; i < 6; i++)
            list.add(reader.readLine());
        int max=0;
        int almostMax=0;
        String temporaryString = null;
        int number=0;

        for (int i = 0; i < list.size(); i ++) {
            if (max < list.get(i).length()) {
                max = list.get(i).length();
                number = i;
                temporaryString = list.get(i);
            }
        }

        list.remove(number);

        for (int i = 0; i < list.size(); i ++) {
            if (almostMax < list.get(i).length())
                almostMax = list.get(i).length();
        }

        list.add(number, temporaryString);

        System.out.println("Max string length is " + max);
        System.out.println("almostMax string length is " + almostMax);

        System.out.println("Original array: ");
        for (int i=0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}