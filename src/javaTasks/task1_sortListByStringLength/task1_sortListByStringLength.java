import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task1_sortListByStringLength {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Type number of strings which you want to place into your arrayList: ");
        int number = typeNumber();

        while (true) {
            if (number <= 0) {
                System.out.println("Number of strings must be more then 0. Please type again");
                number = Integer.parseInt(reader.readLine());
            } else break;
        }

        System.out.println("Populate your arrayList. Please type value for following string: ");
        for (int i = 0; i < number; i++) {
            System.out.println((i+1) + " string is ");
            list.add(reader.readLine());
        }

        String temporary;
        System.out.println("Sort your arrayList: ");
        if (list.size() == 1)
            System.out.println("You have only 1 string with " + list.get(0).length() + " length size");
        else {
            for (int i = list.size() - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (list.get(j).length() > list.get(j+1).length()) {
                        temporary = list.get(j);
                        list.add(j, list.get(j+1));
                        list.remove(j+1);
                        list.add(j+1, temporary);
                        list.remove(j+2);
                    }
                }
            }
        }
        for (int i=0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static int typeNumber () throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int number=0;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Incorrect data has been typed. ");
            System.out.println("Please try again with correct data");
            typeNumber();
        }
        return number;
    }
}