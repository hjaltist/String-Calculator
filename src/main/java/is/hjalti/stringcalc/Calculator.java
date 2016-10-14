package is.hjalti.stringcalc;

import java.util.ArrayList;

public class Calculator {

    public static int add(String number) {
        if (number.isEmpty()) return 0;

        if (number.contains(",") || number.contains("\n")) {
            String[] numbers = number.split(",|\n");
            int[] parsedNumbers = new int [numbers.length];
            ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();

            for (int i = 0; i < numbers.length; i++) {
                parsedNumbers[i] = Integer.parseInt(numbers[i]);
                if (parsedNumbers[i] < 0) {
                    negativeNumbers.add(parsedNumbers[i]);
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