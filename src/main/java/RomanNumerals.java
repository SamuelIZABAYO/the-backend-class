public class RomanNumerals {

    public int romanToInteger(String roman) {

        int number = 0;
        for (int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);
            switch (c) {
                case 'I':
                    number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'V' || roman.charAt(i + 1) == 'X'))
                            ? number - 1
                            : number + 1;
                    break;
                case 'V':
                    number += 5;
                    break;
                case 'X':
                    number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'L' || roman.charAt(i + 1) == 'C'))
                            ? number - 10
                            : number + 10;
                    break;
                case 'L':
                    number += 50;
                    break;
                case 'C':
                    number = (i != roman.length() - 1 && (roman.charAt(i + 1) == 'D' || roman.charAt(i + 1) == 'M'))
                            ? number - 100
                            : number + 100;
                    break;
                case 'D':
                    number += 500;
                    break;
                case 'M':
                    number += 1000;
                    break;
            }
        }

        return number;
    }

    public String integerToRoman(int integ) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            int numberInPlace = integ / values[i];
            if (numberInPlace == 0) continue;
            result.append(numberInPlace == 4 && i > 0 ? roman[i] + roman[i - 1] :
                    new String(new char[numberInPlace]).replace("\0", roman[i]));
            integ = integ % values[i];
        }
        return result.toString();

    }

    public int sum(String num1, String num2) {
        return romanToInteger(num1) + romanToInteger(num2);
    }

    public int difference(String num1, String num2) {
        return romanToInteger(num1) - romanToInteger(num2);
    }

    public int product(String num1, String num2) {
        return romanToInteger(num1) * romanToInteger(num2);
    }

    public int quotient(String num1, String num2) {
        int number1 = romanToInteger(num1);
        int number2 = romanToInteger(num2);
        if (number2 == 0) {
            throw new RuntimeException("You cannot divide zero");
        }
        return number1 / number2;
    }
}

