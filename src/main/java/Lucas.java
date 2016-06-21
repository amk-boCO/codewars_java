public class Lucas {
    public static int lucasnum (int n){
        int output;

        if ( n == 1) {
            output = 1;
        } else if ( n == 0) {
            output = 2;
        } else if (n > 0) {
            output = lucasnum(n - 1) + lucasnum(n - 2);
        } else {
            output = lucasnum(n + 2) - lucasnum(n + 1);
        }

        return output;
    }
}