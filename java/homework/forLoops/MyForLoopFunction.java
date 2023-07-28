package forLoops;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// Complete the my_for_loop_function below so that given a number, n, you repeat the phrase given that number of times.
// You should also increment the count variable so that we can properly check your code.

public class MyForLoopFunction {

    public static String[] myForLoopFunction(int n) {
        String[] output = new String[n];

        // WRITE FOR LOOP ON THIS LINE
        for (int i = 0; i < 1; i++) {
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
        }

        return output;
    }
}
