import java.util.*;

public class Rainfall {
    public static double mean(String town, String data) {
        Map<String, List<Double>> cityTemps = temperaturesByCity(data);
        List<Double> temps = cityTemps.get(town);
        if (temps == null) return -1;

        return computeMean(temps);
    }

    public static double variance(String town, String data) {
        Map<String, List<Double>> cityTemps = temperaturesByCity(data);
        List<Double> temps = cityTemps.get(town);
        if (temps == null) return -1;

        Double mean = computeMean(temps);

        List<Double> squaredDifferences = new ArrayList<>();
        for (Double temp : temps) {
            squaredDifferences.add(Math.pow(temp - mean, 2));
        }

        return computeMean(squaredDifferences);
    }

    private static double computeMean(List<Double> list) {
        return list.stream().reduce(0d, (a,b) -> a + b) / list.size();
    }

    private static String[] parseIntoLines(String data) {
        return data.split("\n");
    }

    private static Map<String, List<Double>> temperaturesByCity(String data) {
        Map<String, List<Double>> cityTemps = new HashMap<>();

        for (String line : parseIntoLines(data)) {
            String[] split = line.split(":");

            String city = split[0];
            List<Double> temps = tempsList(split[1].split(","));

            cityTemps.put(city, temps);
        }

        return cityTemps;
    }

    private static List<Double> tempsList(String[] list) {
        List<Double> tempList = new ArrayList<>();
        for (String temp : list) {
            temp = temp.split(" ")[1];
            tempList.add(Double.parseDouble(temp));
        }
        return tempList;
    }
}
