import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        int sumEven = IntStream.of(numbers)
                .filter(x -> x % 2 == 0)
                .map(i -> i * i)
                .sum();
        return sumEven;
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        int[] odd = IntStream.of(numbers)
                .filter(x -> x % 2 != 0)
                .sorted()
                .toArray();
        return odd;
    }
}

