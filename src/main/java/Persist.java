import java.util.Arrays;

public class Persist {
    static int persistence(int num) {
        if (num < 10) return 0;

        String[] digitString = String.valueOf(num).split("");
        int product = product(digitString);

        return product < 10 ? 1 : 1 + persistence(product);
    }

    private static int product(String[] numStr) {
        return Arrays.asList(numStr).stream().
            mapToInt(Integer::parseInt).
            reduce(1, Math::multiplyExact);
    }
}
