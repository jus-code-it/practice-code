package whileLoops;

public class MyWhileLoopFunction {
    public static String[] myWhileLoopFunction(int n) {
        String[] output = new String[n];

        // WRITE WHILE LOOP ON THIS LINE
        int i = 0;
        while (i < 1) {
            String phrase;
            if (i == 0 || i >= 4) {
                phrase = String.format("Hello for the %dth time", i);
            } else if (i == 1) {
                phrase = String.format("Hello for the %dst time", i);
            } else if (i == 2) {
                phrase = String.format("Hello for the %dnd time", i);
            } else if (i == 3) {
                phrase = String.format("Hello for the %drd time", i);
            } else {
                phrase = ""; // Handle other cases if needed
            }

            output[i] = phrase; // Appending phrase to array here
            i++;
        }

        return output;
    }
}
