package is.hjalti.stringcalc;

public class Calculator {

    public static int add(String number) {
        if (number.isEmpty()) return 0;

        if (number.contains(",") || number.contains("\n")) {
            String[] numbers = number.split(",|\n");
            int[] parsedNumbers = new int [numbers.length];
            
            for (int i = 0; i < numbers.length; i++) {
                parsedNumbers[i] = Integer.parseInt(numbers[i]);
            }

            int sum = 0;

            for (int i = 0; i < parsedNumbers.length; i++) {
                sum = sum + parsedNumbers[i];
            }

            return sum;
        } else {
            return Integer.parseInt(number);
        }
    }

}