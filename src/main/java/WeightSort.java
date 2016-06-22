import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeightSort {
    public static String orderWeight(String weights) {
        ArrayList<WeightedString> weightList = new ArrayList<>();
        for (String weight : weights.split(" ")) {
            weightList.add(new WeightedString(weight));
        }

        Collections.sort(weightList);

        return buildOutput(weightList);
    }

    private static String buildOutput(List<WeightedString> weights) {
        StringBuilder sb = new StringBuilder();
        for (WeightedString weight : weights) {
            sb.append(weight.weight);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}

class WeightedString implements Comparable {
    String weight;

    WeightedString(String weight) {
        this.weight = weight;
    }

    int weightedScore() {
        int sum = 0;
        for (int i = 0; i < weight.length(); i++) {
            sum += Integer.parseInt(weight.substring(i, i+1));
        }
        return sum;
    }

    public int compareTo(Object ws) {
        WeightedString comparison = (WeightedString) ws;

        if (this.weightedScore() == comparison.weightedScore()) {
            return this.weight.compareTo(comparison.weight);
        }

        return this.weightedScore() - comparison.weightedScore();
    }
}
