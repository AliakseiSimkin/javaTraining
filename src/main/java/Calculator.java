/**
 * Created by Aliaksei_Simkin on 6/21/2017.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Type operation. The following characters in round brackets are allowed: (+ - * / )");
        String operation = reader.readLine();

        System.out.println("Type first number:");
        double number1 = Double.parseDouble(reader.readLine());
        System.out.println("Type second number:");
        double number2 = Double.parseDouble(reader.readLine());

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
                answer = number1 / number2;
                System.out.println(answer);
                break;
        }
        System.out.println("Thanks for using. Calculator is down");
    }
}