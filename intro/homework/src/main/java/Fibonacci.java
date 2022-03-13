public class Fibonacci {
    public static void main(String[] args) {

    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    int initial = 0;
    int next = initial++;
    int sum = 0;

    int fib(int input) {
        for (int i = 0; i < input; i++) {
            sum = initial + next;
            initial = next;
            next = sum;
        }

        return sum;
    }
}
