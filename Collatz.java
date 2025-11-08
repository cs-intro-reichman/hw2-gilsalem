public class Collatz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String mood = args[1];

        for (int i = 1; i <= n; i++) {
            int newnum = i;
            int count1 = 0;

            // אם במצב verbose – נדפיס את המספר ההתחלתי
            if (mood.equals("v")) {
                System.out.print(i + " ");
            }

            // נמשיך לחשב עד שמגיעים ל-1
            while (newnum != 1) {
                if (newnum % 2 == 0) {
                    newnum = newnum / 2;
                } else {
                    newnum = (3 * newnum) + 1;
                }
                count1++;
                if (mood.equals("v")) {
                    System.out.print(newnum + " "); // נוסיף רווח אחרי כל מספר
                }
            }

            // הדפסה של מספר הצעדים בסוף הרצף
            if (mood.equals("v")) {
                System.out.println("(" + count1 + ")");
            }
        }

        // הודעה מסכמת
        System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
    }
}
