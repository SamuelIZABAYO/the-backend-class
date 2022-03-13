public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(100);
    }

    static void fizzBuzz(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.println(calculate(i));
        }
    }

    static String calculate(int number) {
        if (number% 5 == 0 && number % 3 == 0) {
            return "fizzbuzz";
        }
        if(number % 3 == 0) {
            return "fizz";
        }
        if(number % 5 == 0) {
            return "buzz";
        }
        return Integer.toString(number);
    }

}