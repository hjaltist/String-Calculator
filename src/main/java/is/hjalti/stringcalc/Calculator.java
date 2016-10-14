package is.hjalti.stringcalc;

import java.util.ArrayList;

public class Calculator {

    public static int add(final String number) {
        String delimeter = ",|\n";

        if (number.startsWith("//")) {
            delimeter = number.substring(2, number.indexOf("\n"));
            String snippedNumber = number.substring(number.indexOf("\n") + 1);

            return add(snippedNumber, delimeter);
        }

        return add(number, delimeter);
    }

    public static int add(final String number, final String delimeter) {
        if (number.isEmpty()) return 0;

        if (number.contains(",") || number.contains("\n") || number.contains(delimeter)) {
            String[] numbers = number.split(delimeter);
            int[] parsedNumbers = new int [numbers.length];
            ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();

            for (int i = 0; i < numbers.length; i++) {
                parsedNumbers[i] = Integer.parseInt(numbers[i]);
                
                if (parsedNumbers[i] < 0) {
                    negativeNumbers.add(parsedNumbers[i]);
                }

                if (parsedNumbers[i] > 1000) {
                    parsedNumbers[i] = 0;
                }

            }

            int sum = 0;

            for (int i = 0; i < parsedNumbers.length; i++) {
                sum = sum + parsedNumbers[i];
            }

            if (negativeNumbers.size() > 0) {
                throw new IllegalArgumentException("Negatives not allowed: " 
                                    + negativeNumbers.toString());
            }

            return sum;
        } else {
            return Integer.parseInt(number);
        }
    }

}