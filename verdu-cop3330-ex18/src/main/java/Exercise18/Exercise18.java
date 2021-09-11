package Exercise18;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise18 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String Question1;
        String Answer1;

        System.out.println("Press C to convert from Fahrenheit to Celsius. \nPress F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String temperature = scanner.nextLine();

        Question1 = ((temperature.equals("C") || temperature.equals("c"))) ? "Please enter the temperature in Fahrenheit: ": "Please enter the temperature in Celsius: ";
        Answer1 =  ((temperature.equals("C") || temperature.equals("c"))) ? "The temperature in Celsius is ": "The temperature in Fahrenheit is ";

        System.out.print(Question1);
        String value = scanner.nextLine();

        double Value = Double.parseDouble(value);
        double Final = 0;



        if (temperature.equals("C") || temperature.equals("c")){
          Final = (Value - 32) * 5 / 9;
        }

        else if (temperature.equals("F") || temperature.equals("f")){
            Final = (Value * 9 / 5) + 32;
        }

        System.out.print(Answer1 + String.format("%.2f", Final) + ".");



    }

}
