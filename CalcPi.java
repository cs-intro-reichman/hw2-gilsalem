public class CalcPi {
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        double approxPi = 0.0;

        for (int i = 0; i < n; i++) {
            approxPi += Math.pow(-1, i) / (2 * i + 1);
        }

        approxPi = approxPi * 4;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + approxPi);
    }
}
