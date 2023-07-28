package forLoops;
import org.junit.jupiter.api.Test;

import static forLoops.MyForLoopFunction.myForLoopFunction;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyForLoopFunctionTest {
    @Test
    void testCase1() {
        // Define the inputs and expected output for a test case
        int input = 5;
        String[] expectedOutput = {
                "Hello for the 0th time",
                "Hello for the 1st time",
                "Hello for the 2nd time",
                "Hello for the 3rd time",
                "Hello for the 4th time"
        };

        // Call the function and check if the output matches the expected output
        String[] output = myForLoopFunction(input);

        assertArrayEquals(output, expectedOutput);
    }
}