import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persist {
    static int persistence(int num) {
        if (num < 10) return 0;

        String numStr = String.valueOf(num);
        List<String> characters = new ArrayList<>(Arrays.asList(numStr.split("")));

        int product = characters.size() > 1 ? 1 : 0;

        for (String character : characters) {
            product *= Integer.parseInt(character);
        }

        return product < 10 ? 1 : 1 + persistence(product);
    }
}
