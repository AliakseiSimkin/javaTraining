package javaTasks.task1_Calculator; /**
 Created by Aliaksei Simkin
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {
    public static void main (String[] args) throws IOException {

        System.out.println("Type first number:");
        double number1 = typeNumber();
        System.out.println("Type second number:");
        double number2 = typeNumber();

        System.out.println("Type operation. The following characters in round brackets are allowed: (+ - * / )");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String operation = reader.readLine();

        double answer;
        switch (operation) {
            case "+":
                answer = number1 + number2;
                System.out.println(answer);
                break;
            case "-":
                answer = number1 - number2;
                System.out.println(answer);
                break;
            case "*":
                answer = number1 * number2;
                System.out.println(answer);
                break;
            case "/":
                do {
                    if (number2 == 0 ) {
                        System.out.println("Division by 0 is forbidden. Please type value different from 0");
                        number2 = typeNumber();
                    }
                } while (number2 == 0);

                answer = number1 / number2;
                System.out.println(answer);
                break;
            default:
                System.out.println("Typed character does not match to any accessible symbols. Please type one of the following symbols: + - * / ");
        }
        System.out.println("Thanks for using. Calculator is down");
    }

    public static double typeNumber () {
        double number=0;
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {
            number = Double.parseDouble(reader.readLine());
        } catch (Exception e) {
            System.out.println("Incorrect data has been typed. ");
            //e.printStackTrace();
            System.out.println("Please try again with correct data");
            number = typeNumber();
        }
        return number;
    }
}