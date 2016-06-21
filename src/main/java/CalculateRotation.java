public class CalculateRotation {
    static int shiftedDiff(String hoop, String pooh) {
        for (int i = 0; i < hoop.length(); i++) {
            if (rotateString(hoop, i).equals(pooh)) return i;
        }
        return -1;
    }

    private static String rotateString(String str, int numPositions) {
        if (numPositions == 0) return str;

        String newStr = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
        return rotateString(newStr, numPositions - 1);
    }
}
